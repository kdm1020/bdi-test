package com.sp.bdi.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.bdi.test.dao.UserDAO;
import com.sp.bdi.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO udao;
	@Override
	public List<Map<String, String>> getUserList() {
		// TODO Auto-generated method stub
		return udao.SelectUserList();
	}

}
