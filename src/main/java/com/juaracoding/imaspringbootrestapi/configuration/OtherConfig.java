package com.juaracoding.imaspringbootrestapi.configuration;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 9:30 PM
@Last Modified 12/8/2023 9:30 PM
Version 1.0
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:otherconfig.properties")
public class OtherConfig {
    private static String flagLogging;
    public static String getFlagLogging() {
        return flagLogging;
    }
    @Value("${flag.logging}")
    private void setFlagLogging(String flagLogging) {
        OtherConfig.flagLogging = flagLogging;
    }
}
