package com.gzu.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.bbs.mapper.PostMapper;
import com.gzu.bbs.mapper.ReplyMapper;
import com.gzu.bbs.mapper.ThumpupnumMapper;
import com.gzu.bbs.pojo.LikeVo;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.ReplyCustom;
import com.gzu.bbs.service.PostService;
@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostMapper postMapper;
	
	@Autowired
	private ThumpupnumMapper thumpupnumMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	public List<PostCustom> queryPostPage(PostVo postVo) throws Exception {
		List<PostCustom>allPost=postMapper.selectPostPage(postVo);
		return allPost;
	}
	public int querySumPost(PostVo postVo) throws Exception {
		int sum=postMapper.selectSumPost(postVo);
		return sum;
	}
	public PostCustom queryPostById(Integer id) throws Exception {
		PostCustom postCustom=postMapper.selectPostById(id);
		return postCustom;
	}
	public int like(LikeVo likeVo){
		try {
			thumpupnumMapper.insert(likeVo.getToKey());
		} catch (Exception e) {
			return 0;
		}
		postMapper.updateLike(likeVo.getToKey().getPostid());
		return 1;
	}
	public int clickamount(Integer id) throws Exception {
		postMapper.updateClickamount(id);
		return 1;
	}
	public int insertReply(ReplyCustom reply) throws Exception {
		replyMapper.insertSelective(reply);
		return 1;
	}
	public List<ReplyCustom> queryReplyByPid(Integer pid) throws Exception {
		List<ReplyCustom>all=replyMapper.selectReplyByPid(pid);
		return all;
	}

}
