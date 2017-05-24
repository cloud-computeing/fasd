package com.gzu.bbs.service;

import java.util.List;

/**
 * 这个是板块类型的服务 
 * @author Lenovo
 *
 */

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.pojo.PlatetypeVo;
@Service
public interface PlatetypeService {
	//所有的板块查询
		public List<PlatetypeCustom> queryAllType()throws Exception;
	//类型的删除
		public int deletPlateType(Integer id)throws Exception;
	//类型的添加
		public int insertPlateType(Platetype plateType)throws Exception;
	//类型的修改
		public int updatePlateType(Platetype platetype)throws Exception;
	//类型的详情
		public Platetype onePlateType(Integer id)throws Exception;
	//板块类型对应的板块
		public List<Plate> somePlate(Integer id)throws Exception;
		
		public List<Platetype> mohu(PlatetypeVo platetypeVo)throws Exception;
		public int count()throws Exception;
}
