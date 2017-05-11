package com.gzu.bbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PlateCustom;
@Service
public interface PlateService {
	public Map<String,List<PlateCustom>>queryAllPlateByType()throws Exception;
}
