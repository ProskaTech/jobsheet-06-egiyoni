package com.mycompany.tugas.js06;

import javax.swing.JOptionPane;

/*
@author 21343005_EGI YONI SANDRA
 */

public class TUGAS01_NILAI_JOptionPane {
    public static void main(String[]args){
     String usera="";
     String userb="";
     String userc="";
     
     
    usera=JOptionPane.showInputDialog("Masukkan Nilai Pertama");
    int pertama = Integer.valueOf(usera).intValue();
    userb=JOptionPane.showInputDialog("Masukkan Nilai Kedua");
    int kedua = Integer.valueOf(userb).intValue();
    userc=JOptionPane.showInputDialog("Masukkan Nilai Ketiga");
    int ketiga = Integer.valueOf(userc).intValue();
    int rata_rata=(pertama+kedua+ketiga)/3;
    
    String hasil= "";
     hasil += "Nilai Pertama : " +pertama +"\n";
     hasil += "Nilai Kedua : " +kedua +"\n";
     hasil += "Nilai Ketiga : " +ketiga +"\n";
     hasil += "Rata-rata Nilainya : " +rata_rata+"\n";
     
     if (rata_rata<=60){
         hasil +=":-("+"\n";
     }
     else {hasil +=":-)"+"\n";
     }
     JOptionPane.showMessageDialog(null, hasil);
 }
}
