package com.service;

import java.util.List;

import com.entity.Project;



public interface IProject {
public void addProject(Project project);
public void delProject(Project project);
public Project getProject(int id);
public void updateProject(Project project);
public List<Project> getProjects();
public List<Project> findProjects(Project project);
}
