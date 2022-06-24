/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author USER
 */
public class Anjing extends Mamalia{
    public Anjing(String nama){
        this.nama = nama;
    }
    
    public String suara1(){
        return "Woof woof";
    }
    
    public String suara2(){
        return "Guk guk";
    }
    
    public String toString(){
        return "Anjing[Mamalia[Binatang"
                + "\n" +"[nama="+this.nama+"]]]";
    }
}
