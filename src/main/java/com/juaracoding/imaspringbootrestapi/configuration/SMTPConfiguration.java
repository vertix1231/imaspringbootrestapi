package com.juaracoding.imaspringbootrestapi.configuration;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 8:35 PM
@Last Modified 12/8/2023 8:35 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.core.Crypto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:smtpconfig.properties")
public class SMTPConfiguration {

    private static String emailUsername;
    private static String emailPassword;
    private static String emailHost;
    private static String emailPort;
    private static String emailPortSSL;
    private static String emailPortTLS;
    private static String emailAuth;
    private static String emailStartTLSEnable;
    private static String emailSMTPSocketFactoryClass;

    public static String getEmailUsername() {
        return emailUsername;
    }

    @Value("${email.username}")
    private void setEmailUsername(String emailUsername) {
        SMTPConfiguration.emailUsername = emailUsername;
    }

    public static String getEmailPassword() {
        return emailPassword;
    }


    @Value("${email.password}")
    private void setEmailPassword(String emailPassword) {
        SMTPConfiguration.emailPassword = Crypto.performDecrypt(emailPassword);
    }

    public static String getEmailHost() {
        return emailHost;
    }

    @Value("${email.host}")
    private void setEmailHost(String emailHost) {
        SMTPConfiguration.emailHost = emailHost;
    }

    public static String getEmailPort() {
        return emailPort;
    }

    @Value("${email.port}")
    private void setEmailPort(String emailPort) {
        SMTPConfiguration.emailPort = emailPort;
    }

    public static String getEmailPortSSL() {
        return emailPortSSL;
    }

    @Value("${email.port.ssl}")
    private void setEmailPortSSL(String emailPortSSL) {
        SMTPConfiguration.emailPortSSL = emailPortSSL;
    }

    public static String getEmailPortTLS() {
        return emailPortTLS;
    }

    @Value("${email.port.tls}")
    private void setEmailPortTLS(String emailPortTLS) {
        SMTPConfiguration.emailPortTLS = emailPortTLS;
    }

    public static String getEmailAuth() {
        return emailAuth;
    }

    @Value("${email.auth}")
    private void setEmailAuth(String emailAuth) {
        SMTPConfiguration.emailAuth = emailAuth;
    }

    public static String getEmailStartTLSEnable() {
        return emailStartTLSEnable;
    }

    @Value("${email.starttls.enable}")
    private void setEmailStartTLSEnable(String emailStartTLSEnable) {
        SMTPConfiguration.emailStartTLSEnable = emailStartTLSEnable;
    }

    public static String getEmailSMTPSocketFactoryClass() {
        return emailSMTPSocketFactoryClass;
    }

    @Value("${email.smtp.socket.factory.class}")
    private void setEmailSMTPSocketFactoryClass(String emailSMTPSocketFactoryClass) {
        SMTPConfiguration.emailSMTPSocketFactoryClass = emailSMTPSocketFactoryClass;
    }
}
