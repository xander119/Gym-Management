package cn.gym.mgt.controller;

import cn.gym.mgt.comon.ResponseCustom;
import cn.gym.mgt.mbg.model.GmPermission;
import cn.gym.mgt.mbg.model.Role;
import cn.gym.mgt.service.RoleService;
import cn.gym.mgt.service.SecurityUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "SecurityUserRestController", description = "用户管理")
@RequestMapping("/securityUser")
public class SecurityUserRestController {

    @Autowired
    private SecurityUserService securityUserService;
    @Autowired
    private RoleService roleService;

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping(value = "/permission/{securityUserId}")
    public ResponseCustom<List<GmPermission>> getPermissionList(@PathVariable Long securityUserId) {
        List<GmPermission> permissionList = securityUserService.getPermissionList(securityUserId);
        return ResponseCustom.success(permissionList);
    }

    @ApiOperation("获取用户所有角色（包括+-权限）")
    @GetMapping(value = "/allRoles")
    public ResponseCustom<List<Role>> getRoleList() {
        List<Role> roleList = roleService.getList();
        return ResponseCustom.success(roleList);
    }
}
