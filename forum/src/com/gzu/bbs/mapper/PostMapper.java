package com.gzu.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzu.bbs.pojo.Post;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostExample;
import com.gzu.bbs.pojo.PostVo;

public interface PostMapper {
    int countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(PostCustom record);

    List<Post> selectByExampleWithBLOBs(PostExample example);

    List<Post> selectByExample(PostExample example);

    Post selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExampleWithBLOBs(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKeyWithBLOBs(Post record);

    int updateByPrimaryKey(Post record);
    //根据postvo类里面的条件来查询post在进行分页
    List<PostCustom> selectPostPage(PostVo postVo);
    //查询某类帖子总数 
    int selectSumPost(PostVo postVo);
    //根据帖子id查询帖子详细信息
    PostCustom selectPostById(Integer id);
    //点赞
    int updateLike(Integer id);
    //点击数加一
    int updateClickamount(Integer id);
}