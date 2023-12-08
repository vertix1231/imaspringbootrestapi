package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/23/2023 7:58 PM
@Last Modified 11/23/2023 7:58 PM
Version 1.0
*/


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class FormatData {

    @Id
    private Long id;
    private String nama;
    private String jenisKelamin;
    private Integer umur;
//    private Alamat alamat;
//    private List<Alamat> listAlamat;

//    public List<Alamat> getListAlamat() {
//        return listAlamat;
//    }

//    public void setListAlamat(List<Alamat> listAlamat) {
//        this.listAlamat = listAlamat;
//    }

//    public Alamat getAlamat() {
//        return alamat;
//    }

//    public void setAlamat(Alamat alamat) {
//        this.alamat = alamat;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
