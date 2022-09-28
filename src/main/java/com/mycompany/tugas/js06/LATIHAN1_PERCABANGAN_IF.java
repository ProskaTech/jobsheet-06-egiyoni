package com.mycompany.tugas.js06;

import java.util.Scanner;

/*
@author 21343005_EGI YONI SANDRA
*/

public class LATIHAN1_PERCABANGAN_IF {
    public static void main(String[] args){
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.print("Masukan Total Pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if  (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        
        System.out.println("Besarnya Diskon : Rp " + diskon);
    }
}
