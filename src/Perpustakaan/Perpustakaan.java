/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author AMD64
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku1=new Buku();
        buku1.setJudulBuku("Torment");
        buku1.setPenerbit("Gramedia");
        buku1.setPengarang("Lauren Kate");            
        
        Peminjam peminjam1=new Peminjam();
        try {
            peminjam1.setNama("Billindo Elian");
        }catch (Exception e){
            System.out.println ("ERROR"+e.getMessage());
        }
        
        Petugas petugas1=new Petugas();
            try {
            petugas1.setNama("Ernis Rahmadhani");
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }
        
        
        NoBuku noBuku1 = new NoBuku();
        noBuku1.setKodeBuku("TRX");

        try {
            noBuku1.setNomor("3157");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        buku1.setNoBuku(noBuku1);
        
        Form form1 = new Form();
        form1.setBuku(buku1);
        form1.setPetugas(petugas1);
        form1.setPeminjam(peminjam1);
        form1.setWaktuPinjam(new Date());

        cetakForm(form1);
             
        
        // TODO code application logic here
    }
    
    static void cetakForm (Form form){
    System.out.println("Nama buku : "+form.getBuku().getJudulBuku());
    System.out.println("Pengarang : "+form.getBuku().getPengarang());
    System.out.println("Penerbit : "+form.getBuku().getPenerbit());
    System.out.print("Kode Buku : "+form.getBuku().getNoBuku().getKodeBuku());
    System.out.println(form.getBuku().getNoBuku().getNomor());
    System.out.println("Nama Peminjam : "+form.getPeminjam().getNama());
    System.out.println("Tanggal Pinjam : "+form.getWaktuPinjam());
    System.out.println("Nama Petugas : "+form.getPetugas().getNama());
    
    }
}
    