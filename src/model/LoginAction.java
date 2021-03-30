package model;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.LoginServiceImpl;

public class LoginAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	Properties prop=(Properties)request.getServletContext().getAttribute("properties");
	HttpSession session=request.getSession();
	
	service.LoginService loginservice=LoginServiceImpl.getLoginServiceImpl(prop);
	if(loginservice.checkUser(uname, upass)) {
		if(loginservice.checkFlag(uname)) {
			session.setAttribute("uname", uname);
			loginservice.updateFlag(uname, 1);
			return "login.success";
		}
		else {
			return "login.already";
		}
	}else {
		return "login.failure";
	}
	
	
	
}
}
