package cn.gym.mgt.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Product implements Serializable {
    @ApiModelProperty(value = "product_id")
    private Long productId;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "cost")
    private Double cost;

    @ApiModelProperty(value = "product_type_id")
    private Long productTypeId;

    private static final long serialVersionUID = 1L;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", name=").append(name);
        sb.append(", cost=").append(cost);
        sb.append(", productTypeId=").append(productTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}