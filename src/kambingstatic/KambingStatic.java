/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;

/**
 *
 * @author eskripsi Program : Program ini berisi program untuk menampilkan
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      : 10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * Jumlah kambing menggunakan variabel static
 * 
 */

public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                + Mamalia.jumlahKambing);
    }
    
}