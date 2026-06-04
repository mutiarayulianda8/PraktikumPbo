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
public class Bus extends KendaraanRental{
    private int biayaPerHari;
    private int kapasitas;
    private int sopir ;

    public Bus(int kapasitas, int sopir, String noPolisi, int lamaRental) {
        super(noPolisi, lamaRental);
        this.kapasitas = kapasitas;
        this.sopir = sopir;
    }

    public int getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(int biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getSopir() {
        return sopir;
    }

    public void setSopir(int sopir) {
        this.sopir = sopir;
    }
    

    @Override
    public void ProsesRental() {
        System.out.println("No Polisi             :"+noPolisi);
        System.out.println("Lama Rental Bus       :"+lamaRental+" hari");
        System.out.println("Kapasitas Bus         :"+kapasitas+" penumpang");
            if(kapasitas >= 10 && kapasitas <= 20){
            biayaPerHari = 800000;
                }
            else if(kapasitas >20 && kapasitas <= 35){
            biayaPerHari = 1200000;
            }
            else if(kapasitas >35  && kapasitas <=50){
            biayaPerHari = 1500000;
            }
            else if (kapasitas >50){
            biayaPerHari = 2000000;
            }       
        System.out.println("Biaya Rental Per Hari :Rp."+biayaPerHari);
        System.out.println("Biaya Jasa Sopir      :Rp."+sopir);
        System.out.println("Total Keseluruhan     :Rp."+(lamaRental * biayaPerHari + sopir));
        
    }
    
}
