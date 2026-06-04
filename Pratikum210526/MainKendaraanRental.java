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
public class MainKendaraanRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        KendaraanRental Rental = null;
       System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0="); 
       System.out.println("=0=0=0=0=Sistem Rental Kendaraan=0=0=0=0=");
       System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        
       System.out.println("\nPilih Kendaraan Yang Ingin Dirental!");
       System.out.println("1. Motor");
       System.out.println("2. Mobil");
       System.out.println("3. Bus");
       System.out.print("Pilih Kendaraan :");
       int pil = input.nextInt();
       input.nextLine();
       
       System.out.print("Masukkan No Polisi:");
       String noPolisi = input.nextLine();
       
       System.out.print("Masukkan Lama Merental:");
       int lamaRental = input.nextInt();
       
       switch(pil){
           case 1: 
           System.out.print("Masukkan Biaya Rental Per Hari :");
           int biayaPerHari = input.nextInt();
           input.nextLine();
           System.out.print("Masukkan Jenis Motor (Mathic/Gigi) :");
           String jenisMotor = input.nextLine();
           Rental = new Motor( biayaPerHari,jenisMotor, noPolisi, lamaRental);
           break;
        
                        
           case 2:
           input.nextLine();
           System.out.print("Masukkan Warna Mobil :");
           String warna = input.nextLine();
           System.out.println("~!~!~!Pilih Ukuran Mobil!~!~!~");
           System.out.println("2. Kecil  (2 kursi)");
           System.out.println("4. Sedang (4 kursi)");
           System.out.println("8. Besar  (8 kursi)");
           System.out.print("Pilih Kendaraan :");
           int ukuranMobil = input.nextInt();
           Rental = new Mobil ( ukuranMobil,warna, noPolisi,lamaRental);
           break;
               
           case 3: 
               System.out.print("Masukkan Kapasitas Bus :");
               int kapasitas = input.nextInt();
               System.out.print("Masukkan Biaya Sopir :");
               int sopir = input.nextInt();
               Rental = new Bus (kapasitas, sopir, noPolisi, lamaRental);
               break;      
       }
        System.out.println("\n========================================");
        System.out.println("~~~Transkripsi Biaya Rental Kendaraan~~~");
        System.out.println("========================================");
        Rental.ProsesRental();
    }
    
}
