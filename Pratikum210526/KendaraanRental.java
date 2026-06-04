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
public abstract class KendaraanRental {
    protected String noPolisi;
    protected int lamaRental;

    public KendaraanRental() {
    }

    public KendaraanRental(String noPolisi, int lamaRental) {
        this.noPolisi = noPolisi;
        this.lamaRental = lamaRental;
    }

    @Override
    public String toString() {
        return "KendaraanRental{" + "noPolisi=" + noPolisi + ", lamaRental=" + lamaRental + '}';
    }
    
    public abstract void ProsesRental();
    
  
    
}
