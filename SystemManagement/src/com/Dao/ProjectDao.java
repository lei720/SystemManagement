package com.Dao;

import java.util.List;

import com.entity.Project;

public interface  ProjectDao {
public void addProject(Project project);
public void delProject(Project projetct);
public void updateProject(Project project);
public Project getProjectById(int project);
public List<Project> getProject();
public List<Project> getProjects(Project project);
}
