/*
Pembuat: Mutiara Yulianda
NIM: 2501081012
Praktek: Polymorphism
 */
package Pratikum210526;


public class KaryawanKontrak extends Karyawan {
    private int honor;
    private int uangMakan = 300000;

    public KaryawanKontrak(int honor,String nama, String Nik) {
        super(nama, Nik);
        this.honor = honor;
        
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(int uangMakan) {
        this.uangMakan = uangMakan;
    }

    @Override
    public void TampilkanData() {
        System.out.println("\nKaryawan Kontrak");
        System.out.println("Nama Karyawan          :"+nama);
        System.out.println("NIK Karyawan           :"+Nik);
        System.out.println("Honor Kontrak Karyawan :"+honor);
        System.out.println("Uang Makan Karyawan    :"+uangMakan);
        
        double totalGaji = honor + uangMakan;
        System.out.println("Total Gaji Karyawan    :"+totalGaji);
        
        
    }
   
    
    
}
