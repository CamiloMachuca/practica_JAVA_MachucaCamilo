
package javaejercicio6;

import java.util.Scanner;


public class JavaEjercicio6 {

    public static void main(String[] args) {
        /*Una empresa paga a sus empleados un bono por antigüedad que consiste
        en $100.000 por el primer año laboral y $120.000 por cada año siguiente.
        Realice un algoritmo que determine el monto del bono a pagar a un trabajador que
        tiene varios años en la empresa.
        */
        int years, BnFinal, bn1;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese la cantidad:");
        years=teclado.nextInt();
        if (years>=1){
            bn1= 100000;
            BnFinal=((years-1)*120000)+ bn1;
            System.out.println("El bono a pagar es de: "+BnFinal);

        }
        else{
            System.out.println("El numero de años no cumple con los requisitos");
        };
    }
    
}
