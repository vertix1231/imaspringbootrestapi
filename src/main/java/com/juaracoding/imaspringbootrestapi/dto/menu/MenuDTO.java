package com.juaracoding.imaspringbootrestapi.dto.menu;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:26 PM
@Last Modified 12/8/2023 7:26 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.dto.menugroup.MenuGroupDTO;

public class MenuDTO {
    private Long idMenu;
    private String namaMenu;
    private MenuGroupDTO menuGroup;

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public MenuGroupDTO getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(MenuGroupDTO menuGroup) {
        this.menuGroup = menuGroup;
    }

}
