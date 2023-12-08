package com.juaracoding.imaspringbootrestapi.model;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/23/2023 7:56 PM
@Last Modified 11/23/2023 7:56 PM
Version 1.0
*/

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Alamat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    /*
        DIAWALI HURUF BESAR / KAPITAL
        SISANYA HURUF KECIL DAN NOMOR SAJA (KOMBINASI)
        MINIMAL 8 KARAKTER MAKSIMAL 16
     */

    @NotNull
    @NotEmpty
    @NotBlank
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Pattern(regexp = "^[a-zA-Z0-9]{10,20}$", message = "MINIMAL 10 MAKSIMAL 20 KARAKTER")
    @Column(unique = false, name = "", insertable = false, updatable = true)
//    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}:;<>,.?/~_+-=|]).{8,16}$",message = "Jalan tidak Valid")
//    @Pattern(regexp = "^$",message = "Jalan tidak Valid")
    private String jalan;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate contohTanggal;//yyyy-MM-dd

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date contohTanggalWaktu;//yyyy-MM-dd HH:mm:ss.SSS
    private Integer nomor;
    private String kota;
    private Integer kodePos;

    private Long createdBy;
    private Date createdAt;
    private Long modifiedBy;
    private Date modifiedAt;
    private Byte isActive;

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Integer getKodePos() {
        return kodePos;
    }

    public void setKodePos(Integer kodePos) {
        this.kodePos = kodePos;
    }
}
