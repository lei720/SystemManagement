package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Integer projectid;
	private String projectname;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(String projectname) {
		this.projectname = projectname;
	}

	/** full constructor */
	public Project(String projectname, Set users) {
		this.projectname = projectname;
		this.users = users;
	}

	// Property accessors

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}