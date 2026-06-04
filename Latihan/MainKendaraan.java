/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.Scanner;
public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Mobil mo = new Mobil();
        mo.setBahanBakar("Pertamaxx Turbo");
        mo.setKapasitasMesin(150);
        mo.setJmlRoda(4);
        mo.setWarna("Kuning");
        
        System.out.println("Mobil");
        System.out.println("Bahan Bakar:" +mo.getBahanBakar());
        System.out.println("Kapasitas Mesin:" +mo.getKapasitasMesin());
        System.out.println("Jumlah Roda:" +mo.getJmlRoda());
        System.out.println("Warna Mobil: " +mo.getWarna());
        
        Sepeda se = new Sepeda();
        se.setJmlSadel("gak tau");
        se.setJmlGir(4);
        se.setWarna("Hitam");
        
        System.out.println("\nSepeda");
        System.out.println("Jumlah Sadel:"+se.getJmlSadel());
        System.out.println("Jumlah Gir:"+se.getJmlGir());
        System.out.println("Warna:"+se.getWarna());
        
        
         Truk tr = new Truk();
        tr.setBahanBakar("Solarrrr");
        tr.setKapasitasMesin(500);
        tr.setJmlRoda(8);
        tr.setWarna("Hijau");
        tr.setMuatanMaks(1000);
        
        System.out.println("\nTruk");
        System.out.println("Bahan Bakar:" +tr.getBahanBakar());
        System.out.println("Kapasitas Mesin:" +tr.getKapasitasMesin());
        System.out.println("Jumlah Roda:" +tr.getJmlRoda());
        System.out.println("Warna Mobil: " +tr.getWarna());
        System.out.println("Maksimal Muatan:"+tr.getMuatanMaks());
        
  
        
        System.out.print("\n\nInput User");
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nJenis Kendaraan:");
         String Jenis = input.nextLine();
        
        System.out.print("Jumlah Roda:");
         int jmlRoda = input.nextInt();
         
         input.nextLine();
         
        System.out.print("Warna:");
         String warna = input.nextLine();
        
        System.out.print("Bahan Bakar:");
         String bahanBakar = input.nextLine();
         
        System.out.print("Kapasitas Mesin:");
         int kapasitasMesin = input.nextInt();
         
        System.out.print("Tarif Awal:Rp.");
         int tarifAwal = input.nextInt();
         
        System.out.print("Tarif Per Km:Rp.");
         int tarifPerKm = input.nextInt();
         
          Taksi tk = new Taksi();
         
        tk.setJenis(Jenis);
        tk.setJmlRoda(jmlRoda);
        tk.setWarna(warna);
        tk.setBahanBakar(bahanBakar);
        tk.setKapasitasMesin(kapasitasMesin);
        tk.setTarifAwal(tarifAwal);
        tk.setTarifPerKm(tarifPerKm);
        
        
        System.out.println("\n===Data Kendaraan===");
        System.out.println("Jenis Kendaraan:"+tk.getJenis());
        System.out.println("Jumlah Roda:"+tk.getJmlRoda());
        System.out.println("Warna:"+tk.getWarna());
        System.out.println("Bahan Bakar:"+tk.getBahanBakar());
        System.out.println("Kapasitas Mesin:"+tk.getKapasitasMesin());
        System.out.println("Tarif Awal:"+tk.getTarifAwal());
        System.out.println("Tarif Per Km:"+tk.getTarifPerKm());
        
    
      
    }
    
}
