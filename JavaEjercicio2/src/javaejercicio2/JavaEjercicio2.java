
package javaejercicio2;

import java.util.Scanner;

public class JavaEjercicio2 {

   
    public static void main(String[] args) {
        /*Tres personas deciden invertir su dinero para fundar una empresa. Cada una de
        ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien
        invierte con respecto a la cantidad total invertida.*/
        
        double persona1, persona2, persona3, inversionTotal;
        double inversor1, inversor2, inversor3;
        System.out.println("Ingrese las cantidades a invertir cada uno: ");
        Scanner teclado=new Scanner(System.in);
        persona1=teclado.nextDouble();
        persona2=teclado.nextDouble();
        persona3=teclado.nextDouble();
        inversionTotal= persona1+persona2+persona3;
        inversor1= persona1*100/inversionTotal;
        inversor2= persona2*100/inversionTotal;
        inversor3= persona3*100/inversionTotal;
        
        System.out.println("El porcentaje que invierte la 1ra persona es de: "+ inversor1 +"%");
        System.out.println("El porcentaje que invierte la 1ra persona es de: "+ inversor2+"%");
        System.out.println("El porcentaje que invierte la 1ra persona es de: "+ inversor3+"%");
        
    }
    
}
