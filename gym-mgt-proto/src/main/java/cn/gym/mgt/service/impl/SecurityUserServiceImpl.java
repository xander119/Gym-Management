package cn.gym.mgt.service.impl;


import cn.gym.mgt.comon.SecurityRoleEnum;
import cn.gym.mgt.dao.GmPermissionDaoMapper;
import cn.gym.mgt.dto.SecurityUserRegisterBody;
import cn.gym.mgt.dto.SecurityUserSearchBody;
import cn.gym.mgt.mbg.mapper.CustomerMapper;
import cn.gym.mgt.mbg.mapper.SecurityUserMapper;
import cn.gym.mgt.mbg.mapper.TrainerMapper;
import cn.gym.mgt.mbg.model.*;
import cn.gym.mgt.service.RoleService;
import cn.gym.mgt.service.SecurityUserService;
import cn.gym.mgt.utils.JWTUtils;
import cn.hutool.core.util.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SecurityUserServiceImpl implements SecurityUserService {
    private static Logger log = LoggerFactory.getLogger(SecurityUserServiceImpl.class);

    @Autowired
    private SecurityUserMapper securityUserMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private TrainerMapper trainerMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private GmPermissionDaoMapper gmPermissionDaoMapper;
    @Autowired
    private JWTUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;


    @Override
    public SecurityUser register(SecurityUserRegisterBody securityUserRegisterBody) {
        SecurityUser securityUser1 = new SecurityUser();
        BeanUtils.copyProperties(securityUserRegisterBody, securityUser1);
        if (StrUtil.isBlank(securityUserRegisterBody.getUsername()) && !StrUtil.isNotBlank(securityUserRegisterBody.getEmail())) {
            securityUserRegisterBody.setUsername(securityUserRegisterBody.getEmail());
        }
        securityUser1.setCreateDate(new Date());
        securityUser1.setUpdateDate(new Date());
        securityUser1.setActive(true);
        //查询是否有相同用户名的用户
        SecurityUserExample example = new SecurityUserExample();
        example.createCriteria().andUsernameEqualTo(securityUser1.getUsername());
        List<SecurityUser> securityUserList = securityUserMapper.selectByExample(example);
        if (securityUserList.size() > 0) {
            return null;
        }

        // Todo 用Role ID
        Role role = roleService.getByName(securityUserRegisterBody.getRoleName());
        if (role != null) {
            securityUser1.setRole(role.getRoleId());
            //将密码进行加密操作
            String encodePassword = passwordEncoder.encode(securityUser1.getPassword());
            securityUser1.setPassword(encodePassword);
            securityUserMapper.insert(securityUser1);
            securityUserList = securityUserMapper.selectByExample(example);

            //创建相关联
            Long securityUserId = securityUserList.isEmpty() ? 0L : securityUserList.get(0).getSecurityUserId();
            if (SecurityRoleEnum.CUSTOMER.name().equalsIgnoreCase(role.getName())) {
                //创建用户
                Customer customer = new Customer();
                customer.setSecurityUser(securityUserId);
                customerMapper.insert(customer);

            } else if (SecurityRoleEnum.TRAINER.name().equalsIgnoreCase(role.getName())) {
                //创建教练
                Trainer trainer = new Trainer();
                trainer.setSecurityUserId(securityUserId);
                trainerMapper.insert(trainer);
            } else {
                //创建经理
//            SecurityRoleEnum.MANAGER.name().equals(securityUserRegisterBody.getRoleName())

            }
        }
        return securityUser1;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtUtils.generateToken(userDetails);
        } catch (AuthenticationException e) {
            log.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public SecurityUser search(SecurityUserSearchBody securityUserSearchBody) {
        SecurityUserExample securityUserExample = new SecurityUserExample();

        if (securityUserSearchBody.getUsername() != null) {
            securityUserExample.or(securityUserExample.createCriteria().andUsernameEqualTo(securityUserSearchBody.getUsername()));
            securityUserExample.or(securityUserExample.createCriteria().andEmailEqualTo(securityUserSearchBody.getUsername()));
        }
        if (securityUserSearchBody.getGender() != null) {
            securityUserExample.createCriteria().andGenderEqualTo(securityUserSearchBody.getGender());
        }

        if (securityUserSearchBody.getActive() != null) {
            securityUserExample.createCriteria().andActiveEqualTo(securityUserSearchBody.getActive());
        }
        if (securityUserSearchBody.getFirstname() != null) {
            securityUserExample.createCriteria().andFirstnameEqualTo(securityUserSearchBody.getFirstname());
        }
        if (securityUserSearchBody.getLastname() != null) {
            securityUserExample.createCriteria().andLastnameEqualTo(securityUserSearchBody.getLastname());
        }

        List<SecurityUser> securityUsers = securityUserMapper.selectByExample(securityUserExample);
        return securityUsers.isEmpty() ? null : securityUsers.get(0);
    }

    @Override
    public SecurityUser findByUsernameOrEmail(String usernameOrEmail) {

        SecurityUserExample example = new SecurityUserExample();
        example.or(example.createCriteria().andUsernameEqualTo(usernameOrEmail));
        example.or(example.createCriteria().andEmailEqualTo(usernameOrEmail));
        List<SecurityUser> securityUsers = securityUserMapper.selectByExample(example);

        return securityUsers.isEmpty() ? null : securityUsers.get(0);
    }

    @Override
    public List<SecurityUser> list() {
        return securityUserMapper.selectByExample(new SecurityUserExample());
    }

    @Override
    public int update(Long securityUserId, SecurityUser securityUser) {
        securityUser.setSecurityUserId(securityUserId);
        return securityUserMapper.updateByPrimaryKey(securityUser);
    }

    @Override
    public SecurityUser getSecurityUserById(Long id) {
        if (id != null) {
            return securityUserMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    @Override
    public List<GmPermission> getPermissionList(Long securityUserId) {
        return gmPermissionDaoMapper.getPermissionListByUserId(securityUserId);
//        return null;
    }
}
