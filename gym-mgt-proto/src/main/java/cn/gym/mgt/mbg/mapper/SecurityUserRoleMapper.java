package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.SecurityUserRole;
import cn.gym.mgt.mbg.model.SecurityUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityUserRoleMapper {
    int countByExample(SecurityUserRoleExample example);

    int deleteByExample(SecurityUserRoleExample example);

    int deleteByPrimaryKey(Long securityUserRoleId);

    int insert(SecurityUserRole record);

    int insertSelective(SecurityUserRole record);

    List<SecurityUserRole> selectByExample(SecurityUserRoleExample example);

    SecurityUserRole selectByPrimaryKey(Long securityUserRoleId);

    int updateByExampleSelective(@Param("record") SecurityUserRole record, @Param("example") SecurityUserRoleExample example);

    int updateByExample(@Param("record") SecurityUserRole record, @Param("example") SecurityUserRoleExample example);

    int updateByPrimaryKeySelective(SecurityUserRole record);

    int updateByPrimaryKey(SecurityUserRole record);
}