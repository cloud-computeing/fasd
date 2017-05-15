package com.gzu.bbs.service;

/**
 * 这个是板块的服务
 * @author Lenovo
 *
 */

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.PlateCustom;
@Service
public interface PlateService {
	public Map<String,List<PlateCustom>>queryAllPlateByType()throws Exception;
	//查看板块信息
	public List<Plate> allPlates()throws Exception;
	//板块的详细信息
	public Plate onePlate(Integer id)throws Exception;
	//板块的模糊查询
	public List<Plate> somePlates(String id)throws Exception;
	//添加板块
	public int insertPlate(Plate plate)throws Exception;
	//删除板块
	public int deletPlate(Integer id)throws Exception;
	//修改板块
	public int updatePlate(Plate plate)throws Exception;
}
