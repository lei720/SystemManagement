package com.struts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;




import com.entity.Project;
import com.entity.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IProject;
import com.service.IUser;


public class ProjectAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IProject project;
	private ArrayList<Project> projects;
	private Project pro;
	private Set<User> users;
	private IUser iUser;



	public IUser getiUser() {
		return iUser;
	}
	public void setiUser(IUser iUser) {
		this.iUser = iUser;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Project getPro() {
		return pro;
	}
	public void setPro(Project pro) {
		this.pro = pro;
	}
	
	
public ArrayList<Project> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
public IProject getProject() {
		return project;
	}
	public void setProject(IProject project) {
		this.project = project;
	}
public String execute() throws Exception
{
	projects=(ArrayList<Project>) project.getProjects();
	//users=user.getUser();

	
	return SUCCESS;
}
public String addProject() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	if(pro.getProjectname()!=null&&!pro.getProjectname().equals(""))
	{
	project.addProject(pro);
	
	
	return SUCCESS;
	}
	else {
		request.setAttribute("erropage", "工程名不能为空");
		return "erro";
	}
	
	}
public String delProject() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	String projectid=request.getParameter("projectid");
	int id=Integer.parseInt(projectid);
	//System.out.println("id"+id);
	pro.setProjectid(id);
	project.delProject(pro);
return	SUCCESS;
}
public String getSingleProject() throws Exception
{
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	String projectid=request.getParameter("projectid");
	int id=Integer.parseInt(projectid);
	
	pro= project.getProject(id);
	
	//request.setAttribute("proj", proj);
	return SUCCESS;
}
public String editeSingleProject() throws Exception
{
	
	ActionContext actionContext=ActionContext.getContext();
	HttpServletRequest request=(HttpServletRequest) actionContext.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	if(pro.getProjectname().equals("")||pro.getProjectname()==null)
	{
		request.setAttribute("namerro", "工程名不能为空！");
		return "erro";
	}
	users=pro.getUsers();
	for(User u:users)
	{
		String value=request.getParameter(u.getUserid().toString()).trim();
		if(value.equals(""))
		{
			u.setProject(null);
		}
		else {
			u.setUsername(value);
		}		
		iUser.updateUser(u);
	}
	project.updateProject(pro);
	//request.setAttribute("proj", proj);
	return SUCCESS;
}
}
