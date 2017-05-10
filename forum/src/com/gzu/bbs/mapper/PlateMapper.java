package com.gzu.bbs.mapper;

import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.PlateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateMapper {
    int countByExample(PlateExample example);

    int deleteByExample(PlateExample example);

    int deleteByPrimaryKey(Integer plateid);

    int insert(Plate record);

    int insertSelective(Plate record);

    List<Plate> selectByExample(PlateExample example);

    Plate selectByPrimaryKey(Integer plateid);

    int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateExample example);

    int updateByExample(@Param("record") Plate record, @Param("example") PlateExample example);

    int updateByPrimaryKeySelective(Plate record);

    int updateByPrimaryKey(Plate record);
}