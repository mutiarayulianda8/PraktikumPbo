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
public class Soal7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jumlahjam;
        int upahlembur=0;
        int totallembur;
        System.out.println("Lembur Karyawan");
        System.out.println("========================");
        System.out.print("Masukkan jumlah jam lembur \t: ");
        jumlahjam = input.nextInt();
        if(jumlahjam<=20)
        {
            upahlembur = 2000;
        }
        else if(jumlahjam > 20 && jumlahjam <=50)
        {
            upahlembur = 3000;
        }
        else
        {
          jumlahjam=50;
          upahlembur = 3000;
        }
       totallembur = jumlahjam*upahlembur;
       System.out.println("Upah lembur\t\t\t: Rp." +upahlembur+ ",-");
       System.out.println("Total upah lembur karyawan\t: Rp." + totallembur+ ",-");
    }   
}