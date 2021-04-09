package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Role implements Serializable {
    @ApiModelProperty(value = "role_id")
    private Long roleId;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "role_type_id")
    private Long roleTypeId;

    @ApiModelProperty(value = "active")
    private Boolean active;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(Long roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", name=").append(name);
        sb.append(", roleTypeId=").append(roleTypeId);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}