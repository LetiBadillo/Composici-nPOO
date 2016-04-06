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
    
    starTac.newContacto("Leti", "123456", "letibadillog@hotmail.com");
    starTac.newContacto("Deni", "987654", "denisse123654@hotmail.com");
    starTac.newContacto("Lili", "147258", "lili@hotmail.com");
    starTac.newContacto("Arón", "248644", "denisse789@hotmail.com");
    starTac.newContacto("Deni", "787552", "denissetas@hotmail.com");
    System.out.println();
    System.out.println("Lista de Contactos");
    starTac.printAgenda();
    System.out.println();
    starTac.printIndice(5);
    starTac.printIndice(2);
    
    
    }
    }
