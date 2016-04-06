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
public class Contacto {
    
    
    //privados nombre, telefono y correo
    private String nombre;
    private String telefono;
    private String email;
    
    public Contacto(){
        
    }
    public Contacto (String nombre, String telefono, String email){
    this.nombre=nombre;
    this.telefono=telefono;
    this.email=email;

}
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTel(){
        return this.telefono;
    }
    
    public String getCorreo(){
        return this.email;
    }
    
    
}
