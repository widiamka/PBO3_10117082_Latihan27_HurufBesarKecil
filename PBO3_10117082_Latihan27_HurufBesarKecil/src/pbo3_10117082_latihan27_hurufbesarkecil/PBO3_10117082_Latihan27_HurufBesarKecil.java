/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan27_hurufbesarkecil;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan formatting
* kalimat menjadi huruf besar dan kecil dan inputannya berasal dari user 
 */
public class PBO3_10117082_Latihan27_HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String kalimat,hurufKecil,hurufBesar;
 

        
        
         Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Kalimat\t: ");
        kalimat =scn.nextLine();
        hurufKecil = kalimat.toLowerCase();
        hurufBesar = kalimat.toUpperCase();
        
        System.out.println("=========HASIL FORMATTING=========");
        System.out.println("Huruf Besar: "+hurufBesar);
        System.out.println("Huruf Kecil: "+hurufKecil);
    }
    
}
