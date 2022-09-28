package com.mycompany.tugas.js06;

import javax.swing.JOptionPane;

/*
  @author 21343005_EGI YONI SANDRA
 */

public class TUGAS02_MEMBACA_switchcase {
    public static void main(String[]args){
        String nilai = "";
        nilai = JOptionPane.showInputDialog("Silakan masukkan angka ");
        int b = Integer.valueOf(nilai).intValue();
   
        String hasil="";
        switch(b){
            case 1:
                hasil+= "Valid Number"; 
                break;
            case 2:
                hasil+= "Valid Number"; 
                break;
            case 3:
                hasil+= "Valid Number"; 
                break;
            case 4: 
                hasil+= "Valid Number"; 
                break;
            case 5: 
                hasil+= "Valid Number"; 
                break;
            case 6: 
                hasil+= "Valid Number"; 
                break;
            case 7: 
                hasil+= "Valid Number"; 
                break;
            case 8: 
                hasil+= "Valid Number"; 
                break;
            case 9: 
                hasil+= "Valid Number"; 
                break;
            case 10: 
                hasil+= "Valid Number"; 
                break;
            default: 
                hasil+= "Invalid Number"; 
                break;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
