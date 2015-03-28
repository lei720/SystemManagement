package com.serviceimpl;

import java.util.List;

import com.Dao.UserDao;
import com.entity.Project;
import com.entity.User;
import com.service.IUser;

public class IUserImpl implements IUser{
private UserDao userDao;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void delUser(User user) {
		// TODO Auto-generated method stub
		userDao.delUser(user);
	}

	@Override
	public User getUserByid(int id) {
		// TODO Auto-generated method stub
	 return	userDao.getUserById(id);
	 
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

	@Override
	public List<User> findByproper(String property, Project value) {
		// TODO Auto-generated method stub
		return userDao.getUserByproper(property, value);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}


	

	

}
