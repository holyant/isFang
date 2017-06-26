package web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class WeiXinAction extends ActionSupport implements ServletRequestAware,SessionAware,ServletResponseAware{
	Logger logger = Logger.getLogger(this.getClass());
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, Object> session;
	
	String token = "holyant";
	public void getToken(){
		String signature = request.getParameter("signature");//用于验证是否微信服务器
		String timestamp = request.getParameter("timestamp");//时间戳
		String nonce = request.getParameter("nonce");//随机数
		String echostr = request.getParameter("echostr");//用于返回给微信服务器
		System.out.println("signature:"+signature+";timestamp:"+timestamp+";nonce:"+nonce+";echostr:"+echostr);
		//对token，timestamp，nonce进行字典排序，并sha1加密
		List list = new ArrayList<String>();
		list.add(timestamp);
		list.add(nonce);
		list.add(token);
		Collections.sort(list);
		StringBuffer str = new StringBuffer();
		for(int i=0;i<list.size();i++){
			str.append(list.get(i));
		}
		MessageDigest md;
		String signature2 = "";
		try {
			md = MessageDigest.getInstance("SHA-1");
			md.update(str.toString().getBytes());
			signature2 = md.digest().toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
//		if(signature2.equals(signature)){
//			return echostr;
//		}
		response.setCharacterEncoding("utf-8");  
        PrintWriter pw=null;  
        try {  
            pw = response.getWriter();  
            pw.write(nonce);  
        } catch (IOException e) {  
            e.printStackTrace();
        }  
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}
}
