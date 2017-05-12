package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;


@Service
public interface PostService {
	public List<PostCustom> queryPostPage(PostVo postVo) throws Exception;
}
