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
public class PembayaranEwallet extends Pembayaran implements CetakStruk {
    private String jenisEwallet;

    public PembayaranEwallet(String jenisEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.jenisEwallet = jenisEwallet;
    }

    public String getJenisEwallet() {
        return jenisEwallet;
    }

    public void setJenisEwallet(String jenisEwallet) {
        this.jenisEwallet = jenisEwallet;
    }

    @Override
    public void ProsesPembayaran() {
        System.out.println("Proses pembayaran secara E-wallet!");
        System.out.println("Jenis Ewallet :"+jenisEwallet);
        System.out.println("Id Transaksi  :"+idTransaksi);
        System.out.println("Jumlah Bayar  :"+jumlahBayar);
        
    }

    @Override
    public void cetak() {
        System.out.println("~~~~~Struk E-wallet~~~~~");
        System.out.println("Jenis Ewallet :"+jenisEwallet);
        System.out.println("Id Transaksi  :"+idTransaksi);
        System.out.println("Jumlah Bayar  :"+jumlahBayar);
        System.out.println("\nTerima Kasih Sudah Berbelanja :)");
        
    }
    
    
    
}
