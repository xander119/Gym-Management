package cn.gym.mgt.gymmgtproto.dao;

import cn.gym.mgt.gymmgtproto.mbg.model.GmPermission;

import java.util.List;

public interface GmPermissionMapperDao {
    List<GmPermission> getPermissionListByUserId(Long securityUserId);
}
