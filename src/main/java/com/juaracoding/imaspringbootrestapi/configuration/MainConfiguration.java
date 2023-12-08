package com.juaracoding.imaspringbootrestapi.configuration;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:40 PM
@Last Modified 12/4/2023 8:40 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.core.Crypto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class MainConfiguration {

    @Autowired
    private Environment environment;

    @Primary
    @Bean
    public DataSource  getDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty("spring.datasource.driverClassName"));
        dataSourceBuilder.url(environment.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getProperty("spring.datasource.username"));
        dataSourceBuilder.password(Crypto.performDecrypt(environment.getProperty("spring.datasource.password")));
        return dataSourceBuilder.build();
    }
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
