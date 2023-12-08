package com.juaracoding.imaspringbootrestapi.repo;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/4/2023 8:31 PM
@Last Modified 12/4/2023 8:31 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PesertaRepo extends JpaRepository<Peserta, Long> {


    /*
        SELECT * FROM MstPeserta
        WHERE Nama = 'Aziz';
        SELECT
            *
        FROM
            batch18.MstPeserta peserta0_
        WHERE
            peserta0_.Namax=?

     SELECT * FROM MstPeserta
        WHERE Nama = 'Aziz' AND Batch = 1;
     */
    List<Peserta> findByNamaAndBatch(String strNama, String strBatch);

    /*
        SELECT COUNT(*) FROM MstPeserta
        Where Batch = ?
     */
    Integer countByBatch(String strBatch);

    void deleteByNama(String strNama);

    List<Peserta> findDistinctBatchByBatch(String strBatch);
//    findByNamaAndBatch
//    find
//    By
//    Nama -> nama
//    And -> And
//    Batch -> batch

}
