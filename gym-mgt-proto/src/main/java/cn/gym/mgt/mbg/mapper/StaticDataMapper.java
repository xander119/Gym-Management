package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.StaticData;
import cn.gym.mgt.mbg.model.StaticDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaticDataMapper {
    int countByExample(StaticDataExample example);

    int deleteByExample(StaticDataExample example);

    int deleteByPrimaryKey(Long staticDataId);

    int insert(StaticData record);

    int insertSelective(StaticData record);

    List<StaticData> selectByExample(StaticDataExample example);

    StaticData selectByPrimaryKey(Long staticDataId);

    int updateByExampleSelective(@Param("record") StaticData record, @Param("example") StaticDataExample example);

    int updateByExample(@Param("record") StaticData record, @Param("example") StaticDataExample example);

    int updateByPrimaryKeySelective(StaticData record);

    int updateByPrimaryKey(StaticData record);
}