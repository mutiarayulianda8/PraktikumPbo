/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
public class Kendaraan {
    
    protected int jmlRoda;
    protected String warna;
    protected String Jenis;
    
    public Kendaraan(){
        
    }
    
     public Kendaraan(int jmlRoda, String warna, String Jenis){
         this.jmlRoda = jmlRoda;
         this.warna = warna;
         this.Jenis = Jenis;
    }
    
    public void setJmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    public int getJmlRoda(){
        return jmlRoda;
    }
     public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    public String getJenis(){
        return Jenis;
    }
    public void Tampildata(){
        System.out.println("Jumlah Roda Kendaraan:"+jmlRoda);
        System.out.println("Warna Kendaraan:"+warna);
        System.out.println("Jenis Kendaraan:"+Jenis);
    }
}
