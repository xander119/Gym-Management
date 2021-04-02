package cn.gym.mgt.gymmgtproto.mbg.mapper;

import cn.gym.mgt.gymmgtproto.mbg.model.CustomerMembership;
import cn.gym.mgt.gymmgtproto.mbg.model.CustomerMembershipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMembershipMapper {
    int countByExample(CustomerMembershipExample example);

    int deleteByExample(CustomerMembershipExample example);

    int deleteByPrimaryKey(Long customerMembershipId);

    int insert(CustomerMembership record);

    int insertSelective(CustomerMembership record);

    List<CustomerMembership> selectByExample(CustomerMembershipExample example);

    CustomerMembership selectByPrimaryKey(Long customerMembershipId);

    int updateByExampleSelective(@Param("record") CustomerMembership record, @Param("example") CustomerMembershipExample example);

    int updateByExample(@Param("record") CustomerMembership record, @Param("example") CustomerMembershipExample example);

    int updateByPrimaryKeySelective(CustomerMembership record);

    int updateByPrimaryKey(CustomerMembership record);
}