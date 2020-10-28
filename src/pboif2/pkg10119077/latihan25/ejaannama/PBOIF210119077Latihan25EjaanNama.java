/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Ejaan Nama
 */
public class PBOIF210119077Latihan25EjaanNama {

    public static void ejaan(String nama, int panjang){
        for (int i=0; i<panjang; i++){
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-"+no+" : "+eja);
        }
    }
    
    public static void main(String[] args) {
        String nama;
        int panjang;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = input.next();
        panjang = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk" + "'"+nama+"'"+" adalah :");
        ejaan(nama,panjang); 
    }
    
}
