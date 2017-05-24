package com.gzu.bbs.mapper;

import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.pojo.PlatetypeExample;
import com.gzu.bbs.pojo.PlatetypeVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatetypeMapper {
    int countByExample(PlatetypeExample example);

    int deleteByExample(PlatetypeExample example);

    int deleteByPrimaryKey(Integer platetypeid);

    int insert(Platetype record);

    int insertSelective(Platetype record);

    List<Platetype> selectByExample(PlatetypeExample example);

    Platetype selectByPrimaryKey(Integer platetypeid);

    int updateByExampleSelective(@Param("record") Platetype record, @Param("example") PlatetypeExample example);

    int updateByExample(@Param("record") Platetype record, @Param("example") PlatetypeExample example);

    int updateByPrimaryKeySelective(Platetype record);
    
    //查询所有板块类型
    List<PlatetypeCustom> selectAllType();

    int updateByPrimaryKey(Platetype record);
    List<Platetype> mohu(PlatetypeVo platetypeVo)throws Exception;
    int someCount()throws Exception;
}