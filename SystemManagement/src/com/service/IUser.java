package com.service;

import java.util.List;

import com.entity.Project;
import com.entity.User;

public interface IUser {
public void addUser(User user);
public void delUser(User user);
public User getUserByid(int id);
public void updateUser(User user);
public List<User> getUser();
public List<User> findByproper(String property,Project value);
}
