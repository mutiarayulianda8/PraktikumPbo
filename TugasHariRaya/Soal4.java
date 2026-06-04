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
public class Soal4 {
    public static void main(String[]args){
       Scanner input =new Scanner(System.in);
       int n;
       System.out.println("==== Program input bilangan ====");
       
       do
       {
           System.out.print("Masukkan angka :");
           n = input.nextInt();
        
       }while(n%2!=0);
      n = n+1;
      System.out.println("Angka genap +1 :"+n);
    }
}