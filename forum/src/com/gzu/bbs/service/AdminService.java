package com.gzu.bbs.service;


import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.Admin;

@Service
public interface AdminService {
	public Admin queryAdmin(Integer id)throws Exception;
}
