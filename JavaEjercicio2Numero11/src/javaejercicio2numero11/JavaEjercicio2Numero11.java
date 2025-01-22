
package javaejercicio2numero11;

import java.util.Scanner;

public class JavaEjercicio2Numero11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double valor, resultado;
        String unidadMedida;
        System.out.println("seleccione la opcion que desee ");
        System.out.println("1 kilometros a millas");
        System.out.println("2 celsius a fahrenheit");
        System.out.println("3 kilogramos a libras");
        
        Scanner teclado=new Scanner(System.in);
        opcion=teclado.nextInt();
        if (opcion <1 || opcion>3){
            System.out.println("Opcion no valida");
        }
        System.out.println("Ingrese el valor a comvertir");
        valor=teclado.nextDouble();
        
        if (valor<0){
            System.out.println("El valor es incorrecto");
        
        }
        switch (opcion){
            case 1: 
                resultado= valor* 0.621371;
                unidadMedida="millas";
                System.out.println("El resultado es: "+resultado+" "+unidadMedida);
                break;
                
            case 2:
                resultado=(valor * 9/5)+32;
                unidadMedida="Fahrenheit";
                System.out.println("El resultado es: "+resultado+" "+unidadMedida);
                break;
            
            case 3:
                resultado= valor* 2.20462;
                unidadMedida="Libras";
                System.out.println("El resultado es: "+resultado+" "+unidadMedida);
                break;
                
            default: System.out.println("El resultado es incorrecto");
                
            
                        
                       
        }
        
        
    }
    
}
