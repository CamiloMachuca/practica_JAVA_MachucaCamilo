
package javaejercicio2numero12;

import java.util.Scanner;


public class JavaEjercicio2Numero12 {

    public static void main(String[] args) {
        // Clasificación de años
        int anio;
        System.out.println("Ingrese un año:");
        Scanner teclado=new Scanner(System.in);
        
        anio=teclado.nextInt();
        
        if ((anio % 4==0 && anio% 100 != 0) || (anio % 400==0)){
            System.out.println("El año "+ anio+ " es bisiesto");
        }else {
            System.out.println("El año "+ anio+ " es comun");
        }
    }
    
}
