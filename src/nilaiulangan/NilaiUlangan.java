/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiulangan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class NilaiUlangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int nilai1, nilai2, nilai3;
        double hasil1, hasil2, hasil3, hasil_akhir;
      
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Nilai Tugas : ");
        nilai1 = input.nextInt();
        System.out.print("Nilai UTS : ");
        nilai2 = input.nextInt();
        System.out.print("Nilai UAS : ");
        nilai3 = input.nextInt();
        
        hasil1 = 0.20*nilai1;
        hasil2 = 0.40*nilai2;
        hasil3 = 0.40*nilai3;
        hasil_akhir = hasil1+hasil2+hasil3;
        System.out.println("Hasil nilai tugas : " + hasil1);
        System.out.println("Hasil nilai UTS : " + hasil2);
        System.out.println("Hasil nilai UAS : " + hasil3);
        System.out.println("Nilai akhir yang diperoleh yaitu : " + hasil_akhir);
        
    }    
   
        
        
        
        
        
    
    }
