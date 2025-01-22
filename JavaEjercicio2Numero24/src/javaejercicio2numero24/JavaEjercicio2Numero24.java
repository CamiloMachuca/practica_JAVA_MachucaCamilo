
package javaejercicio2numero24;

import java.util.Scanner;

public class JavaEjercicio2Numero24 {

  
    public static void main(String[] args) {
        //  Clasificación por índice de contaminación
         int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el indice de calidad del aire (ICA)");
        numero=teclado.nextInt();
        
        if (numero>=0 && numero<=50){
            System.out.println("categoria: Bueno");
        
        }
        else if (numero >=51 && numero<=100){
                System.out.println("Categoria: Moderado");
        }
        else if (numero>=101 && numero<=150){
                System.out.println("Categoria: No saludable para grupos sensibles");
        }
        else if (numero>=151 && numero<=200){
                System.out.println("Categoria: No saludable");
        }
        else if (numero>=201 && numero<=300){
                System.out.println("Categoria: No muy saludable");
        }
        else if (numero>=301){
                System.out.println("Categoria: Peligroso");
        }
        else{
                System.out.println("El indice es incorrecto");
            }
    }
    
}
