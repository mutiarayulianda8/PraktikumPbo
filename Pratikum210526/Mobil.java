/*
Pembuat: Mutiara Yulianda
NIM: 2501081012
Praktek: Polymorphism
 */
package Pratikum210526;

/**
 *
 * @author Mutiara Yulianda
 */
public class Mobil extends KendaraanRental{
    private int ukuranMobil;
    private int biayaPerHari;
    private String warna;

    public Mobil(int ukuranMobil, String warna, String noPolisi, int lamaRental) {
        super(noPolisi, lamaRental);
        this.ukuranMobil = ukuranMobil;
        this.warna = warna;
    }

    public int getUkuranMobil() {
        return ukuranMobil;
    }

    public void setUkuranMobil(int ukuranMobil) {
        this.ukuranMobil = ukuranMobil;
    }

    public int getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(int biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void ProsesRental() {
        System.out.println("No Polisi             :"+noPolisi);
        System.out.println("Lama Rental Mobil     :"+lamaRental+" hari");
        System.out.println("Warna Mobil           :"+warna);
        System.out.println("Jumlah Kursi Mobil    :"+ukuranMobil +" kursi");
         switch(ukuranMobil){
            case 2: 
                biayaPerHari = 200000;
                break;
            case 4: 
               biayaPerHari=  500000;
                break;
            case 8: 
                biayaPerHari = 800000;
                break;   
        }     
        System.out.println("Biaya Rental Per Hari :Rp."+biayaPerHari);
        System.out.println("Total Keseluruhan     :Rp."+(lamaRental * biayaPerHari));
        
    }
    
    }
