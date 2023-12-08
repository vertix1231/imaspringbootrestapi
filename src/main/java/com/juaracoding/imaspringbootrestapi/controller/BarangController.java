package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:23 PM
@Last Modified 12/8/2023 7:23 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.Barang;
import com.juaracoding.imaspringbootrestapi.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/barang")
public class BarangController {

    private BarangService barangService;

    @Autowired
    public BarangController(BarangService barangService) {
        this.barangService = barangService;
    }

    /*
        {

        "namaBarang" : "Handphone",
        "kategoriBarang" : {
            "id" : 1
        }
}
     */
    @PostMapping("/v1/sv")
    public Object save(@RequestBody Barang barang) {

        return barangService.save(barang);
    }

    /*
        [

                {

                    "namaBarang" : "Televisi",
                    "kategoriBarang" : {
                        "id" : 1
                    }
                },
                {

                    "namaBarang" : "Pisau Dapur",
                    "kategoriBarang" : {
                        "id" : 2
                    }
                },
                {

                    "namaBarang" : "Piring Kaca",
                    "kategoriBarang" : {
                        "id" : 2
                    }
                },
                {

                    "namaBarang" : "Meja",
                    "kategoriBarang" : {
                        "id" : 3
                    }
                },
                {

                    "namaBarang" : "Kursi",
                    "kategoriBarang" : {
                        "id" : 3
                    }
                }

            ]
     */
    @PostMapping("/v1/svb")
    public Object saveBatch(@RequestBody List<Barang> listBarang) {

        return barangService.saveBat(listBarang);
    }
}

