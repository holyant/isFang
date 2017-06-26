package web.action;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Label;
import model.Product;
import model.ProductQuery;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import service.ProManageService;
import util.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProManageAction extends ActionSupport implements ServletRequestAware,SessionAware{
	Logger logger = Logger.getLogger(this.getClass());
	private HttpServletRequest request;
	private Map<String, Object> session;
	@Autowired
	private ProManageService proManageService;
	private Pager pager;
	private ProductQuery query;
	private Product product;
	
	public String init(){
		List<Label> list = null;
		try {
			list = this.proManageService.getLabels();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		
		return "search";
	}
	public String showProducts(){
		List<Product> list = null;
		boolean re = false;
		try {
			list = this.proManageService.getPros(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.put("list", list);
		ctx.put("query", query);
		return SUCCESS;
	}
	
	public void getProducts(){
		List<Product> list = null;
		boolean re = false;
		try {
			list = this.proManageService.getPros(query);
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			JSONObject json = new JSONObject();
			JSONArray js = JSONArray.fromObject(list);
			out.write(js.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String modifyInit(){
		Product p = null;
		try {
			p = this.proManageService.getPros(query).get(0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ActionContext.getContext().put("p", p);
		return "modifyFrame";
	}
	
	public String modifyUpdate(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String cost = request.getParameter("cost");
		Product p = new Product(request.getParameter("id"),
				request.getParameter("name"),
				request.getParameter("size"),
				request.getParameter("unit"),
				"".equals(cost)?null:Double.parseDouble(cost),
				request.getParameter("memo"));
		try {
			if(this.proManageService.updateProduct(p)!=1){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public String addProductInit(){
		List<Label> labels = null;
		try {
			labels = this.proManageService.getLabels();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", labels);
		return "add";
	}
	public String addProduct(){
		try {
			if("".equals(product.getName())){
				this.addFieldError("addError", "商品名称不能为空!");
				this.request.setAttribute("p", product);
				return "add";
			}
			
			if(!this.proManageService.addPro(product)){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public String delete(){
		String id = this.request.getParameter("id");
		try {
			this.proManageService.deleteProductById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "init";
	}
	
	
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public ProductQuery getQuery() {
		return query;
	}
	public void setQuery(ProductQuery query) {
		this.query = query;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
}
