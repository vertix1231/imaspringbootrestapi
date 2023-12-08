package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/23/2023 8:14 PM
@Last Modified 11/23/2023 8:14 PM
Version 1.0
*/

import javax.persistence.*;

@Entity
@Table(name = "MstCalonPeserta")
public class CalonPeserta {

    //CRUD
    //C =  CREATE
    //R = READ
    //U = UPDATE
    //D = DELETE

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String nama;
    private Integer umur;
    private Double nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }
}
