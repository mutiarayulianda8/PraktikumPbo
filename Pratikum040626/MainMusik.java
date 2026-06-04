/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum040626;

/**
 *
 * @author Mutiara Yulianda
 */
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard (true,"Yamaha PSR","Elektronik");
        
        System.out.println("-----Gitar-----");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("-----Keyboard-----");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
        
        

    }
    
}
