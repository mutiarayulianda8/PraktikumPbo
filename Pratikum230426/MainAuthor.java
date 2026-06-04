/*
Pembuat : Mutiara Yulianda
Nim     : 2501081012
Tanggal : 23-April-2026
Program : Komposisi Author dan Book
 */
package Pratikum230426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainAuthor {
    public static void main(String[]args){
        Author Mut = new Author ("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Mut);
        
        Mut.setEmail("peter@nowhere.com");
        System.out.println(Mut);
        System.out.println("Name:"+Mut.getNama());
        System.out.println("gender:"+Mut.getGender());
        System.out.println("Gmail:"+Mut.getEmail());
        
    }
    
}