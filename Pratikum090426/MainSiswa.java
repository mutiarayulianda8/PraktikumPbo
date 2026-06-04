/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum090426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa pp1 = new Siswa();
        pp1.setNama("Mutiara");
        pp1.setKelas("1Tekabe");
        pp1.setAbsen(06);
        pp1.setUmur(13);
        System.out.println();
        pp1.TampilkanData(); 
        
         Siswa pp2 = new Siswa("Mutiara", "2Tekabe", 06, 13);
         pp2.TampilkanData(); 
    }
    
   
}
