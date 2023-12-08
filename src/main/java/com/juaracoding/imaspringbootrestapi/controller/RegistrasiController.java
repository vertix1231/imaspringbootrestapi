package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:25 PM
@Last Modified 12/8/2023 7:25 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.dto.user.LoginDTO;
import com.juaracoding.imaspringbootrestapi.dto.user.RegistrasiDTO;
import com.juaracoding.imaspringbootrestapi.model.User;
import com.juaracoding.imaspringbootrestapi.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/regis")
public class RegistrasiController {


    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /*
        {
            "username" : "paulpaul123",
                "email" : "paul123@gmail.com",
                "noHp" : "628331616416",
                "tanggalLahir" : null,
                "password" : "paulbanget",
                "alamat" : "Bogor Selatan"
        }
     */
    @Autowired
    public RegistrasiController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/v1/checkregis")
    public Object checkRegis(@Valid @RequestBody RegistrasiDTO registrasiDTO) {
        User usr = modelMapper.map(registrasiDTO, new TypeToken<User>() {
        }.getType());

        return userService.save(usr);
    }

    /*
        {
            "username" : "paulpaul123",
            "password" : "paulbanget"
        }
     */
    @PostMapping("/v1/login")
    public Object login(@Valid @RequestBody LoginDTO loginDTO) {
        User usr = modelMapper.map(loginDTO, new TypeToken<User>() {
        }.getType());

        return userService.login(usr);
    }
}

