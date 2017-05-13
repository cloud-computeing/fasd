package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.PostMapper;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.service.PostService;
@Service
public class PostServiceImpl implements PostService {
@Autowired
private PostMapper postMapper;
	public List<PostCustom> queryPostPage(PostVo postVo) throws Exception {
		List<PostCustom>allPost=postMapper.selectPostPage(postVo);
		return allPost;
	}
	public int querySumPost(PostVo postVo) throws Exception {
		int sum=postMapper.selectSumPost(postVo);
		return sum;
	}

}
