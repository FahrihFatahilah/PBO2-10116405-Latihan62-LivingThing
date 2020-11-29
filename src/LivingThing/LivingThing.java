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
public abstract class  LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println("Bernafas");
        
    }
    
    public void eat(String nama){
        System.out.println("Makan");
        
    }
    
    
}
