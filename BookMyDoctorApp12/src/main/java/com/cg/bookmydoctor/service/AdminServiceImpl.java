package com.cg.bookmydoctor.service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookmydoctor.dto.*;
import com.cg.bookmydoctor.exception.AdminException;
import com.cg.bookmydoctor.dao.*;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private IAdminDao adminDao;

	@Override
	public Admin addAdmin(Admin admin) {
		if(admin == null) {
			throw new AdminException("Passed object can't be null");
		} else {
			return adminDao.save(admin);
		}
	}

	@Override
	public Admin removeAdmin(Admin admin) {
		Admin adm =admin;
		Optional<Admin> docdb = adminDao.findById(admin.getAdminId());
		if(docdb.isPresent()) {
			adminDao.delete(admin);	
		} else {
			throw new AdminException("The passed object can't be null");
		}
		return adm;	
	}

	@Override
	public Admin viewAdmin(Admin admin) {
		Optional<Admin> adminDb = this.adminDao.findById(admin.getAdminId());
		if(adminDb.isPresent()) {
			return adminDb.get();
		}
		else {
			throw new AdminException("Record not found with id : " + admin.getAdminId());
		}

	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Optional<Admin> adminDb = this.adminDao.findById(admin.getAdminId());
		if (adminDb.isPresent()) {
			adminDao.save(admin);
		} 
		else
			throw new AdminException("Airport with code: " + admin.getAdminId() + " not exists");
		return admin;

	}

}

