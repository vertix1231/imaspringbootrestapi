package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:32 PM
@Last Modified 12/4/2023 8:32 PM
Version 1.0
*/

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstBarang")
public class Barang {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBarang")
    private Long id;
    private String namaBarang;

    @ManyToOne
    @JoinColumn(name = "IDKategoriBarang", foreignKey = @ForeignKey(name = "fkBarangToKategori1"))
    private KategoriBarang kategoriBarang;


    @JsonBackReference
    @ManyToMany(mappedBy = "listBarang")
    private List<Supplier> listSupplier;

    public List<Supplier> getListSupplier() {
        return listSupplier;
    }

    public void setListSupplier(List<Supplier> listSupplier) {
        this.listSupplier = listSupplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}