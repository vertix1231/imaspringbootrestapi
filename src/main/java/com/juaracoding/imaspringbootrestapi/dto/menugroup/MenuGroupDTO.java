package com.juaracoding.imaspringbootrestapi.dto.menugroup;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:27 PM
@Last Modified 12/8/2023 7:27 PM
Version 1.0
*/

public class MenuGroupDTO {

    private Long idMenuGroup;

    private String namaMenuGroup;

    private String deskripsi;

    public Long getIdMenuGroup() {
        return idMenuGroup;
    }

    public void setIdMenuGroup(Long idMenuGroup) {
        this.idMenuGroup = idMenuGroup;
    }

    public String getNamaMenuGroup() {
        return namaMenuGroup;
    }

    public void setNamaMenuGroup(String namaMenuGroup) {
        this.namaMenuGroup = namaMenuGroup;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
