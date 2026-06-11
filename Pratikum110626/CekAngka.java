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
public class CekAngka {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int a,b;
    int hasil;
    try{
    System.out.print("Masukkan Bilangan Pertama=");
    a= input.nextInt();
    System.out.print("Masukkan Bilangan Kedua=");
    b = input.nextInt();
    hasil =a/b;
    System.out.println(a+"/"+b+"="+hasil);
    }catch (InputMismatchException e){
        System.out.println("Masukkan nilai berupa angka");
    }
    catch (ArithmeticException e){
        System.out.println(" Nilai ke 2/penyebut tidak boleh 0!");
    }catch(Exception e){
        System.out.println("Error tidak terduga" +e.getMessage());
    }
    finally{
}
    System.out.println("Pengecekan nilai selesai");
    }    
}