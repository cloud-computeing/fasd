package com.gzu.bbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.AdminMapper;
import com.gzu.bbs.pojo.Admin;
import com.gzu.bbs.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;
	
	public Admin queryAdmin(Integer id) throws Exception {
		Admin admin=adminMapper.selectByPrimaryKey(id);
		return admin;
	}

}
