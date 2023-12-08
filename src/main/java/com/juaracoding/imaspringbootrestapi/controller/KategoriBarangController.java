package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:23 PM
@Last Modified 12/8/2023 7:23 PM
Version 1.0
*/
import com.juaracoding.imaspringbootrestapi.model.KategoriBarang;
import com.juaracoding.imaspringbootrestapi.service.KategoriBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/katbarang")
public class KategoriBarangController {


    KategoriBarangService kategoriBarangService;

    @Autowired
    public KategoriBarangController(KategoriBarangService kategoriBarangService) {
        this.kategoriBarangService = kategoriBarangService;
    }

    @PostMapping("/v1/sv")
    public Object save(@RequestBody KategoriBarang kategoriBarang) {

        return kategoriBarangService.save(kategoriBarang);
    }

    /*
        [

            {

                "namaKategoriBarang" : "Alat Rumah Tangga",
                "deskripsi" : "Untuk RT"
            },
            {

                "namaKategoriBarang" : "Furniture",
                "deskripsi" : "Untuk Perabotan Rumah dan Kantor"
            }

        ]
     */
    @PostMapping("/v1/svb")
    public Object saveBatch(@RequestBody List<KategoriBarang> listKategoriBarang) {

        return kategoriBarangService.saveBat(listKategoriBarang);
    }


}

