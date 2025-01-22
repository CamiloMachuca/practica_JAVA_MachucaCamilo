package javaejercicio2numero14;

import java.util.Scanner;


public class JavaEjercicio2Numero14 {

    
    public static void main(String[] args) {
        // Calculadora de IMC
        double masa;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la masa corporal");
        masa=teclado.nextDouble();
        if (masa<18.5){
            System.out.println("Masa corporal= Bajo peso");
        
        }
        else{
            if (masa>=18.5 && masa<=24.9){
                System.out.println("Masa corporal= Peso normal");
            
            }
            if (masa>=25 && masa<=29.9){
                System.out.println("Masa corporal= Sobrepeso");
            
            }
            if (masa>30){
                System.out.println("Masa corporal= Obesidad");
            
            }
        
        }
        
        
    }
    
}
