package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.LikeVo;


@Service
public interface PostService {
	//分页
	public List<PostCustom> queryPostPage(PostVo postVo) throws Exception;
	//查询某类帖子的总数
	public int querySumPost(PostVo postVo) throws Exception;
	//根据id查询帖子
	public PostCustom queryPostById(Integer id) throws Exception;
	//点赞
	public int like(LikeVo likeVo);
	//用户点击帖子，点击数甲1
	public int clickamount(Integer id) throws Exception;
}
