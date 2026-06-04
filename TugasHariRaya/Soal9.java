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
public class Soal9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i,n,j,k;
        System.out.println("Program Segitiga");
        System.out.println("========================");
        System.out.print("Masukkan ukuran input : ");
        n = input.nextInt();
        for(i=n; i>=1; i--)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(k=i; k<=n; k++)
            {
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    } 
}