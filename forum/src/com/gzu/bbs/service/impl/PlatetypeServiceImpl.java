package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.ModeratorMapper;
import com.gzu.bbs.mapper.PlatetypeMapper;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.service.PlatetypeService;
@Service
public class PlatetypeServiceImpl implements PlatetypeService {
@Autowired
private PlatetypeMapper platetypeMapper;
@Autowired
private ModeratorMapper moderatorMapper;
	//这里是查询所有的板块类型的信息
	public List<PlatetypeCustom> queryAllType() throws Exception {
		List<PlatetypeCustom>all=platetypeMapper.selectAllType();
		return all;
	}
	//这里是删除板块类型的信息
	public int deletPlateType(Integer id) throws Exception {
		return platetypeMapper.deleteByPrimaryKey(id);
	}
	//插入板块类型的信息
	public int insertPlateType(Platetype plateType) throws Exception {
		return platetypeMapper.insert(plateType);
	}
	//更新板块类型的信息
	public int updatePlateType(Platetype platetype) throws Exception {
		return platetypeMapper.updateByPrimaryKey(platetype);
	}
	//查看板块类型的详细信息
	public Platetype onePlateType(Integer id) throws Exception {
		return platetypeMapper.selectByPrimaryKey(id);
	}
	//板块类型对应的板块
	public List<Plate> somePlate(Integer id) throws Exception {
		return moderatorMapper.somePlate(id);
	}
	

}
