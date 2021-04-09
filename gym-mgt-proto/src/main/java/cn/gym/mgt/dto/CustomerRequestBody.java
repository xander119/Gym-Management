package cn.gym.mgt.dto;

import cn.gym.mgt.comon.RequestPage;
import io.swagger.annotations.ApiModelProperty;

public class CustomerRequestBody extends RequestPage {

    @ApiModelProperty(value = "用户名", required = false)
    private String username;

    @ApiModelProperty(value = "用户ID", required = false)
    private String customerId;

    @ApiModelProperty(value = "安全用户ID", required = false)
    private String securityUserId;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSecurityUserId() {
        return securityUserId;
    }

    public void setSecurityUserId(String securityUserId) {
        this.securityUserId = securityUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
