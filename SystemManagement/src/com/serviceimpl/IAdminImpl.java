package com.serviceimpl;

import java.util.List;

import com.Dao.AdminDao;
import com.entity.Admin;
import com.service.IAdmin;

public class IAdminImpl implements IAdmin{
private AdminDao adminDao;
	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.addAdmin(admin);
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public void delAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.delAdmin(admin);
	}

	@Override
	public Admin getAdmin(int id) {
		// TODO Auto-generated method stub
	 return	adminDao.getAdminById(id);
	}

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		return adminDao.getAdmin();
	}

	@Override
	public List<Admin> findByAdmins(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.findByExaple(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.updateAdmin(admin);
	}

}
