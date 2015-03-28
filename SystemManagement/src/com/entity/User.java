package com.entity;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Project project;
	private String username;
	private String usersex;
	private String userpostion;
	private Double houruserpage;
	private Double userpagenum;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Project project, String username, String usersex,
			String userpostion, Double houruserpage, Double userpagenum) {
		this.project = project;
		this.username = username;
		this.usersex = usersex;
		this.userpostion = userpostion;
		this.houruserpage = houruserpage;
		this.userpagenum = userpagenum;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersex() {
		return this.usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUserpostion() {
		return this.userpostion;
	}

	public void setUserpostion(String userpostion) {
		this.userpostion = userpostion;
	}

	public Double getHouruserpage() {
		return this.houruserpage;
	}

	public void setHouruserpage(Double houruserpage) {
		this.houruserpage = houruserpage;
	}

	public Double getUserpagenum() {
		return this.userpagenum;
	}

	public void setUserpagenum(Double userpagenum) {
		this.userpagenum = userpagenum;
	}

}