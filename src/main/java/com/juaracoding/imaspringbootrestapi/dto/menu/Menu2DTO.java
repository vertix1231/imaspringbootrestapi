package com.juaracoding.imaspringbootrestapi.dto.menu;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:26 PM
@Last Modified 12/8/2023 7:26 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.dto.menugroup.MenuGroup2DTO;

public class Menu2DTO {

    private String namaMenu;

    private MenuGroup2DTO menuGroup;

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public MenuGroup2DTO getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(MenuGroup2DTO menuGroup) {
        this.menuGroup = menuGroup;
    }
}
