package com.juaracoding.imaspringbootrestapi.repo;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:35 PM
@Last Modified 12/8/2023 7:35 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Long> {
}
