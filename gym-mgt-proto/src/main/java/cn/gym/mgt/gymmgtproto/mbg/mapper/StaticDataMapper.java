package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.StaticData;
import cn.gym.mgt.gymmgtproto.mbg.model.StaticDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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