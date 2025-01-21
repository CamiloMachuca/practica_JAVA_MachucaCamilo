
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    public static void main(String[] args) {
        /* 
        Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos
        de ejercicio, si la fórmula es: Num. Pulsaciones = (200 –edad) /10.
        */
        String sexo;
        int edad;
        int hpulsos;
        System.out.println("Indique su edad:");
        Scanner teclado = new Scanner(System.in);
        edad=teclado.nextInt();
        System.out.println("Indique si su sexo es masculino, femenino (M o F):");
        teclado=new Scanner (System.in);
        sexo=teclado.next();
        if ((sexo=="M") || (sexo=="m")){
            hpulsos= (210-edad)/ 10;
            
  
        }else {
            hpulsos=(220-edad)/10;
        
        }
        System.out.println("El numero de pulsaciones que usted tiene es de: "+ hpulsos);
    
    }
    
}
