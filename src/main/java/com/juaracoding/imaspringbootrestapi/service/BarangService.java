package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:37 PM
@Last Modified 12/8/2023 7:37 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.Barang;
import com.juaracoding.imaspringbootrestapi.repo.BarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class BarangService {

    private BarangRepo barangRepo;

    @Autowired
    public BarangService(BarangRepo barangRepo) {
        this.barangRepo = barangRepo;
    }

    public Object save(Barang barang) {
        try {
            barangRepo.save(barang);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }

    public Object saveBat(List<Barang> listBarang) {
        try {
            barangRepo.saveAll(listBarang);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }
}
