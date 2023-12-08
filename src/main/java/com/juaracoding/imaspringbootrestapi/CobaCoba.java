package com.juaracoding.imaspringbootrestapi;/*
IntelliJ IDEA 2023.2.4 (Community Edition)
Build #IC-232.10203.10, built on October 25, 2023
@Author ACER a.k.a. Irsyad Muhammad Andre
Java Developer
Created on 11/28/2023 9:25 PM
@Last Modified 11/28/2023 9:25 PM
Version 1.0
*/


//@Component
//@Configuration
//@Service
//@RestController
//@Transactional
//@Repository
public class CobaCoba {


    public static void main(String[] args) {
        int intX = 3;
        char chX = (char) intX;
        System.out.println(chX);
    }

    public Boolean testAja() {

		/*
			UNTUK VALIDASI PASSWORD
			itu syarat nya minimal 1 huruf kecil 1 huruf besar 1 angka 1 spesial karakter minimal 8 digit maksimal 16 digit
			Ab@1 -> false (tidak sesuai)
			misal :
			test 1 : A1@abcde -> (ekspektasi) false (tanpa huruf kecil)
			test 2 : a1@abcde -> (ekspektasi) false (tanpa huruf besar)
			test 3 : a1aabcde -> (ekspektasi) false (tanpa spesial karakter)
			test 4 : aA@aabcde -> (ekspektasi) false (tanpa angka)
			test 5 : aA@1aabcd -> (ekspektasi) false (diluar minimal 8 maksimal 16)

			test 6 : 12@112345 -> (ekspektasi) false (tanpa huruf kecil dan huruf besar)
		 */
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

//		if(isLower && isUpper && isNumeric && isSpecial && (intInput > 7 && intInput < 17))
//		{
//			/*
//				^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}$
//			 */
//			return true;
//
//		}else {
//			return  false;
//		}

        //[567] -> 5 atau 6 atau 7
        //[0-9]  -> 0,1,2,3,4,5,6,7,8,9
//		[567][0-9] => 50 -> 79

        //62(812|813|821)
//		String strX = "62812";
//		if("62812".equals(strX) || "62813".equals(strX) || "62821".equals(strX))
//		{
//			System.out.println("OK");
//		}

        return false;

    }
}
