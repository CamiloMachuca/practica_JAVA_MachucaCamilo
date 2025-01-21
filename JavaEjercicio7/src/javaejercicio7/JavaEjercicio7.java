
package javaejercicio7;

import java.util.Scanner;


public class JavaEjercicio7 {

   
    public static void main(String[] args) {
        // Clasificación de edades
        int edad;
        System.out.println("Ingrese la edad: ");
        Scanner teclado=new Scanner (System.in);
        edad=teclado.nextInt();
        
        if (edad>0 && edad<12){
            System.out.println("Es un niño de "+ edad+" edad");
        
        }else{
            if (edad>=13 && edad<=17){
                System.out.println("Es un Adolescente de "+ edad+" edad");

            }
            
            if (edad>=18 && edad<=59){
                System.out.println("Es un Adulto de "+ edad+" edad");

            }
            
            else{
                    if (edad>=60){
                        System.out.println("Es un adulto mayor de "+ edad+" edad");

                    }
                    
            }
        
        }

    }
    
}
 