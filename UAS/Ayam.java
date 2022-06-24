/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author USER
 */
public class Ayam extends Unggas{
    public Ayam(String nama){
        this.nama = nama;
    }
    
    public String suara1(){
        return "Petok petok";
    }
    
    public String suara2(){
        return "Kukuruyuk";
    }
    
    public String toString(){
        return "Ayam[Unggas[Binatang"
                + "\n" + "[nama="+this.nama+"]]]";
    }
}
