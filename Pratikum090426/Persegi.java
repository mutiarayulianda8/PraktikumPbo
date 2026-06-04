/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum090426;

/**
 *
 * @author Mutiara Yulianda
 */
public class Persegi {
    private int sisi;
    private static int jumlahObjek;
    
    Persegi(){
      jumlahObjek++;        
    }
     Persegi(int s){
      sisi = s;
      jumlahObjek++;
     }
    public void setSisi(int sisi){
     this.sisi=sisi;
        
    }
    public int getSisi(){
        return sisi;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    int HitungLuas(){
        return(sisi*sisi);
    }
    int HitungKel(){
        return (4*sisi);
    }

    void TampilanData(){
        System.out.println("Panjang sisi persegi= "+sisi);
        System.out.println("Luas persegi= "+HitungLuas());
        System.out.println("Keliling persegi= "+HitungKel());
    }
}
