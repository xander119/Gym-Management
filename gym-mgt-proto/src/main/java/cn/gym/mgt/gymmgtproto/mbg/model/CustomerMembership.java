package cn.gym.mgt.gymmgtproto.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class CustomerMembership implements Serializable {
    @ApiModelProperty(value = "customer_membership_id")
    private Long customerMembershipId;

    @ApiModelProperty(value = "membership_id")
    private Long membershipId;

    @ApiModelProperty(value = "customer_id")
    private Long customerId;

    private static final long serialVersionUID = 1L;

    public Long getCustomerMembershipId() {
        return customerMembershipId;
    }

    public void setCustomerMembershipId(Long customerMembershipId) {
        this.customerMembershipId = customerMembershipId;
    }

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerMembershipId=").append(customerMembershipId);
        sb.append(", membershipId=").append(membershipId);
        sb.append(", customerId=").append(customerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}