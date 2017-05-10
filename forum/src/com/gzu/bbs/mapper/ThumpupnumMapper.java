package com.gzu.bbs.mapper;

import com.gzu.bbs.pojo.ThumpupnumExample;
import com.gzu.bbs.pojo.ThumpupnumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThumpupnumMapper {
    int countByExample(ThumpupnumExample example);

    int deleteByExample(ThumpupnumExample example);

    int deleteByPrimaryKey(ThumpupnumKey key);

    int insert(ThumpupnumKey record);

    int insertSelective(ThumpupnumKey record);

    List<ThumpupnumKey> selectByExample(ThumpupnumExample example);

    int updateByExampleSelective(@Param("record") ThumpupnumKey record, @Param("example") ThumpupnumExample example);

    int updateByExample(@Param("record") ThumpupnumKey record, @Param("example") ThumpupnumExample example);
}