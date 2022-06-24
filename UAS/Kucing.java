/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author USER
 */
public class Kucing extends Mamalia{
    public Kucing(String nama){
        this.nama = nama;
    }
    
    public String suara(){
        return "Meow";
    }
    
    public String toString(){
        return "Kucing[Mamalia[Binatang"
                + "\n" +"[nama="+this.nama+"]]]";
    }
}
