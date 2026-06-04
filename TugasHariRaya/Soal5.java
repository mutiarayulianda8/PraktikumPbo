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
public class Soal5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i,na,nk;
        System.out.println("Program Quest of Twelve Relms");
        System.out.println("=============================");
        System.out.print("Masukkan Nomor Awal\t : ");
        na = input.nextInt();
        System.out.print("Masukkan Nomor Akhir\t : ");
        nk = input.nextInt();
        System.out.println("Portal Rahasia :");
        for(i=na; i<=nk; i++)
        {
            if(i%3==0 && i%4==0)
            {
             System.out.print(i+ " ");
            }
        }
    }
    
}