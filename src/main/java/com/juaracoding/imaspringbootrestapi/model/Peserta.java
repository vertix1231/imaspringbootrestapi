package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/28/2023 9:43 PM
@Last Modified 11/28/2023 9:43 PM
Version 1.0
*/

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "MstPeserta")
public class Peserta {
    //repo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //    @Column(name = "Namax",columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    @Column(nullable = false, name = "Namax")
    @NotNull(message = "GAKBOLEH NULL")
    @NotEmpty(message = "GAKBOLEH KOSONG")
    @NotBlank(message = "GAKBOLEH BLANK YAAH !!")
//    @Pattern(regexp = "^[a-zA-Z0-9]{10,20}$",
//            message = "TIDAK BOLEH MENGANDUNG SPESIAL KARAKTER MINIMAL 10 MAKSIMAL 20 KARAKTER")
    private String nama;
    @Column(name = "Batch")
    private String batch;
    @Column(name = "Alamat")
    private String alamat;
    @NotNull(message = "GAKBOLEH NULL")
    private LocalDate tanggalLahir;
    @Transient
    private Integer umur;
    /*
        int intX = 1/0;
     */

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getUmur() {
        return Period.between(tanggalLahir, LocalDate.now()).getYears();
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}