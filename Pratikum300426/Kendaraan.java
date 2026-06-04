/*
Pembuat : Mutiara Yulianda
NIM     : 2501081012
Tanggal : 30-April-2026
Program : Inheritance Pesawat
 */
package Pratikum300426;

/**
 *
 * @author Mutiara Yulianda
 */
public class Kendaraan {
    
    private String nama;
    private int tahunProduksi;
    
    public Kendaraan(){
        
    }
    

public Kendaraan(String nama, int tahunProduksi){
    this.nama = nama;
    this.tahunProduksi = tahunProduksi;
}
public String getNama(){
    return nama;
}
public void setNama(String nama){
    this.nama = nama;
} 
public int getTahunProduksi(){
    return tahunProduksi;
}
public void setTahunProduksi(int tahunProduksi){
    this.tahunProduksi = tahunProduksi;
} 
 public void cetak(){
    System.out.println("Nama Kendaraan: " +nama);
    System.out.println("Tahun Produksi: "+tahunProduksi);
    }
    
    
    
}
