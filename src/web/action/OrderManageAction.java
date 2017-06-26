package web.action;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Label;
import model.Pager;
import model.Product;
import model.ProductQuery;
import model.SaleOrderQuery;
import model.SaleProduct;
import model.Shop;
import model.vo.SaleOrderInfo;
import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import service.OrderManageService;
import service.ProManageService;
import util.MyProperties;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class OrderManageAction extends ActionSupport implements ServletRequestAware,SessionAware{
	Logger logger = Logger.getLogger(this.getClass());
	private HttpServletRequest request;
	private Map<String, Object> session;
	@Autowired
	private OrderManageService orderManageService;
	@Autowired
	private ProManageService proManageService;
	private SaleOrderQuery query;
	private Pager pager;
	public String init(){
		List<Label> list = null;
		List<Shop> shops = null;
		List<Product> pros = null;
		try {
			list = this.proManageService.getLabels();
			shops = this.orderManageService.getClients("");
			pros = this.proManageService.getPros(new ProductQuery("1"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.setAttribute("shops", shops);
		request.setAttribute("pros", pros);
		return "init";
	}
	public String getClient(){
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			HttpServletRequest request = ServletActionContext.getRequest();
			String attribute = (String)request.getParameter("queryStr");
			attribute = "";
			List<Shop> shops = this.orderManageService.getClients(attribute);
			JSONArray js = JSONArray.fromObject(shops);
			out.write(js.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void save(){
		HttpServletRequest request =  ServletActionContext.getRequest();
		String prosInfo = (String)request.getParameter("prosInfo");
		String label = (String)request.getParameter("label");
		Integer client = Integer.parseInt((String)request.getParameter("client"));
		String orderDate = (String)request.getParameter("orderDate");
		JSONArray ja = JSONArray.fromObject(prosInfo);
		List<SaleProduct> salePros = (List<SaleProduct>)JSONArray.toCollection(ja, SaleProduct.class);
		
		try {
			PrintWriter out = ServletActionContext.getResponse().getWriter();
			String serial = this.orderManageService.saveSaleOrder(orderDate,label,client,salePros);
			out.write(serial);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void downLoad(){
		HttpServletResponse response = ServletActionContext.getResponse();
		String serial = ServletActionContext.getRequest().getParameter("serial");
		FileInputStream fis = null;  
        OutputStream os = null;  
        
        try {  
        	Properties properties = MyProperties.getProperties("/sys.properties");
            fis = new FileInputStream(properties.getProperty("orderFilePath")+serial+".xls");  
            
            response.reset();
            response.addHeader("content-disposition", "attachment;filename=\""
					+ java.net.URLEncoder.encode(serial + ".xls", "UTF-8")
					+ "\"");
            response.setContentType("application/vnd.ms-excel; charset=GBK");
            os = response.getOutputStream();
            byte[] mybyte = new byte[8192];  
            int len = 0;  
            while ((len = fis.read(mybyte)) != -1) {  
                os.write(mybyte, 0, len);  
            }  
            os.close();  
        }catch (IOException e) {  
            e.printStackTrace();  
        }  
	}
	
	public String showSearchFrame(){
		
		try {
			List<Shop> shops = this.orderManageService.getClients(null);
			this.request.setAttribute("shops", shops);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "searchFrame";
	}
	
	public String showOrders(){
		try {
			pager = this.orderManageService.showOrders(pager,query);
			this.request.setAttribute("pager", pager);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "orderList";
	}
	
	public String deleteOrder(){
		try {
			this.orderManageService.deleteOrder(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "searchFrame";
	}
	
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	public SaleOrderQuery getQuery() {
		return query;
	}
	public void setQuery(SaleOrderQuery query) {
		this.query = query;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
}


