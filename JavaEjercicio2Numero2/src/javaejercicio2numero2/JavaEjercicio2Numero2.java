
package javaejercicio2numero2;

import java.util.Scanner;

public class JavaEjercicio2Numero2 {

  
    public static void main(String[] args) {
        // Calculadora simple
        
        double resultado, numero1, numero2 ;
        char operacion;
        System.out.println("Ingrese el primer numero:");
        Scanner teclado=new Scanner (System.in);
        numero1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2=teclado.nextInt();
        System.out.println("Ingrese la operacion que desea realizar ya sea +, -, *, /");
        operacion=teclado.next().charAt(0);
        
        switch (operacion){
            case '+':
                resultado=numero1+numero2;
                System.out.println("Resultado: "+ resultado);
                break;
            
            case '-':
                resultado=numero1-numero2;
                System.out.println("Resultado: "+ resultado);
                break;
            case '*':
                resultado=numero1-numero2;
                System.out.println("Resultado: "+ resultado);
                break;
                
            case '/':
                resultado=numero1/numero2;
                System.out.println("Resultado: "+ resultado);
                break;
                
            default:
                System.out.println("Operacion no validad");
                
        
        
        }

    }
    
}
