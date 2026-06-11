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
import java.util.*;
public class CekThrows {
//method exception
    public static void cekAngka(int a) throws Exception{
        //body throw
        if(a<0){
            throw new Exception("Nilai tidak boleh negatif!");
            
        }else if(a>100) {
            throw new Exception("Nilai tidak boleh melebihi 100");
        }
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       System.out.print("Masukkan sebuah angka = ");
       int angka = in.nextInt();
       try{
           cekAngka(angka);
           System.out.println("Nilai Berhasil Disimpan");
       }catch(Exception ex){
           System.out.println("Error"+ex.getMessage());
       }
       
    }
    
}
