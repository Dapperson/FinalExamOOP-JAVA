/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

/**
 *
 * @author USER
 */
public class Mamalia extends Binatang{
    public void Mamalia(String nama){
        this.nama = nama;
    }
    
    public String toString(){
        return "Mamalia[Binatang[nama="+this.nama+"]]";
    }
}
