package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.PlatetypeMapper;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.service.PlatetypeService;
@Service
public class PlatetypeServiceImpl implements PlatetypeService {
@Autowired
private PlatetypeMapper platetypeMapper;
	public List<PlatetypeCustom> queryAllType() throws Exception {
		List<PlatetypeCustom>all=platetypeMapper.selectAllType();
		return all;
	}

}
