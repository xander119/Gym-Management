package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUserPermission;
import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUserPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecurityUserPermissionMapper {
    int countByExample(SecurityUserPermissionExample example);

    int deleteByExample(SecurityUserPermissionExample example);

    int deleteByPrimaryKey(Long securityUserPermissionId);

    int insert(SecurityUserPermission record);

    int insertSelective(SecurityUserPermission record);

    List<SecurityUserPermission> selectByExample(SecurityUserPermissionExample example);

    SecurityUserPermission selectByPrimaryKey(Long securityUserPermissionId);

    int updateByExampleSelective(@Param("record") SecurityUserPermission record, @Param("example") SecurityUserPermissionExample example);

    int updateByExample(@Param("record") SecurityUserPermission record, @Param("example") SecurityUserPermissionExample example);

    int updateByPrimaryKeySelective(SecurityUserPermission record);

    int updateByPrimaryKey(SecurityUserPermission record);
}