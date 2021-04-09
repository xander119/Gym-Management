package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.Trainer;
import cn.gym.mgt.mbg.model.TrainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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