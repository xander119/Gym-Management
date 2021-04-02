package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.GmPermission;
import cn.gym.mgt.gymmgtproto.mbg.model.GmPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GmPermissionMapper {
    int countByExample(GmPermissionExample example);

    int deleteByExample(GmPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(GmPermission record);

    int insertSelective(GmPermission record);

    List<GmPermission> selectByExample(GmPermissionExample example);

    GmPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") GmPermission record, @Param("example") GmPermissionExample example);

    int updateByExample(@Param("record") GmPermission record, @Param("example") GmPermissionExample example);

    int updateByPrimaryKeySelective(GmPermission record);

    int updateByPrimaryKey(GmPermission record);
}