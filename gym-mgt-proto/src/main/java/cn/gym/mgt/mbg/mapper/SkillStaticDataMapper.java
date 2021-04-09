package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.SkillStaticData;
import cn.gym.mgt.mbg.model.SkillStaticDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkillStaticDataMapper {
    int countByExample(SkillStaticDataExample example);

    int deleteByExample(SkillStaticDataExample example);

    int deleteByPrimaryKey(Long skillStaticDataId);

    int insert(SkillStaticData record);

    int insertSelective(SkillStaticData record);

    List<SkillStaticData> selectByExample(SkillStaticDataExample example);

    SkillStaticData selectByPrimaryKey(Long skillStaticDataId);

    int updateByExampleSelective(@Param("record") SkillStaticData record, @Param("example") SkillStaticDataExample example);

    int updateByExample(@Param("record") SkillStaticData record, @Param("example") SkillStaticDataExample example);

    int updateByPrimaryKeySelective(SkillStaticData record);

    int updateByPrimaryKey(SkillStaticData record);
}