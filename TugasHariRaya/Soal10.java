/*
Pembuat : Mutiara Yulianda 
Nim     : 2501081012
Tanggal : 16-Maret-2026
*/
package TugasHariRaya;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.Scanner;
public class Soal10 {
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int kelas=0,tujuan,jumlahtiket=0;
      int hargatiket=0;
      double diskon=0,totalhargatiket=0,pembayaran=0;
      System.out.println("Program Pembelian Tiket");
      System.out.println("=============================");
      System.out.println("Tujuan\n 1.Jakarta\n 2.Yogya\n 3.Surabaya");
      System.out.print("Masukkan tujuan :");
      tujuan = input.nextInt();
   
      switch(tujuan)
      {
          
          case 1:
          {
              System.out.println("1.jakarta");
              System.out.print("Masukkan jumlah tiket :");
              jumlahtiket = input.nextInt();
              System.out.println("Pilihan kelas\n 1.Eksekutif\n 2.Bisnis\n 3.Ekonomi");
              System.out.print("Masukkan piilihan kelas :");
              kelas = input.nextInt();
     
              
              switch(kelas)
              
              {
                  case 1:  
                  {
                    System.out.println("1.Eksekutif");
                    hargatiket = 70000;
                  }break;
                  case 2:
                  {
                    System.out.println("2.Bisnis");
                    hargatiket = 40000;
                  }break;
                  case 3:
                  {
                    System.out.println("3.Ekonomi");
                    hargatiket = 10000;
                  }break;
                  default : System.out.println();
              }
            
          }break;
        case 2:
        {
            System.out.println("2.Yogya");
            System.out.print("Masukkan jumlah tiket :");
            jumlahtiket = input.nextInt();
            System.out.println("Pilihan kelas\n 1.Eksekutif\n 2.Bisnis\n 3.Ekonomi");
            System.out.print("Masukkan piilihan kelas :");
            kelas = input.nextInt();
            switch(kelas)
            {
                case 1:
                {
                System.out.println("1.Eksekutif");
                hargatiket = 80000;
                }break;
                case 2:
                {
                System.out.println("2.Bisnis");
                hargatiket = 50000;
                }break;
                case 3:
                {
                    System.out.println("3.Ekonomi");
                    hargatiket = 20000;
                   
                }break;
            }
        }break;
        case 3:
        {
            System.out.println("3.Surabaya");
            System.out.print("Masukkan jumlah tiket :");
            jumlahtiket = input.nextInt();
            System.out.println("Pilihan kelas\n 1.Eksekutif\n 2.Bisnis\n 3.Ekonomi");
            System.out.print("Masukkan piilihan kelas :");
            kelas = input.nextInt();
            switch(kelas)
            {
                case 1:
                {
                    System.out.println("1.Eksekutif");
                    hargatiket = 90000;
                }break;
                case 2:
                {
                    System.out.println("2.Bisnis");
                    hargatiket = 60000;
                }break;
                case 3:
                {
                    System.out.println("3.Ekonomi");
                    hargatiket = 30000;
                }break;
            }
        }break;
         
      }
    totalhargatiket = jumlahtiket * hargatiket; 
    if ((tujuan == 2 && kelas == 3 && jumlahtiket >= 4) ||
        (tujuan == 3 && kelas == 1 && jumlahtiket >= 4))
    {
    diskon = totalhargatiket * 0.1;
    } 
    else
    {
     diskon = 0;
    }
      pembayaran = totalhargatiket - diskon;
      System.out.println("Harga Tiket\t\t : Rp."+hargatiket+ ",-");
      System.out.println("Diskon\t\t\t : Rp."+diskon+ ",-");
      System.out.println("Total tiket\t\t : Rp."+totalhargatiket+",-");
      System.out.println("Total pembayaran\t : Rp."+pembayaran+ ",-");
      
  }  
}