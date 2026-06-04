/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
public class Mobil extends Kendaraan{
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(){
        super();
    }
    
    public Mobil(int jmlRoda, String warna, String Jenis, String bahanBakar, int kapasitasMesin){
        super(jmlRoda, warna, Jenis);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    public String getBahanBakar(){
        return bahanBakar;
    }
     public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    @Override
     public void Tampildata(){
        System.out.println("Bahan Bakar:"+bahanBakar);
        System.out.println("Kapasitas Mesin:"+kapasitasMesin);
    }
    
}
