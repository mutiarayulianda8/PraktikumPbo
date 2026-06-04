/*
Pembuat : Mutiara Yulianda
NIM     : 2501081012
Tanggal : 30-April-2026
Program : Inheritance Pesawat
 */
package Pratikum300426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pesawat [] daftarPesawat = new Pesawat[3];
        
        //Mengisi elemen array
        daftarPesawat[0] = new Pesawat("Boeing 737", 2015, true, 180);
        daftarPesawat[1] = new Pesawat("Airbus A320", 2020, true, 140);
        daftarPesawat[2] = new Pesawat("Cessna 172", 2008, false, 4);
        
        //Menampilkan semua data Pesawat
        for (int i = 0; i < daftarPesawat.length; i++){
            System.out.println("=== Data Pesawat ke-" + (i + 1) + "===");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
    
}
