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
public class PembayaranKartuKredit extends Pembayaran implements CetakStruk{
    private String jenisKartu;
    private String noKartu;

    public PembayaranKartuKredit(String jenisKartu, String noKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.jenisKartu = jenisKartu;
        this.noKartu = noKartu;
    }

    public String getJenisKartu() {
        return jenisKartu;
    }

    public void setJenisKartu(String jenisKartu) {
        this.jenisKartu = jenisKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    

    @Override
    public void ProsesPembayaran() {
        System.out.println("Proses pembayaran Menggunakan Kartu Kredit");
        System.out.println("Jenis Kartu  :"+jenisKartu);
        System.out.println("No Kartu     :"+noKartu);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar :"+jumlahBayar);
    }

    @Override
    public void cetak() {
        System.out.println("~~~~~Struk Pembayaran Kartu Kredit~~~~~");
        System.out.println("Jenis Kartu  :"+jenisKartu);
        System.out.println("No Kartu     :"+noKartu);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar :"+jumlahBayar);
        System.out.println("\nTerima Kasih Sudah Berbelanja :)");


    }
    
    
}
