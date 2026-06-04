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
public class Soal3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int na,nk,i;
        int banyak =0;
        int jumlah = 0;
        double ratarata;
        System.out.println("Program Deret Bilangan");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Awal\t : ");
        na = input.nextInt();
        System.out.print("Masukkan NIlai Akhir\t : ");
        nk = input.nextInt();
        
        for(i=na; i<=nk; i++ )
        {
            if(i%11==0 && i%2!=0)
            {
                System.out.print(i+ " ");
                jumlah = jumlah+i;
                banyak = banyak +1;
            }
        }
        System.out.println("\nJumlah Deret :" + jumlah);
        if(banyak >0)
        {
          ratarata = (double) jumlah/banyak;  
          System.out.println("Rata - rata Deret :" + ratarata);
        }
        else
        {
           System.out.println("Rata-rata tidak valid");
        }
        
       }
    }

               
       
    
    
