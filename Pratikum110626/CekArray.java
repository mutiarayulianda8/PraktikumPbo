/*
Nama: Mutiara Yulianda
NIM: 2501081012
Tanggal: 11 Juni 2026
Pratikum: Exception
 */
package Pratikum110626;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] angka = {10,20,30,40,50};
        try{
        System.out.print("Mau ditampilkan array indeks ke berapa = ");
        int index = input.nextInt();
        System.out.print("Dibagi dengan = ");
        int n = input.nextInt();
        int hasil = angka[index]/n;
        System.out.println("Hasil Pembagian = "+hasil);
        }catch(InputMismatchException a){
            System.out.print("Pastikan input berupa bilangan bulat!");
        }catch (ArithmeticException a){
            System.out.print("Angka pembagi tidak boleh 0!");
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index diluar range array!");
        }finally{
            System.out.println("~~~~~Tampilan Array~~~~~");
            System.out.println("Cara 1");
            for (int i=0;i<angka.length;i++)
                System.out.print(" "+angka[i]);
            System.out.println();
            System.out.println("Cara 2");
            System.out.println("Isi array = "+Arrays.toString(angka));
            
        }
    }
}
    
