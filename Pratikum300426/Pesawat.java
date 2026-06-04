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
public class Pesawat extends Udara {
    private int muatan;
    
    public Pesawat(){
        super();
    }
    
    
    public Pesawat (String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan=muatan;
    }
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
     public int getMuatan()
    {
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    public String Kategori (int muatan){
        if (muatan <= 50)
            return "Kecil";
        else if ( muatan <=150)
            return "Sedang";
        else 
                return "Besar";
    }
    @Override
    public void cetak(){
    super.cetak();
    System.out.println("Muatan: " +muatan+ " penumpang");
     System.out.println("Kategori: " +Kategori(muatan));
 
    }
}

