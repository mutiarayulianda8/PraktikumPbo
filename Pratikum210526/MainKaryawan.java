/*
Pembuat: Mutiara Yulianda
NIM: 2501081012
Praktek: Polymorphism
 */
package Pratikum210526;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.Scanner;
public class MainKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Karyawan karyawan = null;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Transkripsi Gaji Karyawan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        
       System.out.println("Pilih Status Karyawan!");
       System.out.println("1. Karyawan Tetap");
       System.out.println("2. Karyawan Kontrak");
       System.out.print("Masukkan Pilihan :");
       int pil = input.nextInt();
       input.nextLine();
        
       System.out.print("Masukkan Nama Karyawan :");
       String nama = input.nextLine(); 
       
       System.out.print("Masukkan NIK Karyawan  :");
       String Nik = input.nextLine();
      
       
       if(pil == 1)
       {
       System.out.println("Pilih Golongan Karyawan Tetap!!");
       System.out.println("1. Golongan 1");
       System.out.println("2. Golongan 2");
       System.out.println("3. Golongan 3");
       System.out.print("Masukkan Golongan :");
       int golongan = input.nextInt();
       karyawan = new KaryawanTetap (golongan,nama,Nik);
           
       }
       else
       {
           System.out.print("Masukkan Honor Kontrak :");
           int honor = input.nextInt();
           karyawan = new KaryawanKontrak (honor,nama,Nik);
       }
       
        System.out.println("\n=========================");
        System.out.println("~~~Data Gaji Karyawan~~~");
        System.out.println("===========================");
        karyawan.TampilkanData();
       
       
    }
    
}
