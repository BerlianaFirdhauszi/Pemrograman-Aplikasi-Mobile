/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author BerlianaFM
 */
public class TUGAS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 24 ;
        boolean cantik = true ;
                
        System.out.println("HALO, umur saya : " + umur);
        if (umur > 23 && cantik){
            System.out.println("AYO MENIKAH DENGANKU! ^_^");
        }
        else if (umur > 23){
            System.out.println("PIKIR DULU YAW '-')/");
        }
        if (umur < 23 ){
            System.out.println("LAIN KALI AJA DEH YA!! >,<");
    }
    
    }
}