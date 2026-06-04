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
public class MainPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran = null;
        CetakStruk c=null;
       
        System.out.println("==================================");
        System.out.println("~~~Sistem Pembayaran Mall Tiara~~~");
        System.out.println("==================================");
        
        System.out.print("Masukkan Id Transaksi     : ");
        String idTransaksi = input.nextLine();
        
        System.out.print("Masukkan Total Pembayaran : ");
        double jumlahPembayaran = input.nextDouble();
        input.nextLine();//clear buffer
        
        System.out.println("\nPilih Proses Pembayaran!!!");
        System.out.println("1. Pembayaran Secara Tunai");
        System.out.println("2. Pembayaran Secara Transfer");
        System.out.println("3. Pembayaran Secara E-Wallet");
        System.out.println("4. Pembayaran Secara Kartu Kredit");
        System.out.print("Pilihan Anda:");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
                
            case 1 : System.out.print("Masukkan Jumlah Uang :");
            double uang =input.nextDouble();
            pembayaran = new PembayaranTunai(uang, jumlahPembayaran, idTransaksi);
            c= (CetakStruk)pembayaran;
            break;
           
            case 2 : System.out.print("Masukkan Nama Bank :");
            String namaBank = input.nextLine();
            pembayaran = new PembayaranTransfer(namaBank, jumlahPembayaran, idTransaksi);
            c= (CetakStruk)pembayaran;
            break;
            
            case 3 : System.out.print("Masukkan Jenis E-Wallet :");
            String jenisEwallet = input.nextLine();
            pembayaran = new PembayaranTransfer(jenisEwallet, jumlahPembayaran, idTransaksi);
            c= (CetakStruk)pembayaran;
            break;
            
            case 4 : System.out.print("Masukkan Jenis Kartu :");
            String jenisKartu = input.nextLine();
            pembayaran = new PembayaranTransfer(jenisKartu, jumlahPembayaran, idTransaksi);
            c= (CetakStruk)pembayaran;
            
            break;
            
        }
          System.out.println("\n=========================");
          System.out.println("~~~Konfirmasi pembayaran~~~");
          System.out.println("===========================");
        pembayaran.ProsesPembayaran();
          
        System.out.println();
        c.cetak();
    }
    
}
