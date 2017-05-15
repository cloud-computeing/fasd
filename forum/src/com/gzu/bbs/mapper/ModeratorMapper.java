package com.gzu.bbs.mapper;

import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.ModeratorExample;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Platetype;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModeratorMapper {
    int countByExample(ModeratorExample example);

    int deleteByExample(ModeratorExample example);

    int deleteByPrimaryKey(Integer moderatorid);

    int insert(Moderator record);

    int insertSelective(Moderator record);

    List<Moderator> selectByExample(ModeratorExample example);

    Moderator selectByPrimaryKey(Integer moderatorid);

    int updateByExampleSelective(@Param("record") Moderator record, @Param("example") ModeratorExample example);

    int updateByExample(@Param("record") Moderator record, @Param("example") ModeratorExample example);

    int updateByPrimaryKeySelective(Moderator record);

    int updateByPrimaryKey(Moderator record);
    
    List<Moderator> SelectAllModerators();
    List<Moderator> selectBy(String name);
    List<Platetype> selectPlateType(Integer id);
    List<Plate> selectPlate(Integer id);
    List<Plate> somePlate(Integer id);
}