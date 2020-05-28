package com.sn.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.sn.miaosha.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.sn.miaosha"})
public class MiaoshaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

}
