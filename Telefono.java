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
 Tecla [][] Teclado= new Tecla[5][3];
 int p=1;
 int aux;
 char c;
 String y;
 
 

public void setTeclado( ){
    for(int i = 0; i < Teclado.length; i++) {
            
        for(int j = 0; j < Teclado[0].length; j++){
            Tecla a= new Tecla();
            y= Integer.toString(p);
            c = y.charAt(0);
            a.setDigito(c);
            a.getDigito();
            Teclado [i][j]=a;
            p++;
            
            }
        }
         

Tecla m= new Tecla();
m.setDigito('*');
m.getDigito();
Teclado[3][0]=m;

Tecla cero= new Tecla();
cero.setDigito('0');
cero.getDigito();
Teclado[3][1]=cero;

Tecla mu= new Tecla();
mu.setDigito('#');
mu.getDigito();
Teclado[3][2]=mu;

Tecla mq= new Tecla();
mq.setDigito('V');
mq.getDigito();
Teclado[4][0]=mq;

Tecla lq= new Tecla();
lq.setDigito('M');
lq.getDigito();
Teclado[4][1]=lq;

Tecla muq= new Tecla();
muq.setDigito('R');
muq.getDigito();
Teclado[4][2]=muq;
}
public void printTeclado(){
 System.out.print(" "+Teclado[0][0].getDigito());
        System.out.print("  "+Teclado[0][1].getDigito());
        System.out.print(" "+Teclado[0][2].getDigito());
        System.out.println();
        System.out.print(" "+Teclado[1][0].getDigito());
        System.out.print("  "+Teclado[1][1].getDigito());
        System.out.print(" "+Teclado[1][2].getDigito());
        System.out.println();
        System.out.print(" "+Teclado[2][0].getDigito());
        System.out.print("  "+Teclado[2][1].getDigito());
        System.out.print(" "+Teclado[2][2].getDigito());
        System.out.println();
        System.out.print(" "+Teclado[3][0].getDigito());
        System.out.print("  "+Teclado[3][1].getDigito());
        System.out.print(" "+Teclado[3][2].getDigito());
        System.out.println();
        System.out.print(" "+Teclado[4][0].getDigito());
        System.out.print("  "+Teclado[4][1].getDigito());
        System.out.print(" "+Teclado[4][2].getDigito());
        System.out.println();

}
}
