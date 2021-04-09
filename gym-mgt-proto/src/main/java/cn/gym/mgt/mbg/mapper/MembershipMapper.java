package cn.gym.mgt.mbg.mapper;

import cn.gym.mgt.mbg.model.Membership;
import cn.gym.mgt.mbg.model.MembershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MembershipMapper {
    int countByExample(MembershipExample example);

    int deleteByExample(MembershipExample example);

    int deleteByPrimaryKey(Long membershipId);

    int insert(Membership record);

    int insertSelective(Membership record);

    List<Membership> selectByExample(MembershipExample example);

    Membership selectByPrimaryKey(Long membershipId);

    int updateByExampleSelective(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByExample(@Param("record") Membership record, @Param("example") MembershipExample example);

    int updateByPrimaryKeySelective(Membership record);

    int updateByPrimaryKey(Membership record);
}