package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;


@Service
public interface PostService {
	//分页
	public List<PostCustom> queryPostPage(PostVo postVo) throws Exception;
	//查询某类帖子的总数
	public int querySumPost(PostVo postVo) throws Exception;
}
