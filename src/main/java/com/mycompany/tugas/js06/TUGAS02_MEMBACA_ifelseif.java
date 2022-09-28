package com.mycompany.tugas.js06;

import javax.swing.JOptionPane;

/*
    @author 21343005_EGI YONI SANDRA
 */

public class TUGAS02_MEMBACA_ifelseif {
    
    public static void main(String[]args){
        String nilai ="";
        nilai = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(nilai).intValue();
   
        String hasil ="";
        if (a >= 1 && a <= 10){
            hasil += "Valid Number";
        }
        else{
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
