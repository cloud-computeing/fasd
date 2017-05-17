package com.gzu.bbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.LikeVo;
import com.gzu.bbs.pojo.ReplyCustom;


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
	//添加评论
	public int insertReply(ReplyCustom reply)throws Exception;
	//查看某帖子评论
	public List<ReplyCustom> queryReplyByPid(Integer pid)throws Exception;
}
