package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PlatetypeCustom;
@Service
public interface PlatetypeService {
	
		public List<PlatetypeCustom> queryAllType()throws Exception;

	
}
