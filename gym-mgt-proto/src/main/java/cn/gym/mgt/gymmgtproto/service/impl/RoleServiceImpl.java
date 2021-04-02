package cn.gym.mgt.gymmgtproto.service.impl;

import cn.gym.mgt.gymmgtproto.mbg.mapper.RoleMapper;
import cn.gym.mgt.gymmgtproto.mbg.model.Role;
import cn.gym.mgt.gymmgtproto.mbg.model.RoleExample;
import cn.gym.mgt.gymmgtproto.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getList() {
        return roleMapper.selectByExample(new RoleExample());
    }

    @Override
    public Role create(Role role) {
        return null;
    }

    @Override
    public Role getByName(String name) {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andNameEqualTo(name);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        return roles.isEmpty() ? null : roles.get(0);
    }

    @Override
    public Role update(Long roleId, Role role) {
        return null;
    }

    @Override
    public Role getById(Long roleId) {
        Role role = roleMapper.selectByPrimaryKey(roleId);
        return role;
    }
}
