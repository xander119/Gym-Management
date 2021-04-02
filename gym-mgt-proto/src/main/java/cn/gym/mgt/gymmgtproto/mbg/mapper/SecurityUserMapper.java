package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUser;
import cn.gym.mgt.gymmgtproto.mbg.model.SecurityUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecurityUserMapper {
    int countByExample(SecurityUserExample example);

    int deleteByExample(SecurityUserExample example);

    int deleteByPrimaryKey(Long securityUserId);

    int insert(SecurityUser record);

    int insertSelective(SecurityUser record);

    List<SecurityUser> selectByExample(SecurityUserExample example);

    SecurityUser selectByPrimaryKey(Long securityUserId);

    int updateByExampleSelective(@Param("record") SecurityUser record, @Param("example") SecurityUserExample example);

    int updateByExample(@Param("record") SecurityUser record, @Param("example") SecurityUserExample example);

    int updateByPrimaryKeySelective(SecurityUser record);

    int updateByPrimaryKey(SecurityUser record);
}