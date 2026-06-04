/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum040626;

/**
 *
 * @author Mutiara Yulianda
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
    

    @Override
    public void mainkan() {
       System.out.println(nama+ " dipetik dengan"+jumlahSenar+" senar.");
    }

    @Override
    public void stem() {
        System.out.println(" Menyetem gitar"+nama+" secara manual");
 
    }
}
