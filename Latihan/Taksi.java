/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(){
        super();
    }
    
   public Taksi(int jmlRoda, String warna, String Jenis, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm){
        super(jmlRoda, warna, Jenis, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public int getTarifAwal(){
        return tarifAwal;
    }
    
     public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    @Override
    public void Tampildata(){
        super.Tampildata();
        System.out.println("Tarif Awal:"+tarifAwal);
        System.out.println("Tarif Per Km:"+tarifPerKm);
    }
}
