
package javaejercicio2numero16;

import java.util.Scanner;


public class JavaEjercicio2Numero16 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        numero=teclado.nextInt();
        if (numero % 2 ==0 && numero % 3==0){
            System.out.println("El numero ingresado es divisible por 2 y por 3");
        
        }
        else if (numero % 2==0){
                System.out.println("El numero ingresado es divisible por 2");
        }
        else if (numero % 3==0){
                System.out.println("El numero ingresado es divisible por 3");
        }
        else{
                System.out.println("El numero ingresado no es divisible por 2 ni por 3");
            }
            
        
        
        
        
    }
    
}
