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
public class Anjing extends Hewan {
    public Anjing(String nama){
        super (nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();// Mengakses atribut/method superclass
        System.out.println(nama + " berkata: Guk guk");
    }
    
}
