package cn.gym.mgt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"cn.gym.mgt.mbg.mapper", "cn.gym.mgt.dao"})
public class MybatisConfig {
}
