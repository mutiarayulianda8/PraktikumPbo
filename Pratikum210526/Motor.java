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
public class Motor  extends KendaraanRental{
    private int biayaPerHari;
    private String jenisMotor;

    public Motor(int biayaPerHari,String jenisMotor, String noPolisi, int lamaRental) {
        super(noPolisi, lamaRental);
        this.biayaPerHari = biayaPerHari;
        this.jenisMotor = jenisMotor;
    }

    public int getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(int biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    

    @Override
    public void ProsesRental() {
        System.out.println("No Polisi             :"+noPolisi);
        System.out.println("Lama Rental Mobil     :"+lamaRental+" hari");
        System.out.println("Biaya Rental Per Hari :Rp."+biayaPerHari);
        System.out.println("Total Keseluruhan     :Rp."+(lamaRental * biayaPerHari));
        System.out.println("Jenis Motor           :"+jenisMotor);
        
    }
    
}
