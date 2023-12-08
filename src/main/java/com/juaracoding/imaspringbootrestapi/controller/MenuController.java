package com.juaracoding.imaspringbootrestapi.controller;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:24 PM
@Last Modified 12/8/2023 7:24 PM
Version 1.0
*/


import com.juaracoding.imaspringbootrestapi.configuration.OtherConfig;
import com.juaracoding.imaspringbootrestapi.dto.menu.MenuDTO;
import com.juaracoding.imaspringbootrestapi.model.Menu;
import com.juaracoding.imaspringbootrestapi.service.MenuService;
import com.juaracoding.imaspringbootrestapi.utility.LoggingFile;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/menu")
public class MenuController {

    private MenuService menuService;

    private String [] strException = new String[2];

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public MenuController(MenuService menuService) {
        strException[0] = "MenuController";
        this.menuService = menuService;
    }

   /*
         {
            "namaMenu" : "IT ONE",
                "menuGroup" : {
                 "idMenuGroup" : 1
            }
        }
    */

    @PostMapping("/v1/sv")
    public Object save(@Valid @RequestBody MenuDTO menuDTO){

        try{
            int intX = 1/0;
            System.out.println(intX);
        }catch (Exception e){
            strException[1]="save(@Valid @RequestBody MenuDTO menuDTO) -- LINE 53";
            LoggingFile.exceptionStringz(strException,e, OtherConfig.getFlagLogging());
        }
        Menu menu = modelMapper.map(menuDTO, new TypeToken<Menu>(){}.getType());
        return menuService.save(menu);
    }

    @GetMapping("/v1/all")
    public Object findAll(){
        return menuService.findAll();
    }

    @GetMapping("/v1/fbp")
    public Object findByPage(
            @RequestParam(value = "page") Integer pagez,// halaman ke ?
            @RequestParam(value = "sort") String sortz,// asc / desc
            @RequestParam(value = "sortby") String sortzBy, // sorting berdasarkan field apa ?
            @RequestParam(value = "itemPerPage") String itemPerPage// data per halaman
    ){
        sortzBy = sortzBy==null?"idMenu":sortzBy;
        Pageable pageable = PageRequest.
                of(pagez,//HALAMAN KE BERAPA
                        Integer.parseInt(itemPerPage.equals("")?"5":itemPerPage),// BERAPA DATA PER HALAMAN
                        sortz.equals("asc")? Sort.by(sortzBy): Sort.by(sortzBy).descending()// SORTING ASC / DESC
                );
        return menuService.findByPage(pageable);
    }

//    private void mapSorting()
//    {
//        mapSorting.put("id","ID MENU");
//        mapSorting.put("nama","NAMA MENU");
//        mapSorting.put("kode","KODE MENU");
//    }
}
