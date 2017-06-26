package web.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction{
	public static final String LOGIN_KEY = "LOGIN";
	@Autowired
	private UserService userService;
	
	public String valideUserInfo(){
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST); 
		String email = (String) request.getParameter("email");
		String password = (String) request.getParameter("password");
		try {
			User user = userService.getUserByStaffId(email);
			if(user==null||!user.getPwd().equals(password)){
				request.getSession().setAttribute("errorMsg", "账户或密码错误!");
				return "loginFrame";
			}
			request.getSession().setAttribute(LOGIN_KEY, "user");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	
}
