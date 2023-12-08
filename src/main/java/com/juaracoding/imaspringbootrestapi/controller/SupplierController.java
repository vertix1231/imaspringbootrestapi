package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:25 PM
@Last Modified 12/8/2023 7:25 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.Supplier;
import com.juaracoding.imaspringbootrestapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    /*
        {

            "namaSupplier" : "PT Garuda Matang",
            "listBarang" : [
                {
                    "id":1
                },
                {
                    "id":2
                },
                {
                    "id":3
                }
            ]
        }
     */
    @PostMapping("/v1/sv")
    public Object save(@RequestBody Supplier supplier) {

        return supplierService.save(supplier);
    }

    @PostMapping("/v1/svb")
    public Object saveBatch(@RequestBody List<Supplier> listSupplier) {

        return supplierService.saveBat(listSupplier);
    }

    @GetMapping("/v1/all")
    public Object findAll() {
        return supplierService.findAll();
    }
}
