/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivingThing;

/**
 *Nama  : Fahrih Fatahilah
 *Kelas : PBO2
 *NIM   : 10116405
 *Deskripi Program : program ini berisi program yang berisi tentang livingthing
 *                   seseorang
 */
public class LivingThingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        System.out.print(human.getNama()+" ");
        human.walk("");
        System.out.print(human.getNama()+" ");
        human.breath("");
        System.out.print(human.getNama()+" ");
        human.eat("");
    }
    
}
