package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Skill implements Serializable {
    @ApiModelProperty(value = "skill_id")
    private Long skillId;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "code")
    private String code;

    @ApiModelProperty(value = "skill_type_id")
    private Long skillTypeId;

    private static final long serialVersionUID = 1L;

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getSkillTypeId() {
        return skillTypeId;
    }

    public void setSkillTypeId(Long skillTypeId) {
        this.skillTypeId = skillTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skillId=").append(skillId);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", skillTypeId=").append(skillTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}