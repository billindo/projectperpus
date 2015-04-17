/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;
import java.util.Date;
/**
 *
 * @author AMD64
 */
public class Form {
    private String kode;
    private Petugas petugas;
    private Peminjam peminjam;
    private Buku buku;
    private Date waktuPinjam;
    
    
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public Petugas getPetugas() {
        return petugas;
    }
    
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
    
    public Peminjam getPeminjam() {
        return peminjam;
    }
    
    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }
    
    
    public Buku getBuku() {
        return buku;
    }
    
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public Date getWaktuPinjam() {
        return waktuPinjam;
    }
    
    public void setWaktuPinjam(Date waktuPinjam) {
        this.waktuPinjam = waktuPinjam;
    }
}
