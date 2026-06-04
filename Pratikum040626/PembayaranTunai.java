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
public class PembayaranTunai extends Pembayaran implements CetakStruk{
    private double uang;

        public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
            super(jumlahBayar, idTransaksi);
            this.uang = uang;
        }

        public double getUang() {
            return uang;
        }

        public void setUang(double uang) {
            this.uang = uang;
        }
        
        @Override
    public void ProsesPembayaran() {
        System.out.println("Proses pembayaran secara Tunai");
        System.out.println("Id Transaksi        :"+idTransaksi);
        System.out.println("Jumlah Bayar        :Rp."+jumlahBayar);
        System.out.println("Jumlah Uang Nasabah :Rp."+uang);
        
        if (uang>jumlahBayar)
        {
            double kembalian = uang-jumlahBayar;
            System.out.println("Proses Pembayaran Berhasil!");
            System.out.println("Uang Kembalian :Rp."+kembalian);
            
        }
        else{
            double kekurangan = jumlahBayar-uang;
            System.out.println("Proses Pembayaran Gagal!!!");
            System.out.println("Uang Anda Kurang Sebanyak :Rp."+kekurangan);
            System.out.println("\nSilahkan Ulangi Proses Pembayaran!!! :(");
        }
    }

    @Override
    public void cetak() {
        System.out.println("~~~~~Struk Tunai~~~~~");
        System.out.println("Id Transaksi        :"+idTransaksi);
        System.out.println("Jumlah Bayar        :Rp."+jumlahBayar);
        System.out.println("Jumlah Uang Nasabah :Rp."+uang);
        
        if (uang>jumlahBayar)
        {
            double kembalian = uang-jumlahBayar;
            System.out.println("Proses Pembayaran Berhasil!");
            System.out.println("Uang Kembalian :Rp."+kembalian);
            System.out.println("\nTerima Kasih Sudah Berbelanja :)");
        }
        else{
            double kekurangan = jumlahBayar-uang;
            System.out.println("Proses Pembayaran Gagal!!!");
            System.out.println("Uang Anda Kurang Sebanyak :Rp."+kekurangan);
            System.out.println("\nSilahkan Ulangi Proses Pembayaran!!! :(");
        }
        }
    }

   
    

    
    
    
    

