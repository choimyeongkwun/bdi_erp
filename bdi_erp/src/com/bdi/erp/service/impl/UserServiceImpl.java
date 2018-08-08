package com.bdi.erp.service.impl;

import com.bdi.erp.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String id, String pwd) {
		if(id==null || pwd==null) {
			return false;
		}
		
		if(id.equals("redfila")) {
			if(pwd.equals("r1r2r3")) {
				return true;
			}
		}
		return false;
	}

}
