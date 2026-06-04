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
public class Biawak extends Hewan {
    public Biawak (String nama){
        super (nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+" berkata: Kalau aku chat ada yang marah gak?");
    }
}
