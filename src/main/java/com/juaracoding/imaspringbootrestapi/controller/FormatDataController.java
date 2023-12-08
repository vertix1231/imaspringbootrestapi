package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/23/2023 7:55 PM
@Last Modified 11/23/2023 7:55 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.CalonPeserta;
import com.juaracoding.imaspringbootrestapi.model.FormatData;
import com.juaracoding.imaspringbootrestapi.utility.FileUtility;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/formdata")
public class FormatDataController {

    @PostMapping("/v1/convertjson")
    public Object getDataJSON(@RequestBody FormatData formatData) {

//        Map<String,Object>
        /*
            1. validaasi content type
            2. bongkar isi boody
            3. mapping field dari body ke penadah
            4. bungkus lalu jadikan format utuh class Object nya
         */
        System.out.println("Masuk kesini");
        return formatData;
    }

    @GetMapping("/v1/cubacuba")
    public void bikinapi() {
        System.out.println("Masuk Cuba Cuba");
    }

    @PostMapping("/seleksi")
    public String seleksiCalonPeserta(@RequestBody List<CalonPeserta> calon) {

//        saveAll(calon);
        for (int i = 0; i < calon.size(); i++) {
            System.out.println("Nama i ke " + i + " : " + calon.get(i).getNama());
            System.out.println("Nilai i ke " + i + " : " + calon.get(i).getNilai());
            System.out.println("Umur i ke " + i + " : " + calon.get(i).getUmur());
            System.out.println("==================");
        }
//        if (calon.getNilai() > 80 && calon.getUmur() >= 18 && calon.getUmur() <= 60) {
//            return calon.getNama() + " lolos seleksi";
//        } else {
//            return calon.getNama() + " tidak lolos seleksi";
//        }

        return "Udah OK";
    }

    @PostMapping("/seleksi2")
    public String seleksiCalonPeserta2(
            @RequestParam(value = "nama") String strNama,
            @RequestParam(value = "umur") Byte intUmur,
            @RequestParam(value = "nilai") Double douNilai
    ) {
        System.out.println(strNama);
        System.out.println(intUmur);
        System.out.println(douNilai);
        if (douNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " lolos seleksi";
        } else {
            return strNama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/kirim-file")
    public String submitFile(@RequestParam(value = "kiriman") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String uploadDir = "user-files/";
        FileUtility.saveFile(uploadDir, fileName, file);
        return "Berhasil mengunggah file " + fileName;
    }
}