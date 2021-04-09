package cn.gym.mgt.dao;

import cn.gym.mgt.mbg.model.GmPermission;

import java.util.List;

public interface GmPermissionDaoMapper {
    List<GmPermission> getPermissionListByUserId(Long securityUserId);
}
