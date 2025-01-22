
package javaejercicio2numero18;

import java.util.Scanner;


public class JavaEjercicio2Numero18 {

   
    public static void main(String[] args) {
        // Determinación de rango etario
         int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
        numero=teclado.nextInt();
        if (numero>=0 && numero<=2){
            System.out.println("La persona es un bebe");
        
        }
        else if (numero >=3 && numero<=12){
                System.out.println("La persona es un niño");
        }
        else if (numero>=13 && numero<=17){
                System.out.println("La persona es un adolescente");
        }
        else if (numero>=18 && numero<=64){
                System.out.println("La persona es un adulto");
        }
        else{
                System.out.println("La persona es un adulto mayor");
            }
    }
    
}
