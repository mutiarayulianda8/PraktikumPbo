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
public class PembayaranTransfer extends Pembayaran implements CetakStruk{
    private String namaBank;

    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void ProsesPembayaran() {
        System.out.println("Proses pembayaran secara Trsanfer");
        System.out.println("Bank         :"+namaBank);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar :"+jumlahBayar);
   
    }

    @Override
    public void cetak() {
        System.out.println("~~~~~Struk Pembayaran Transfer~~~~~");
        System.out.println("Bank         :"+namaBank);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar :"+jumlahBayar);
        System.out.println("\nTerima Kasih Sudah Berbelanja :)");
    }
    
    
}
