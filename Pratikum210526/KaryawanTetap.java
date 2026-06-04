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
public class KaryawanTetap extends Karyawan{
    private int golongan;
    private int gajiPokok;
    private double tunjangan;

    public KaryawanTetap() {
    }

    public KaryawanTetap(int golongan, String nama, String Nik) {
        super(nama, Nik);
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    

    @Override
    public void TampilkanData(){
        System.out.println("\nKaryawan Tetap");
        System.out.println("Nama Karyawan        :"+nama);
        System.out.println("NIK Karyawan         :"+Nik);
        System.out.println("Golongan Karyawan    :"+golongan);
         switch(golongan){
            case 1: 
                gajiPokok = 1000000;
                break;
            case 2: 
               gajiPokok = 2000000;
                break;
            case 3: 
                gajiPokok = 3000000;
                break;   
                
            default:
                System.out.println("Golongan Tidak Tersedia!!!");
        }
        tunjangan = 0.12 * gajiPokok;
         
        System.out.println("Gaji Pokok Karyawan  :"+gajiPokok);          
        System.out.println("Tunjangan Karyawan   :"+tunjangan); 
        
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji Karyawan  :"+totalGaji);
    }
}
