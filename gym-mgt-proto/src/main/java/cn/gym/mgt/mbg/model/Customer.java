package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Customer implements Serializable {
    @ApiModelProperty(value = "customer_id")
    private Long customerId;

    @ApiModelProperty(value = "security_user")
    private Long securityUser;

    private static final long serialVersionUID = 1L;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getSecurityUser() {
        return securityUser;
    }

    public void setSecurityUser(Long securityUser) {
        this.securityUser = securityUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", securityUser=").append(securityUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}