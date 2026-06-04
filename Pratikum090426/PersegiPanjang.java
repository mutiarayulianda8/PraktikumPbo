/*
Pembuat : Mutiara Yulianda
Tanggal : 09-April-2026
Program : Persegi Panjang Enkapsulasi
 */
package Pratikum090426;

/**
 *
 * @author Lab_Jaringan_05
 */
public class PersegiPanjang { //public = access modifier??
    //atribbut variabel
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
     
    
    //costructor kosong
    PersegiPanjang(){
        jumlahObjek ++;
    }
    
    //constructor 2 overloading
    PersegiPanjang(int p, int l){
        panjang=p;
        lebar=l;
        jumlahObjek ++;
    }
    ///Getter dan Setter
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    public int getPanjang(){
     return panjang;
    }
 
    
    public void setlebar(int lebar){
        this.lebar = lebar;
    }
    public int getLebar(){
        return lebar;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    int HitungLuas(){
        return(panjang*lebar);
    }
    
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    // method tanpa kembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang=" +panjang);
        System.out.println("lebar Persegi Panjang=" +lebar);
        System.out.println("Luas Persegi Panjang=" +HitungLuas());
        System.out.println("Keliling Persegi Panjang=" +HitungKel());
        
    }
}