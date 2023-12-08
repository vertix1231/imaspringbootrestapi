package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:30 PM
@Last Modified 12/4/2023 8:30 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.model.Peserta;
import com.juaracoding.imaspringbootrestapi.repo.PesertaRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class PesertaService {


    /*
        CREATE
        READ
        UPDATE
        DELETE
     */

    PesertaRepo pesertaRepo;
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    public PesertaService(PesertaRepo pesertaRepo) {
        this.pesertaRepo = pesertaRepo;
    }

    public Object updateData(Long id, Peserta peserta) {//object kiriman dari FE

        Optional<Peserta> op = pesertaRepo.findById(id);// object dari database
        if (op.isEmpty()) {
            return "USER TIDAK ADA !!!";
        }

        Peserta pesertaNext = op.get();
        pesertaNext.setAlamat(peserta.getAlamat());
        pesertaNext.setNama(peserta.getNama());
        pesertaNext.setTanggalLahir(peserta.getTanggalLahir());

        return "Update Berhasil";
    }
}