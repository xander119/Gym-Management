package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.SecurityUser;
import cn.gym.mgt.mbg.model.SecurityUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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