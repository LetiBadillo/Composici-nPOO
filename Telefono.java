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
public class Telefono {
botonApagar EA=new botonApagar();
 Tecla [][] Teclado= new Tecla[4][3];
 int p=1;
 int aux;
 char c;
 String y;

public void setTeclado( ){
        for(int i = 0; i < Teclado.length; i++) {
        for(int j = 0; j < Teclado[0].length; j++){
           y= Integer.toString(p);
           c = y.charAt(0);
          Teclado [i][j].setDigito(c); 
          aux= Integer.parseInt(y);
          p=aux; 
          p++;
     }} 
 String t;
 char u;
u='*';
Teclado[0][10].setDigito(u);
t= "0";
u=t.charAt(0);
Teclado[0][11].setDigito(u);
t="#";
u=t.charAt(0);
Teclado[0][12].setDigito(u);
}
public void printTeclado(){
for(int a = 0; a < Teclado.length; a++) {
        for(int b = 0; b < Teclado[a].length; b++){
           
      System.out.print(" "+Teclado[a][b]);
        System.out.printf("\n");
        }
}
}
}
