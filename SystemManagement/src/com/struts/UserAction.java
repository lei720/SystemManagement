package com.struts;

import java.util.ArrayList;



import javax.servlet.http.HttpServletRequest;




import com.entity.Project;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IProject;
import com.service.IUser;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> userlist;
	private IUser iUser;
	private User user;
	private IProject iProject;
public IProject getiProject() {
		return iProject;
	}
	public void setiProject(IProject iProject) {
		this.iProject = iProject;
	}
public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
public IUser getiUser() {
		return iUser;
	}
	public void setiUser(IUser iUser) {
		this.iUser = iUser;
	}
public ArrayList<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(ArrayList<User> userlist) {
		this.userlist = userlist;
	}
public String execute() throws Exception
{
	userlist=(ArrayList<User>) iUser.getUser();
	return SUCCESS;
}
public String Useradd() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	//String projectname=request.getParameter("projectname");

	if(user.getUserpostion().equals("工程师"))
	{
		user.setHouruserpage(200.0);
	}
	else
	{
		user.setHouruserpage(100.0);
	}
	String projectid=request.getParameter("projectid");
		if(projectid!=null&&!projectid.equals(""))
		{
			int id=Integer.parseInt(projectid);
			//Project project=new Project();
			//project.setProjectid(id);
			//int size=iProject.findProjects(project).size();
			Project project=iProject.getProject(id);
			if(project==null)
			{
				
				//session.setAttribute("projecterro", "该工程不存在");
				request.setAttribute("projecterro", "该工程不存在");
				return "erro";
			}
			//project.setProjectid(id);
			user.setProject(project);
			iUser.addUser(user);
		}
		else {
			user.setProject(null);
			iUser.addUser(user);
		}
		
		return SUCCESS;
	

}
public String delUser() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	String id=request.getParameter("userid");
	int userid=Integer.parseInt(id);
	user.setUserid(userid);
	iUser.delUser(user);
	return SUCCESS;
}
public String getSingleUser() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	String userid=request.getParameter("userid");
	int id=Integer.parseInt(userid);
	user=iUser.getUserByid(id);
	
	return SUCCESS;
}
public String editeUser() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	
	if(user.getUserpostion().equals("工程师"))
	{
		user.setHouruserpage(200.0);
	}
	else
	{
		user.setHouruserpage(100.0);
	}
	String projectid=request.getParameter("projectid").trim();
	
	
	String projectname=request.getParameter("projectname").trim();
	
		if(projectid!=null&&!projectid.equals(""))
		{
			int id=Integer.parseInt(projectid);
			//Project project=new Project();
			//project.setProjectid(id);
			//int size=iProject.findProjects(project).size();
			Project project=iProject.getProject(id);
			if(project==null)
			{
				request.setAttribute("projecterro", "该工程编号不存在!");
				return "erro";
			}
			//project.setProjectid(id);
			if(!project.getProjectname().equals(projectname))
			{
				request.setAttribute("projectnameerro", "该工程名称不存在(必须填写)!");
				return "erro";
			}
			user.setProject(project);
			iUser.updateUser(user);
		}
		else {
			
			user.setProject(null);
			iUser.updateUser(user);
		}
		
		return SUCCESS;
	
}
public String Searchsalary() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	String projectid=request.getParameter("userid").trim();
	int id=Integer.parseInt(projectid);
	user=iUser.getUserByid(id);
	return SUCCESS;
}
}
