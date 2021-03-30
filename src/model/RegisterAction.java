package model;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginServiceImpl;

public class RegisterAction extends Action {
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	try {
		UserDTO userDTO=new UserDTO();
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		String uid=request.getParameter("uid");
		Properties prop=(Properties)request.getServletContext().getAttribute("properties");
		service.LoginService loginservice=LoginServiceImpl.getLoginServiceImpl(prop);
		userDTO.setUid(Integer.parseInt(uid));
		userDTO.setUname(uname);
		userDTO.setUpass(upass);
		userDTO.setFlag(0);
		loginservice.registerUser(userDTO);
		
		return "register.success";
	
	}catch(Exception E){
		E.printStackTrace();
		return null;
		
	}
		
}
}
