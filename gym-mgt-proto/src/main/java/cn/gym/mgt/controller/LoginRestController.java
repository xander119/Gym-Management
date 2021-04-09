package cn.gym.mgt.controller;

import cn.gym.mgt.comon.ResponseCustom;
import cn.gym.mgt.dto.SecurityUserRegisterBody;
import cn.gym.mgt.dto.SecurityUserRequestBody;
import cn.gym.mgt.mbg.model.SecurityUser;
import cn.gym.mgt.service.SecurityUserService;
import cn.gym.mgt.service.StaticDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * login controller temporally disabled Use Security User Rest Controller
 */

@RestController
@Api(tags = "LoginRestController", description = "用户管理")
@RequestMapping("/su")
public class LoginRestController {
    @Resource
    StaticDataService staticDataService;
    @Autowired
    private SecurityUserService securityUserService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/register")
    @ResponseBody
    public ResponseCustom<SecurityUser> register(@RequestBody SecurityUserRegisterBody securityUserRegisterBody, BindingResult result) {
        SecurityUser securityUserCreated = securityUserService.register(securityUserRegisterBody);
        if (securityUserCreated == null) {
            ResponseCustom.failed();
        }
        return ResponseCustom.success(securityUserCreated);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseCustom<Map<String, String>> login(@RequestBody SecurityUserRequestBody securityUserRequestBody, BindingResult result) {
        String token = securityUserService.login(securityUserRequestBody.getUsername(), securityUserRequestBody.getPassword());
        if (token == null) {
            return ResponseCustom.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return ResponseCustom.success(tokenMap);
    }


}
