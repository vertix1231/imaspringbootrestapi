package com.juaracoding.imaspringbootrestapi.dto.user;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 12/6/2023 7:52 PM
@Last Modified 12/6/2023 7:52 PM
Version 1.0
*/

import com.juaracoding.imaspringbootrestapi.constant.ConstantRegex;
import com.juaracoding.imaspringbootrestapi.constant.ConstantUser;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

/*
    Referensi ke Model User
 */
public class RegistrasiDTO {

    private String namaLengkap;

    /* huruf kecil / nomor kombinasi
     minimal 8 maksimal 16 karakter
     paulc256bit
     */
    @NotNull(message = ConstantUser.ERROR_USERNAME_IS_NULL)
    @NotBlank(message = ConstantUser.ERROR_USERNAME_IS_BLANK)
    @NotEmpty(message = ConstantUser.ERROR_USERNAME_IS_EMPTY)
    @Pattern(regexp = "^[a-z0-9]{8,16}$")
    private String username;
    @NotNull(message = ConstantUser.ERROR_EMAIL_IS_NULL)
    @NotBlank(message = ConstantUser.ERROR_EMAIL_IS_BLANK)
    @NotEmpty(message = ConstantUser.ERROR_EMAIL_IS_EMPTY)
    @Pattern(regexp = ConstantRegex.REGEX_EMAIL_STANDARD_RFC5322, message = ConstantRegex.ERROR_EMAIL_STANDARD_RFC5322)
    private String email;
    private String noHp;
    private LocalDate tanggalLahir;
    private String password;

    private String alamat;

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
