package cn.gym.mgt.service;

import cn.gym.mgt.dto.SecurityUserRegisterBody;
import cn.gym.mgt.dto.SecurityUserSearchBody;
import cn.gym.mgt.mbg.model.GmPermission;
import cn.gym.mgt.mbg.model.SecurityUser;

import java.util.List;

public interface SecurityUserService {

    SecurityUser findByUsernameOrEmail(String usernameOrEmail);

//    SecurityUser saveSecurityUser(SecurityUserParam securityUserParam);

    List<SecurityUser> list();

    int update(Long securityUserId, SecurityUser securityUser);

    SecurityUser getSecurityUserById(Long id);

    List<GmPermission> getPermissionList(Long securityUserId);

    SecurityUser register(SecurityUserRegisterBody securityUserRegisterBody);

    String login(String username, String password);

    SecurityUser search(SecurityUserSearchBody securityUserSearchBody);
}
