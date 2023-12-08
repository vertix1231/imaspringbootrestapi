package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:39 PM
@Last Modified 12/8/2023 7:39 PM
Version 1.0
*/
import com.juaracoding.imaspringbootrestapi.model.KategoriBarang;
import com.juaracoding.imaspringbootrestapi.repo.KategoriBarangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class KategoriBarangService {

    KategoriBarangRepo kategoriBarangRepo;


    @Autowired
    public KategoriBarangService(KategoriBarangRepo kategoriBarangRepo) {
        this.kategoriBarangRepo = kategoriBarangRepo;
    }

    public Object save(KategoriBarang kategoriBarang) {
        try {
            kategoriBarangRepo.save(kategoriBarang);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }

    public Object saveBat(List<KategoriBarang> listKategoriBarang) {
        try {
            kategoriBarangRepo.saveAll(listKategoriBarang);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";

    }


}
