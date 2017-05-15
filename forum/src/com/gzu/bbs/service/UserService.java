package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.User;

@Service
public interface UserService {
		//用户的模糊查询
		public List<User> someUsers(String name)throws Exception;
		//全部的用户查询
		public List<User> allUser()throws Exception;
		//用户的详细信息
		public User selectUser(String id)throws Exception;
		//用户的添加
		public int insertUser(User user)throws Exception;
		//用户的删除
		public int deletUser(String id)throws Exception;
		//用户更新信息
		public int updateUser(User user)throws Exception;
		//分页
		//public List<User> queryUserPage(UserVo userVo) throws Exception;
}
