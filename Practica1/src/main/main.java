package main;
import java.util.Scanner;

import models.Lista;
public class main {
	public static Lista Lista;
	public static <t> void main(String[] args) {
Scanner teclado= new Scanner(System.in);
do
{
	int num;
	
	System.out.println(" 1-Add\n 2-Remove\n 3-getNext\n 4-getPrev\n 5-getCurrent\n 6-Set Index\n 7-Salir");
	System.out.println("Introduzca Opcion");
num=teclado.nextInt();
t elementos = null;
byte Opcion=0;
 if(num==1){
	 Opcion=1;
 }
 if(num==2){
	 Opcion=2;
 }
 if(num==3){
	 Opcion=3;
 }
 if(num==4){
	 Opcion=4;
 }
 if(num==5){
	 Opcion=5;
 }
 if(num==6){
	 Opcion=6;
 }
 if(num==7){
	 Opcion=7;
 }
 switch(Opcion)
 {
 
     case 1: 
    	 Lista.add(elementos);
     break;
     case 2: 
    	Lista.remove(elementos);
    	 
     break;
     case 3: 
    	 Lista.getNext();
     break;
     case 4:
    	Lista.getPrev();
     break;
     case 5:
    	 Lista.getPrev();
    	 break;
     case 6: 
    	Lista.setIndex(num);
     break;
     case 7: 
    	 System.exit(0);
     break;
     default: System.out.println("Error Opcion");
   break;
 }
}
while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 7
}
}
