package com.cg.bookmydoctor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookmydoctor.dto.Admin;
import com.cg.bookmydoctor.exception.AdminException;
import com.cg.bookmydoctor.service.AdminServiceImpl;


//@CrossOrigin("http://localhost:3500")
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired//(required = true)
	AdminServiceImpl adminservice ;

	@GetMapping("/viewAdmin")
	//@ExceptionHandler(AdminException.class)
	public Admin viewAdmin(@RequestBody Admin Admin) {
		return adminservice.viewAdmin(Admin);
	}

	//working
	@PostMapping("/addAdmin")
	@ExceptionHandler(AdminException.class)
	public Admin addAdmin(@RequestBody Admin Admin) {
		return adminservice.addAdmin(Admin);
	}
	
	//working
	@PutMapping("/updateAdmin")
	@ExceptionHandler(AdminException.class)
	public Admin updateAdmin(@RequestBody Admin Admin) {
		return adminservice.updateAdmin(Admin);
	}
	
	//working
	@DeleteMapping("/removeAdmin")
	@ExceptionHandler(AdminException.class)
	public Admin removeAdmin(@RequestBody Admin Admin) {
		return adminservice.removeAdmin(Admin);
	}
}
