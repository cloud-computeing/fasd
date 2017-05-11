package com.gzu.bbs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.PlateMapper;
import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.PlatetypeService;
@Service
public class PlateServiceImpl implements PlateService {
	@Autowired
	private PlatetypeService platetypeService;
	
	@Autowired
	private PlateMapper plateMapper;

	public Map<String,List<PlateCustom>> queryAllPlateByType() throws Exception {
		Map<String,List<PlateCustom>> allPlate=new HashMap<String,List<PlateCustom>>();
		List<PlateCustom>Plates=new ArrayList<PlateCustom>();
		List<PlatetypeCustom>allType=platetypeService.queryAllType();
		for(PlatetypeCustom pt:allType){
			Plates=plateMapper.selectByType(pt.getPlatetypeid());
			allPlate.put(pt.getPlatetypename(), Plates);
		}
		return allPlate;
	}
	
	
}
