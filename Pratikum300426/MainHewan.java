/*
Pembuat : Mutiara Yulianda
NIM     : 2501081012
Tanggal : 30-April-2026
Program : Inheritance Hewan
 */
package Pratikum300426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan hewanUmum = new Hewan("Makhluk");
        Anjing anjingku = new Anjing ("Anjing");
        Biawak biawakku = new Biawak ("Biawak");
        
        hewanUmum.tampilkanData();
        hewanUmum.bersuara();
        
        System.out.println();
        
        anjingku.tampilkanData();
        anjingku.bersuara();
    
          System.out.println();
          
          biawakku.tampilkanData();
        biawakku.bersuara();
    
          System.out.println();
    
    }
    
}
