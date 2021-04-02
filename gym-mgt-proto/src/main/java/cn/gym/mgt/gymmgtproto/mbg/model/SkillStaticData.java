package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SkillStaticData implements Serializable {
    @ApiModelProperty(value = "skill_static_data_id")
    private Long skillStaticDataId;

    @ApiModelProperty(value = "skill_id")
    private Long skillId;

    @ApiModelProperty(value = "static_data_id")
    private Long staticDataId;

    private static final long serialVersionUID = 1L;

    public Long getSkillStaticDataId() {
        return skillStaticDataId;
    }

    public void setSkillStaticDataId(Long skillStaticDataId) {
        this.skillStaticDataId = skillStaticDataId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Long getStaticDataId() {
        return staticDataId;
    }

    public void setStaticDataId(Long staticDataId) {
        this.staticDataId = staticDataId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skillStaticDataId=").append(skillStaticDataId);
        sb.append(", skillId=").append(skillId);
        sb.append(", staticDataId=").append(staticDataId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}