package com.juaracoding.imaspringbootrestapi.dto.user;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:28 PM
@Last Modified 12/8/2023 7:28 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.constant.ConstantUser;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginDTO {


    @NotNull(message = ConstantUser.ERROR_USERNAME_IS_NULL)
    @NotBlank(message = ConstantUser.ERROR_USERNAME_IS_BLANK)
    @NotEmpty(message = ConstantUser.ERROR_USERNAME_IS_EMPTY)
    private String username;

    @NotNull(message = ConstantUser.ERROR_PASSWORD_IS_NULL)
    @NotBlank(message = ConstantUser.ERROR_PASSWORD_IS_BLANK)
    @NotEmpty(message = ConstantUser.ERROR_PASSWORD_IS_EMPTY)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
