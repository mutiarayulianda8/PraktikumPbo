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
import java.util.Scanner;
public class MainPesegiPanjang {
        public static void main(String[]args){
        // TODO application logic here
        //object pp1 menggunakan constructor 1
       
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(10);
        pp1.setlebar(7);
        System.out.print("Jumlah Objek:"+PersegiPanjang.getJumlahObjek());
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 1 menggunakan konstruktor 1");
        System.out.println("Luas Persegi panjang = "+pp1.HitungLuas());
        System.out.println("Keliling Persegi Panjang= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
                         
        // Object pp2 menggunakan constructor 2
        System.out.println("\n\nAkses method dalam main class");
        System.out.println("objek 2 menggunakan konstruktor 2");
        PersegiPanjang pp2 = new PersegiPanjang(19,10);
        System.out.println("Luas Persegi panjang = "+pp2.HitungLuas());
        System.out.println("Keliling Persegi Panjang= "+pp2.HitungKel());
        
        System.out.println();
        pp2.TampilData();
        
       //object pp3 menggunakan constructor 3
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 3 menggunakan konstruktor 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar:");
        int l = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(p,l);
        System.out.println();
        pp3.TampilData();
        System.out.print("Jumlah Objek:"+PersegiPanjang.getJumlahObjek());
        
        
    }
    
}