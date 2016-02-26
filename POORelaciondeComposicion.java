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
public class POORelacióndeComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Telefono starTac = new Telefono();
    
     starTac.EA.presionar();
    System.out.println("El starTac está "+starTac.EA.IO);
    starTac.EA.presionar();
    System.out.println("El starTac está "+starTac.EA.IO);
    
    starTac.setTeclado();
    starTac.printTeclado();
    }
}
