package com.mycompany.tugas.js06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 @author 21343005_EGI YONI SANDRA
 */

public class TUGAS01_NILAI_BufferedReader {
    public static void main(String[]args){
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String usera="";
        String userb="";
        String userc="";

        try{
            System.out.print("Masukkan Nilai pertama : ");
            usera = nilai.readLine();
            System.out.print("Masukkan Nilai Kedua : ");
            userb = nilai.readLine();
            System.out.print("Masukkan Nilai Ketiga : ");
            userc = nilai.readLine();
        }catch(IOException e){
        System.out.println("Kata Inputkan Salah, Silahkan Coba Lagi.");
        }
        
        int pertama;
        int kedua;
        int ketiga;

        pertama = Integer.parseInt(usera);
        kedua = Integer.parseInt(userb);
        ketiga = Integer.parseInt(userc);

        int rata_rata = (pertama + kedua + ketiga) / 3;

        System.out.println("Rata-rata nilai Anda: " + rata_rata);

        if (rata_rata<=60){
            System.out.println(":-(");
        }
        else {
            System.out.println(":-)");
        }
   }
}
