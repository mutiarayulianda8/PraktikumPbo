/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
        super();
    }
    
    public Sepeda(int jmlRoda, String warna, String Jenis, String jmlSadel, int jmlGir){
        super(jmlRoda, warna, Jenis);
         this.jmlSadel = jmlSadel;
         this.jmlGir = jmlGir;
    }
    
    public void setJmlSadel (String jmlSadel){
        this.jmlSadel = jmlSadel;
    }
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public void setJmlGir (int jmlGir){
        this.jmlGir = jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    
    @Override
    public void Tampildata(){
        System.out.println("Jumlah Sadel:"+jmlSadel);
        System.out.println("Jumlah Gir:"+jmlGir);
    }
}
