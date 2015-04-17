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
public class Buku {
    private String jenis;
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    private NoBuku noBuku;
    
    public String getJenis() {
        return jenis;
    }
    
    
    public void setJenis(String jenis) throws Exception {
        if (jenis.equalsIgnoreCase("Fiksi")
                || jenis.equalsIgnoreCase("Non-fiksi")) {
            this.jenis = jenis;
        } else {
            throw new Exception("Harus Fiksi atau Non-fiksi saja");
        }
    }
    
    public String getJudulBuku() {
        return judulBuku;
    }

    
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

  
    public String getPengarang() {
        return pengarang;
    }

    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    
    public String getPenerbit() {
        return penerbit;
    }

    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public NoBuku getNoBuku() {
        return noBuku;
    }
    
    public void setNoBuku(NoBuku noBuku) {
        this.noBuku = noBuku;
    }
}
