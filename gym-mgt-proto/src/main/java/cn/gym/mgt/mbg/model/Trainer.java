package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Trainer implements Serializable {
    @ApiModelProperty(value = "trainer_id")
    private Long trainerId;

    @ApiModelProperty(value = "experience")
    private Integer experience;

    @ApiModelProperty(value = "security_user_id")
    private Long securityUserId;

    private static final long serialVersionUID = 1L;

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Long getSecurityUserId() {
        return securityUserId;
    }

    public void setSecurityUserId(Long securityUserId) {
        this.securityUserId = securityUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trainerId=").append(trainerId);
        sb.append(", experience=").append(experience);
        sb.append(", securityUserId=").append(securityUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}