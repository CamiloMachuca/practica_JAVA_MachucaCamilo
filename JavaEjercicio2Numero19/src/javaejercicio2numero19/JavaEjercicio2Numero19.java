
package javaejercicio2numero19;

import java.util.Scanner;

public class JavaEjercicio2Numero19 {

  
    public static void main(String[] args) {
        // Simulador de alarma de peligro

        int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sensores activados");
        numero=teclado.nextInt();
        if (numero>=1 && numero<=2){
            System.out.println("Alerta baja");
        
        }
        else if (numero >=3 && numero<=5){
                System.out.println("Alerta media");
        }
        else if (numero>=6){
                System.out.println("Alerta alta");
        }
        else{
                System.out.println("La cantidad de sensores activados es incorrecta");
            }
    }
    
}
