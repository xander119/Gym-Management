package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.CustomerMembership;
import cn.gym.mgt.mbg.model.CustomerMembershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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