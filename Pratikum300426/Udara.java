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
public class Udara extends Kendaraan{
    private boolean mesin;
    
    public Udara(){
        super();
    }
    
    public Udara (String nama, int tahunProduksi, boolean mesin){
        super( nama,tahunProduksi);
        this.mesin = mesin;
    }
    public boolean getMesin()
    {
        return mesin;
    }
    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }
    @Override
    public void cetak(){
    super.cetak();
    System.out.println("Menggunakan Mesin: "+(mesin? "Ya": "Tidak"));
    }
    
    
}
