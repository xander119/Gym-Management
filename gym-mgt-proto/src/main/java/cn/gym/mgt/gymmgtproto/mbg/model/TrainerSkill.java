package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class TrainerSkill implements Serializable {
    @ApiModelProperty(value = "trainer_skill_id")
    private Long trainerSkillId;

    @ApiModelProperty(value = "trainer_id")
    private Long trainerId;

    @ApiModelProperty(value = "skill_id")
    private Long skillId;

    private static final long serialVersionUID = 1L;

    public Long getTrainerSkillId() {
        return trainerSkillId;
    }

    public void setTrainerSkillId(Long trainerSkillId) {
        this.trainerSkillId = trainerSkillId;
    }

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trainerSkillId=").append(trainerSkillId);
        sb.append(", trainerId=").append(trainerId);
        sb.append(", skillId=").append(skillId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}