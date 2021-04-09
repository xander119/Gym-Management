package cn.gym.mgt.dto;

import cn.gym.mgt.mbg.model.Membership;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class MembershipCRUD extends Membership {
    @NotNull
    @ApiModelProperty(value = "用户ID")
    private Long customerId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
