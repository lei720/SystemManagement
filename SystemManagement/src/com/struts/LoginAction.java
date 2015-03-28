package com.struts;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.entity.Admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAdmin;

public class LoginAction extends ActionSupport{
	Admin admin;
	IAdmin iAdmin;
	
	public IAdmin getiAdmin() {
		return iAdmin;
	}
	public void setiAdmin(IAdmin iAdmin) {
		this.iAdmin = iAdmin;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -8819870618299099384L;
public String execute() throws Exception
{
	System.out.println("账号"+admin.getAdminname());
	
	if(admin.getAdminname().equals(""))
	{
		ActionContext actionContext=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	request.setAttribute("erro", "用户名不能为空!");
	return ERROR;
	}
	if(admin.getAdminname().equals(""))
	{
		ActionContext actionContext=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	request.setAttribute("erro", "密码不能为空!");
	return ERROR;
	}
	if(iAdmin.findByAdmins(admin).size()>0)
	{
		ActionContext actionContext=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		HttpSession session=request.getSession();
		session.setAttribute("admin", admin.getAdminname());
		//System.out.println(iAdmin.findByAdmins(admin).size());
		return SUCCESS;
	}
	else {
		ActionContext actionContext=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		request.setAttribute("erro", "用户名或密码错误！");
		return ERROR;
	}
	//return null;
	
}
public String loginout() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	HttpSession session=request.getSession();
	session.removeAttribute("admin");
	admin.setAdminname("");
	admin.setAdminpassword("");
	System.out.println("remove");
	//session.invalidate();
	return SUCCESS;
}
public String getacount() throws Exception
{
	
	admin=iAdmin.getAdmin(1);
	return SUCCESS;
}
public String editeacount() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	
	if(admin.getAdminname().equals(""))
	{
		request.setAttribute("nameerro", "用户名不能为空！");
		return "erro";
	}
	if(admin.getAdminpassword().equals(""))
	{
		
		request.setAttribute("paswderro", "密码不能为空！");
		return "erro";
	}
	iAdmin.updateAdmin(admin);
	return SUCCESS;
}
}
