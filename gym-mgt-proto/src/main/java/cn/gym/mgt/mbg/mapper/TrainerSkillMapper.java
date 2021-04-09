package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.TrainerSkill;
import cn.gym.mgt.mbg.model.TrainerSkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainerSkillMapper {
    int countByExample(TrainerSkillExample example);

    int deleteByExample(TrainerSkillExample example);

    int deleteByPrimaryKey(Long trainerSkillId);

    int insert(TrainerSkill record);

    int insertSelective(TrainerSkill record);

    List<TrainerSkill> selectByExample(TrainerSkillExample example);

    TrainerSkill selectByPrimaryKey(Long trainerSkillId);

    int updateByExampleSelective(@Param("record") TrainerSkill record, @Param("example") TrainerSkillExample example);

    int updateByExample(@Param("record") TrainerSkill record, @Param("example") TrainerSkillExample example);

    int updateByPrimaryKeySelective(TrainerSkill record);

    int updateByPrimaryKey(TrainerSkill record);
}