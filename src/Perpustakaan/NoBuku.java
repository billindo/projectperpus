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
public class NoBuku {
    private String kodeBuku;
    private String nomor;
    
    public String getKodeBuku (){
        return kodeBuku;
    }
    
    public void setKodeBuku(String kodeBuku) {
        if (kodeBuku.length() > 0
                && kodeBuku.length() <= 3) {
            this.kodeBuku = kodeBuku;
        }
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public void setNomor(String nomor) throws Exception {
        try{
            Integer.parseInt(nomor);
        } catch (Exception e){
            throw new Exception("Semua Harus Angka");
        }
        this.nomor = nomor;
    }
}
