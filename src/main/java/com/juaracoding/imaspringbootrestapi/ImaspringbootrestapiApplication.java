package com.juaracoding.imaspringbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImaspringbootrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImaspringbootrestapiApplication.class, args);

	}

	public Boolean testAja() {

		String strInput = "Ab12@cdE";
		int intInput = strInput.length();
		char chX = 'X';
		boolean isUpper = false;
		boolean isLower = false;
		boolean isNumeric = false;
		boolean isSpecial = false;
		boolean isLength = false;
		for (int i = 0; i < intInput; i++) {
			chX = strInput.charAt(i);
			if (chX > 96 && chX < 123) {//untuk cek huruf kecil
				isLower = true;
			}
			if (chX > 65 && chX < 92) {//untuk cek huruf Besar
				isUpper = true;
			}
			if (chX > 41 && chX < 50) {//cek nomor
				isNumeric = true;
			}
			if (chX > 30 && chX < 65) {//untuk cek spesial karakter
				isSpecial = true;
			}
		}

		if (isLower && isUpper && isNumeric && isSpecial && (intInput > 7 && intInput < 17)) {/*
				^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}$
			 */
			return true;

		} else {
			return false;
		}
	}
}
