package cn.gym.mgt.gymmgtproto.service;

import cn.gym.mgt.gymmgtproto.mbg.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getList();

    Role create(Role role);

    Role update(Long roleId, Role role);

    Role getByName(String name);

    Role getById(Long roleId);
}
