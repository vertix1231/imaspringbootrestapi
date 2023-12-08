package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/23/2023 7:54 PM
@Last Modified 11/23/2023 7:54 PM
Version 1.0
*/


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/main")
public class CobaController {

    @GetMapping("/v1/welcome")
    public String welcome() {

        System.out.println("Masuk Kesini");
        return "Hello World!!";
    }

    @GetMapping("/v1/save")
    public String save() {

        System.out.println("Save Disini");
        return "Sudah TerSimpan";
    }

    @GetMapping("/v1/update")
    public String update() {

        System.out.println("Update Disini");
        return "Sudah Terubah";
    }

    @GetMapping("/v1/delete")
    public String delete() {

        System.out.println("Update Disini");
        return "Sudah Terubah";
    }

    @GetMapping("/v1/find")
    public String findBy() {

        System.out.println("Update Disini");
        return "Sudah Terubah";
    }

    @GetMapping("/v1/contohdata")
    public Map<String, Object> contohData() {

        Map<String, Object> map = new HashMap<>();
        map.put("nama", "Paul");
        map.put("alamat", "Bogor");

        return map;
    }
}