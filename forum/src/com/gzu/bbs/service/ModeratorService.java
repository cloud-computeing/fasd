package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Platetype;

/**
 * 这个是版主的服务
 * @author Lenovo
 *
 */

@Service
public interface ModeratorService {
	//版主的模糊查询
	public List<Moderator> someModerators(String name)throws Exception;
	//版主的查询（全部的版主查询）
	public List<Moderator> allModerators()throws Exception;
	//版主的详细信息
	public Moderator selectModerator(Integer id)throws Exception;
	//版主的添加
	public int insertModerator(Moderator moderator)throws Exception;
	//版主的删除
	public int deletModerator(Integer id)throws Exception;
	//版主的修改
	public int updateModerator(Moderator moderator)throws Exception;
	//查询版主管理的板块
	public List<Plate> somePlates(Integer id)throws Exception;
}
