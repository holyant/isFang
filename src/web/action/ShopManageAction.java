package web.action;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductQuery;
import model.Shop;
import model.ShopQuery;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import service.ProManageService;
import service.ShopManageService;
import util.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShopManageAction extends ActionSupport implements ServletRequestAware,SessionAware{
	Logger logger = Logger.getLogger(this.getClass());
	private HttpServletRequest request;
	private Map<String, Object> session;
	@Autowired
	private ShopManageService shopManageService;
	private Pager pager;
	private ShopQuery query;
	private Shop shop;
	
	public String init(){
		List<Shop> list = null;
		boolean re = false;
		try {
			list = this.shopManageService.getShops(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.put("list", list);
		ctx.put("query", query);
		return SUCCESS;
	}
	
	
	public String modifyInit(){
		Shop s = null;
		try {
			s = this.shopManageService.getShops(query).get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ActionContext.getContext().put("s", s);
		return "modifyFrame";
	}
	
	public String modifyUpdate(){
		Shop s = new Shop(request.getParameter("id"),
				request.getParameter("name"),
				request.getParameter("person"),
				request.getParameter("addr"),
				request.getParameter("phone"),
				request.getParameter("memo"));
		try {
			if(this.shopManageService.updateShop(s)!=1){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public String addShopInit(){
//		try {
//			List<String> labels = this.shopManageService.getLabels();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return "add";
	}
	public String addShop(){
		try {
			if("".equals(shop.getName())){
				this.addFieldError("addError", "店铺名称不能为空!");
				this.request.setAttribute("s", shop);
				return "add";
			}
			
			if(!this.shopManageService.addShop(shop)){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public String deleteShop(){
		try {
			this.shopManageService.deleteShop(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public ShopQuery getQuery() {
		return query;
	}
	public void setQuery(ShopQuery query) {
		this.query = query;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}


	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}
