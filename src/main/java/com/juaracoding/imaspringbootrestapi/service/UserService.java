package com.juaracoding.imaspringbootrestapi.service;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/8/2023 7:41 PM
@Last Modified 12/8/2023 7:41 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.model.User;
import com.juaracoding.imaspringbootrestapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public Object save(User user) {

        try {
            userRepo.save(user);
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }
        return "Berhasil Disimpan";
    }

    public Object login(User user) {

        String userName = user.getUsername();
        Optional<User> opUser = userRepo.findByUsernameOrNoHpOrEmail(userName, userName, userName);
        try {

            /*
                Logic banned
                if(opUser.getIsBanned()==1){
                    return "Silahkan hubungi CS terdekat,
                            akun anda sedang dalam masa Banned";
                }
             */
            if (!opUser.isEmpty()) {
                User nextUser = opUser.get();
                /*
                    compare password di database
                    apakah sama dengan yang diinput user
                 */
                if (nextUser.getPassword().equals(user.getPassword())) {
                    // nextUser.setCounterPwd(0);
                    return "Login Berhasil";
                } else {
                    /*
                        if(nextUser.getCounterPwd<10){
                            nextUser.setCounterPwd(nextUser.getCounterPwd+1);

                            return "Username dan Password salah";
                        }else {
                            // update kolom IsBanned = 1;
                        }
                     */

                }
            } else {
                return "User Tidak Terdaftar !!";
            }
        } catch (Exception e) {
            return "Gagal disimpan " + e.getMessage();
        }
        return "User Tidak Terdaftar !!";
    }
}