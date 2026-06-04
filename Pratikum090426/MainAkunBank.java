/*
Pembuat : Mutiara Yulianda
Tanggal : 09-April-2026
Program : Akun Bank Enkapsulasi
 */
package Pratikum090426;

/**
 *
 * @author Mutiara Yulianda
 */
import java.util.Scanner;
public class MainAkunBank {
     public static void main(String[]args){
    AkunBank pp1 = new AkunBank();
    pp1.setNama("Mutiara");
    pp1.setNoRekening("89.....");
    pp1.setSaldo(1000000);
    pp1.TampilkanInfo();
    
    System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.print("\nMasukan Jumlah Deposit = ");
    double deposit = input.nextDouble();
    pp1.deposit(deposit);
    pp1.TampilkanInfo();
    System.out.print("\nMasukan Jumlah Withdraw =");
    double withdraw = input.nextDouble();
    pp1.withdraw(withdraw);
    pp1.TampilkanInfo();
    System.out.println();
    
    System.out.print("\nMasukan Jumlah Deposit = ");
    double depositt = input.nextDouble();
    System.out.print("Masukan Jumlah Withdraw =");
    withdraw = input.nextDouble();
    AkunBank pp2 = new AkunBank("89.....","Mutiara",1000000);
    pp2.deposit(depositt);
    pp2.withdraw(withdraw);
    pp2.TampilkanInfo();
        
    
    }
    
}