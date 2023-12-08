package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:37 PM
@Last Modified 12/4/2023 8:37 PM
Version 1.0
*/


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstSupplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSupplier")
    private Long id;

    @Column(name = "NamaSupplier")
    private String namaSupplier;

    @ManyToMany
    @JoinTable(name = "MapSupplierBarang",
            joinColumns = {@JoinColumn(name = "IDSupplier", referencedColumnName = "IDSupplier")},
            inverseJoinColumns = {@JoinColumn(name = "IDBarang", referencedColumnName = "IDBarang")},
            uniqueConstraints = @UniqueConstraint(columnNames = {"IDSupplier", "IDBarang"})
    )
    private List<Barang> listBarang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public List<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }
}

