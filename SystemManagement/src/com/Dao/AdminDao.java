package com.Dao;

import java.util.List;

import com.entity.Admin;

public interface  AdminDao {
public void addAdmin(Admin admin);
public void delAdmin(Admin admin);
public void updateAdmin(Admin admin);
public Admin getAdminById(int id);
public List<Admin> getAdmin();
public List<Admin> findByExaple(Admin admin);
}
