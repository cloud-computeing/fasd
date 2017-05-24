package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.UserMapper;
import com.gzu.bbs.pojo.User;
import com.gzu.bbs.pojo.UserVo;
import com.gzu.bbs.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper userMapper;
	
	public List<User> someUsers(String name) throws Exception {
		return userMapper.someUser(name);
	}

	public List<User> allUser() throws Exception {
		return userMapper.allUser();
	}

	public User selectUser(String id) throws Exception {
		return userMapper.selectByPrimaryKey(id);
	}

	public int insertUser(User user) throws Exception {
		return userMapper.insert(user);
	}

	public int deletUser(String id) throws Exception {
		return userMapper.deleteByPrimaryKey(id);
	}

	public int updateUser(User user) throws Exception {
		return userMapper.updateByPrimaryKey(user);
	}

	public List<User> mohu(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.mohu(userVo);
	}

	public int someCount() throws Exception {
		// TODO Auto-generated method stub
		return userMapper.someCount();
	}

	

}
