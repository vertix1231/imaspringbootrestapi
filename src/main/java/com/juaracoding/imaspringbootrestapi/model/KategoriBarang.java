package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:33 PM
@Last Modified 12/4/2023 8:33 PM
Version 1.0
*/

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstKategoriBarang")
public class KategoriBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKategoriBarang")
    private Long id;
    private String namaKategoriBarang;
    private String deskripsi;

    @OneToMany(mappedBy = "kategoriBarang")
    private List<Barang> listBarang;

    public List<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKategoriBarang() {
        return namaKategoriBarang;
    }

    public void setNamaKategoriBarang(String namaKategoriBarang) {
        this.namaKategoriBarang = namaKategoriBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
