/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
public class Truk extends Mobil{
    protected int muatanMaks;
    
    public Truk(){
        super();
    }
    
   public Truk(int jmlRoda, String warna, String Jenis, String bahanBakar, int kapasitasMesin, int muatanMaks){
        super(jmlRoda, warna,Jenis, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public void Tampildata(){
        super.Tampildata();
        System.out.println("Maksimal Muatan:"+muatanMaks);
    }
    
}
