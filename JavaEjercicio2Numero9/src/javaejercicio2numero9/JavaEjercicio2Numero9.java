
package javaejercicio2numero9;

import java.util.Scanner;


public class JavaEjercicio2Numero9 {

  
    public static void main(String[] args) {
        // Determinador de estacion del año
        int numero;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese el numero del mes en el que se encuentra (1-12):");
        numero=teclado.nextInt();
        if (numero>=3 && numero<=5){
            System.out.println("Este mes pertenece a la estacion de Primavera");
            
        }
        else {
            if (numero>=6 && numero<=8){
                System.out.println("Este mes pertenece a la estacion de Verano");
            
            }
            if (numero>=9 && numero<=11){
                System.out.println("Este mes pertenece a la estacion de Otoño");
            
            }
            if (numero>=12 || numero==2){
                System.out.println("Este mes pertenece a la estacion de Invierno");
            
            }
        
        }
    }
    
}
