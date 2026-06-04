/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum090426;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.Scanner;
public class MainPersegi {
    public static void main(String[]args){
        
        Persegi pp1 = new Persegi();
        pp1.setSisi(5);
        System.out.print("Jumlah Objek: "+Persegi.getJumlahObjek());
        System.out.println("Luas persegi= "+pp1.HitungLuas());
        System.out.println("Keliling persegi= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilanData();

        Persegi pp2 = new Persegi (6);
        System.out.print("\nJumlah Objek: "+Persegi.getJumlahObjek());
        System.out.println("Luas persegi= "+pp2.HitungLuas());
        System.out.println("Keliling persegi= "+pp2.HitungKel());
    
         System.out.println();
         pp2.TampilanData();

         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan sisi persegi:");
         int s = input.nextInt();
         Persegi pp3 = new Persegi(s);
         
         System.out.println();
         pp3.TampilanData();
          System.out.print("Jumlah Objek: "+Persegi.getJumlahObjek());
    }
    
}
