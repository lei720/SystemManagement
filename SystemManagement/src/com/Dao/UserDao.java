package com.Dao;

import java.util.List;

import com.entity.Project;
import com.entity.User;

public interface UserDao {
public void addUser(User user);
public void delUser(User user);
public void updateUser(User user);
public User getUserById(int id);
public List<User> getUser();
public List<User> getUserByproper(String propety,Project value);
}
