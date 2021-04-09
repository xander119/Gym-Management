package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Membership implements Serializable {
    @ApiModelProperty(value = "membership_id")
    private Long membershipId;

    @ApiModelProperty(value = "membership_type_id")
    private Long membershipTypeId;

    @ApiModelProperty(value = "start_date")
    private Date startDate;

    @ApiModelProperty(value = "end_date")
    private Date endDate;

    @ApiModelProperty(value = "membership_product")
    private Long membershipProduct;

    private static final long serialVersionUID = 1L;

    public Long getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Long membershipId) {
        this.membershipId = membershipId;
    }

    public Long getMembershipTypeId() {
        return membershipTypeId;
    }

    public void setMembershipTypeId(Long membershipTypeId) {
        this.membershipTypeId = membershipTypeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getMembershipProduct() {
        return membershipProduct;
    }

    public void setMembershipProduct(Long membershipProduct) {
        this.membershipProduct = membershipProduct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", membershipId=").append(membershipId);
        sb.append(", membershipTypeId=").append(membershipTypeId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", membershipProduct=").append(membershipProduct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}