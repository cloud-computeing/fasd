package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.ModeratorMapper;
import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.service.ModeratorService;
@Service
public class ModeratorServiceImpl implements ModeratorService {
@Autowired
private ModeratorMapper moderatorMapper;
//模糊查询版主
	public List<Moderator> someModerators(String name) throws Exception {
		return moderatorMapper.selectBy(name);
	}
//全部的版主信息显示 
	public List<Moderator> allModerators() throws Exception {
		return moderatorMapper.SelectAllModerators();
	}
//版主的详细信息显示
	public Moderator selectModerator(Integer id) throws Exception {
		return moderatorMapper.selectByPrimaryKey(id);
	}
//版主的信息插入
	public int insertModerator(Moderator moderator) throws Exception {
		return moderatorMapper.insert(moderator);
	}
//版主的信息删除
	public int deletModerator(Integer id) throws Exception {
		return moderatorMapper.deleteByPrimaryKey(id);
	}
//版主信息的更新
	public int updateModerator(Moderator moderator) throws Exception {
		return moderatorMapper.updateByPrimaryKey(moderator);
	}
//查询版主管理的板块
	public List<Plate> somePlates(Integer id) throws Exception {
		return moderatorMapper.selectPlate(id);
	}

}
