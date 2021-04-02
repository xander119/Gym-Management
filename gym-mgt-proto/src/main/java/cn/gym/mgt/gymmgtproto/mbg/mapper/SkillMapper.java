package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.Skill;
import cn.gym.mgt.gymmgtproto.mbg.model.SkillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkillMapper {
    int countByExample(SkillExample example);

    int deleteByExample(SkillExample example);

    int deleteByPrimaryKey(Long skillId);

    int insert(Skill record);

    int insertSelective(Skill record);

    List<Skill> selectByExample(SkillExample example);

    Skill selectByPrimaryKey(Long skillId);

    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}