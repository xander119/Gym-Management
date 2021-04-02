package cn.gym.mgt.gymmgtproto.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"cn.gym.mgt.gymmgtproto.mbg.mapper", "cn.gym.mgt.gymmgtproto.dao"})
public class MybatisConfig {
}
