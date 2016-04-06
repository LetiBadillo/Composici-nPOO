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
 static Contacto[] Agenda = new Contacto[100];
 
 int p=1;
 int aux;
 char c;
 String y;
 static int temp; 

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
private static int buscaEspacio(Contacto [] Lista){
    
    for (int i=0; i<Agenda.length; i++){
        if (Agenda[i]==null){
            temp=i;
            return i;
        }
    } return temp;
}
public static void newContacto (String n, String t, String e){
 Contacto temporal= new Contacto (n, t, e);
 
 Agenda [buscaEspacio(Agenda)]= temporal;
}


public static void printIndice(int indice){
   if (Agenda[indice]!= null){
    System.out.println("El contacto en el índice "+indice+" es: "+Agenda[indice].getNombre()+" : "+Agenda[indice].getTel()+" : " +Agenda[indice].getCorreo());
   } else{
System.out.println("El índice "+ indice+" está vacío");
       }

}
public static void printAgenda(){
    for (int a=0; a<temp;a++){
System.out.println(" "+Agenda[a].getNombre()+" : " +Agenda[a].getTel()+" : "+Agenda[a].getCorreo());

}

}
}

       
