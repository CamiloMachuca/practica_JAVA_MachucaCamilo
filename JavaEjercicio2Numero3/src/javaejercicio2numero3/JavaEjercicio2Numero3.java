
package javaejercicio2numero3;

import java.util.Scanner;

public class JavaEjercicio2Numero3 {

   
    public static void main(String[] args) {
        // Simulador de notas
        int nota;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la calificacion (0-100):");
        nota=teclado.nextInt();
        if (nota>=90 && nota<=100){
            System.out.println("La nota es A");
        
        }else{
            if (nota>=80 && nota<=89){
                System.out.println("La nota es B");
            }
            
            if (nota>=70 && nota<=79){
                System.out.println("La nota es C");

            }
            if (nota>=60 && nota<=69){
                System.out.println("La nota es D");

            }
            if (nota<=60){
                System.out.println("La nota es F");

            }
            else{
                System.out.println("La nota es incorrecta ");
            
            }
                    
            
            
        
        }
        
    }
    
}
