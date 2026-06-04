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
public class Soal8 {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in); 
       int i,j,n;
       System.out.println("Program  Menampilkan Bentuk");
       System.out.println("============================");
       System.out.print("Masukkan nilai : ");
       n = input.nextInt();
       for(i=1; i<=n; i++)
       {
           for(j=1; j<=n; j++)
           {
               if (i==1||i==n)
               {
                System.out.print("0 "); 
               }
               else if (i==j)
               {
                   System.out.print("0 ");
               }
               else
               {
                   System.out.print("x ");
               }
           }
         
            System.out.println();
       }
    }
    
}