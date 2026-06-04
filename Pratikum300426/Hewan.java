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
public class Hewan {
    protected String nama;
    
    public Hewan (String nama){
        this.nama = nama;
    }
    public void bersuara(){
        System.out.println("Hewan bersuara....");
    }
    public void tampilkanData(){
        System.out.println("Nama hewan: " + nama);
    }
    
}
