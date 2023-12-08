package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:40 PM
@Last Modified 12/8/2023 7:40 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.Supplier;
import com.juaracoding.imaspringbootrestapi.repo.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SupplierService {
    private SupplierRepo supplierRepo;


    @Autowired
    public SupplierService(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }

    public Object save(Supplier supplier) {
        try {
            supplierRepo.save(supplier);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }

    public Object saveBat(List<Supplier> listSupplier) {
        try {
            supplierRepo.saveAll(listSupplier);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }

    public Object findAll() {
        List<Supplier> listSupplier;
        try {
            listSupplier = supplierRepo.findAll();
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return listSupplier;

    }
}
