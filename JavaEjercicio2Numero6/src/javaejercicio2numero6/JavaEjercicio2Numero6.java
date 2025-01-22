
package javaejercicio2numero6;

import java.util.Scanner;


public class JavaEjercicio2Numero6 {

   
    public static void main(String[] args) {
        //  Calculadora de tarifas de estacionamiento
        int horas, total;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero de horas que duro estacionado el vehiculo:");
        
        horas=teclado.nextInt();
        if (horas<1){
            total= 5;
            System.out.println("El total a pagar es de: $"+total);
        
        }
        else{
            if (horas>=2 && horas<=3){
                total=10;
                System.out.println("El total a pagar es de: $"+total);
            
            }
            if (horas>4){
                total=15;
                System.out.println("El total a pagar es de: $"+total);
            
            }
        
        }

    }
    
}
