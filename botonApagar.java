/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.relacióndecomposición;

/**
 *
 * @author ASUS
 */
public class botonApagar {
    //atributos
    
    public boolean IO;
    
    
    public boolean botonApagar(){
        this.IO=false;
        return IO;
    }
    public void presionar(){
    this.IO=!this.IO;
    }
}
