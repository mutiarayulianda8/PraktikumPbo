/*
Pembuat : Mutiara Yulianda
Nim     : 2501081012
Tanggal : 23-April-2026
Program : Komposisi Point dan Line
 */
package Pratikum230426;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainPoint {
   public static void main(String[]args){
       Point Mut = new Point(1,2);
       System.out.println(Mut);
       
        Mut.setX(6);
        Mut.setY(2);
        System.out.println(Mut);
        System.out.println("X  : "+Mut.getX());
        System.out.println("Y  : "+Mut.getY());
        int[] xy = Mut.getXY();
        System.out.println("XY :(" + xy[0] + "," + xy[1] + ")"); 
        
        
       
   } 
}