package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.Trainer;
import cn.gym.mgt.gymmgtproto.mbg.model.TrainerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainerMapper {
    int countByExample(TrainerExample example);

    int deleteByExample(TrainerExample example);

    int deleteByPrimaryKey(Long trainerId);

    int insert(Trainer record);

    int insertSelective(Trainer record);

    List<Trainer> selectByExample(TrainerExample example);

    Trainer selectByPrimaryKey(Long trainerId);

    int updateByExampleSelective(@Param("record") Trainer record, @Param("example") TrainerExample example);

    int updateByExample(@Param("record") Trainer record, @Param("example") TrainerExample example);

    int updateByPrimaryKeySelective(Trainer record);

    int updateByPrimaryKey(Trainer record);
}