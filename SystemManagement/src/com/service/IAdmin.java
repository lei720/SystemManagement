package com.service;

import java.util.List;

import com.entity.Admin;

public interface IAdmin {
public void addAdmin(Admin admin);
public void delAdmin(Admin admin);
public Admin getAdmin(int id); 
public List<Admin> getAdmins();
public List<Admin> findByAdmins(Admin admin);
public void updateAdmin(Admin admin);
}
