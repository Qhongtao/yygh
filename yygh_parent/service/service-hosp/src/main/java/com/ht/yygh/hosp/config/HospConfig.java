package com.ht.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ht.yygh.hosp.mapper")
public class HospConfig {
}