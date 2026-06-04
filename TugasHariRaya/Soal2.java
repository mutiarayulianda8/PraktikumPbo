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
public class Soal2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int merek,jumlah;
        double diskon=0,totalpembelian=0;
        double totalpembayaran=0,harga =0;
        System.out.println("==== Program Pembelian Product ====");
        System.out.print("Merek Susu bayi\n 1.Merek X \n 2.Merek Y \n 3.Merek z");
        System.out.print("\nMasukkan pilihan (1-3):");
        merek = input.nextInt();
        System.out.print("Masukkan jumlah yang dibeli: ");
        jumlah = input.nextInt();
        switch(merek){
            case 1:
            {
              System.out.println("Susu Merek X");
              harga = 40000;
              totalpembelian = jumlah*harga;
                if(jumlah >=3)
                {
                diskon = totalpembelian*0.1;
                }
                else
                {
                diskon =0;  
                }
            }break;
                  
            case 2:
              {
                System.out.println("Susu Merek Y");
                harga = 50000;
                totalpembelian = harga * jumlah;
                if(jumlah > 3 )
                {
                  diskon = totalpembelian *0.12;
                }
              else
                {
                  diskon = 0;
             
                }
            }break;
            case 3:
                System.out.println("Susu Merek Z");
                harga = 60000;
                totalpembelian = harga * jumlah;
            {
             if(jumlah>=2)
            {
               
                diskon = (jumlah - 1)*harga* 0.15;
                
            }
            else{
                diskon =0;
              
            } 
            }  break;  
            
        }
        totalpembayaran  = totalpembelian - diskon;
        System.out.println("Harga barang\t\t\t: Rp." +harga+ ",-");
        System.out.println("Total Pembelian \t\t: Rp." +totalpembelian+ ",-");
        System.out.println("Diskon \t\t\t\t: Rp." +diskon+ ",-");
        System.out.println("harga yang harus dibayar \t: Rp." +totalpembayaran+ ",-");
    }
}
        
    
    
