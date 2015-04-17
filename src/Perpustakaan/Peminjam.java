/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

/**
 *
 * @author AMD64
 */
public class Peminjam {
    private String nama;

        public String getNama() {
        return nama;
    }

       public void setNama(String nama)throws Exception {
         for (char c:nama.toCharArray())
         {
             if (Character.isDigit(c)){
                 throw new Exception ("Nama Peminjam Dilarang Mengandung Angka");
             }
             this.nama = nama;
         }
    }
}
