
package javaejercicio2numero15;

import java.util.Scanner;


public class JavaEjercicio2Numero15 {

   
    public static void main(String[] args) {
        // Juego de piedra papel o tijera
        String persona1, persona2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su eleccion persona 1( piedra , papel o\n" +
        "tijera) ");
        persona1=teclado.nextLine();
        System.out.println("Ingrese su eleccion persona 2  ( piedra , papel o\n" +
        "tijera ) ");
        
        persona2=teclado.nextLine();
        
        if (persona1.equals( persona2)){
            System.out.println("Es un empate");
        
        }
        else{
            if (persona1.equals("piedra") && persona2.equals("tijera")){
                System.out.println("Ha ganado la persona 1");
            }
            if (persona1.equals("papel") && persona2.equals("piedra")){
                System.out.println("Ha ganado la persona 1");
            
            }
            if (persona1.equals("tijera") && persona2.equals("papel")){
                System.out.println("Ha ganado la persona 1");
            }
            if (persona2.equals("piedra") && persona1.equals("tijera")){
                System.out.println("Ha ganado la persona 1");
            }
            if (persona2.equals("papel") && persona1.equals("piedra")){
                System.out.println("Ha ganado la persona 1");
            
            }
            if (persona2.equals("tijera") && persona1.equals("papel")){
                System.out.println("Ha ganado la persona 1");
            }
            
        
        }
    }
    
}
