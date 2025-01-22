
package javaejercicio2numero4;

import java.util.Scanner;


public class JavaEjercicio2Numero4 {

   
    public static void main(String[] args) {
        // Clasificación de triángulos
        int lado1, lado2, lado3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el lado 1:");
        lado1=teclado.nextInt();
        System.out.println("Ingrese el lado 2:");
        lado2=teclado.nextInt();
        System.out.println("Ingrese el lado 3:");
        lado3=teclado.nextInt();
        
        if (lado1== lado2 && lado1==lado3){
            System.out.println("Es un triangulo equilatero (Todos los lados iguales)");
            
            
        }
        else {
            if (lado1==lado2 && lado1!=lado3){
                System.out.println("Es un triangulo Isosceles (dos lados iguales)");
                
            
            }
            if (lado1!=lado2 && lado2!=lado3 && lado3!=lado1){
                System.out.println("Es un triangulo Escaleno (Todos los lados diferentes)");
              
            }
            if (lado2==lado3 && lado2!=lado1){
                System.out.println("Es un triangulo Isosceles (dos lados iguales)");
                
            }
            if (lado3==lado1 && lado3!=lado2){
                System.out.println("Es un triangulo Isosceles (dos lados iguales)");
                
            }
            
        
        }
        
    }
    
}
