package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:40 PM
@Last Modified 12/8/2023 7:40 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.dto.menu.MenuDTO;
import com.juaracoding.imaspringbootrestapi.model.Menu;
import com.juaracoding.imaspringbootrestapi.repo.MenuRepo;
import com.juaracoding.imaspringbootrestapi.utility.TransformToDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MenuService {


    private MenuRepo menuRepo;

    private TransformToDTO transformToDTO = new TransformToDTO();
    private Map<String, Object> mapz = new HashMap<>();

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    public Object save(Menu menu) {
        try {
            menuRepo.save(menu);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }

        return "Berhasil Disimpan";
    }

    public Object findAll() {
        List<Menu> listMenu;
        try {
            listMenu = menuRepo.findAll();
            if (listMenu.isEmpty()) {
                return "Data tidak ada";
            }
        } catch (Exception e) {
            return "Gagal  " + e.getMessage();
        }

        List<MenuDTO> listMenuDTO = modelMapper.map(listMenu, new TypeToken<List<MenuDTO>>() {
        }.getType());
        return listMenuDTO;
    }

    public Object findByPage(Pageable pageable) {
        Page<Menu> pageMenu = null;
        List<Menu> listMenu = null;
        List<MenuDTO> listMenuDTO = null;
        Map<String, Object> mapResult = null;

        try {
            pageMenu = menuRepo.findAll(pageable);
            listMenu = pageMenu.getContent();
            if (listMenu.isEmpty()) {
                return "Data Tidak Ada";
            }
        } catch (Exception e) {
            return "Error : " + e.getMessage();
        }

        listMenuDTO = modelMapper.map(listMenu, new TypeToken<List<MenuDTO>>() {
        }.getType());

        String sortBy = pageMenu.getSort().toString().split(":")[0];
        sortBy = sortBy.equals("UNSORTED") ? "id" : sortBy;
        String sort = sortBy.equals("UNSORTED") ? "asc" : pageMenu.getSort().toString().split(":")[1];

        mapz = transformToDTO.transformObject(mapz, listMenuDTO, pageMenu);

        return mapz;
    }


}
