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
class Human  extends LivingThing {
    
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama){
        System.out.println("Sedang Berjalan");
    }
    
}

