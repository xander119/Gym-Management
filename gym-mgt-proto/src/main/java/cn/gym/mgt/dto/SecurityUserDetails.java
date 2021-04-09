package cn.gym.mgt.dto;

import cn.gym.mgt.mbg.model.GmPermission;
import cn.gym.mgt.mbg.model.SecurityUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SecurityUserDetails implements UserDetails {
    private SecurityUser securityUser;
    private List<GmPermission> permissionList;

    public SecurityUserDetails(SecurityUser securityUser, List<GmPermission> permissionList) {
        this.securityUser = securityUser;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        if (permissionList == null || permissionList.isEmpty()) {
            return null;
        } else {
            return permissionList.stream()
                    .filter(permission -> permission.getType() != null)
                    .map(permission -> new SimpleGrantedAuthority(permission.getType()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public String getPassword() {
        return securityUser.getPassword();
    }

    @Override
    public String getUsername() {
        return securityUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return securityUser.getActive();
    }
}
