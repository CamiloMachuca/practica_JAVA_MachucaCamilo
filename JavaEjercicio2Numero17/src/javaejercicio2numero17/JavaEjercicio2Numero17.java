
package javaejercicio2numero17;

import java.util.Scanner;


public class JavaEjercicio2Numero17 {

  
    public static void main(String[] args) {
        // Clasificación por niveles de velocidad
         int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese la velocidad de un vehiculo (en Km/h):");
        numero=teclado.nextInt();
        if (numero>=0 && numero<=20){
            System.out.println("El vehiculo es muy lento");
        
        }
        else if (numero >=21 && numero<=60){
                System.out.println("El vehiculo es Moderado");
        }
        else if (numero>=61 && numero<=120){
                System.out.println("El vehiculo es Rapido");
        }
        else{
                System.out.println("El vehiculo es muy rapido");
            }
    }
    
}
