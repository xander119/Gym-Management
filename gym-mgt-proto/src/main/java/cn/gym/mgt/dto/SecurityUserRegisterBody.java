package cn.gym.mgt.dto;

import cn.gym.mgt.mbg.model.SecurityUser;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SecurityUserRegisterBody extends SecurityUser {

    @NotEmpty
    @ApiModelProperty(value = "角色名称", required = true)
    private String roleName;

}
