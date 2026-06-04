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
public abstract class Karyawan {
  protected String nama;
  protected String Nik;

    public Karyawan() {
    }

    public Karyawan(String nama, String Nik) {
        this.nama = nama;
        this.Nik = Nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }
    
    public abstract void TampilkanData();
   
}
