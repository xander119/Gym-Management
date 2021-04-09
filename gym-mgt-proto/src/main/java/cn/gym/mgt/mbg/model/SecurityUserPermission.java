package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SecurityUserPermission implements Serializable {
    @ApiModelProperty(value = "security_user_permission_id")
    private Long securityUserPermissionId;

    @ApiModelProperty(value = "security_user_id")
    private Long securityUserId;

    @ApiModelProperty(value = "permission_id")
    private Long permissionId;

    private static final long serialVersionUID = 1L;

    public Long getSecurityUserPermissionId() {
        return securityUserPermissionId;
    }

    public void setSecurityUserPermissionId(Long securityUserPermissionId) {
        this.securityUserPermissionId = securityUserPermissionId;
    }

    public Long getSecurityUserId() {
        return securityUserId;
    }

    public void setSecurityUserId(Long securityUserId) {
        this.securityUserId = securityUserId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", securityUserPermissionId=").append(securityUserPermissionId);
        sb.append(", securityUserId=").append(securityUserId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}