package com.serviceimpl;

import java.util.List;

import com.Dao.ProjectDao;
import com.entity.Project;
import com.service.IProject;

public class IProjectImpl implements IProject{
private ProjectDao projectDao;
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		projectDao.addProject(project);
	}

	@Override
	public void delProject(Project project) {
		// TODO Auto-generated method stub
		projectDao.delProject(project);
	}

	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return projectDao.getProjectById(id);
	}

	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return projectDao.getProject();
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		projectDao.updateProject(project);
	}

	@Override
	public List<Project> findProjects(Project project) {
		// TODO Auto-generated method stub
		return projectDao.getProjects(project);
	}

}
