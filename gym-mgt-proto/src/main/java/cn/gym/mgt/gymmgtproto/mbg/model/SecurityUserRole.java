package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SecurityUserRole implements Serializable {
    @ApiModelProperty(value = "security_user_role_id")
    private Long securityUserRoleId;

    @ApiModelProperty(value = "role_id")
    private Long roleId;

    @ApiModelProperty(value = "security_user_id")
    private Long securityUserId;

    private static final long serialVersionUID = 1L;

    public Long getSecurityUserRoleId() {
        return securityUserRoleId;
    }

    public void setSecurityUserRoleId(Long securityUserRoleId) {
        this.securityUserRoleId = securityUserRoleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
        sb.append(", securityUserRoleId=").append(securityUserRoleId);
        sb.append(", roleId=").append(roleId);
        sb.append(", securityUserId=").append(securityUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}