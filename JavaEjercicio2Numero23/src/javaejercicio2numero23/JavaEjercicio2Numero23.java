
package javaejercicio2numero23;

import java.util.Scanner;

public class JavaEjercicio2Numero23 {

    public static void main(String[] args) {
        // TODO code application logic here
        int edadPerro;
        double edadHumano;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese la edad del perro:");
        edadPerro=teclado.nextInt();
        if (edadPerro<=2){
            edadHumano=edadPerro*10.5;
        }
        else{
            edadHumano=21+(edadPerro-2)*4;
        }
        System.out.println("La edad del perro en años humanos es de: "+ edadHumano);
        
    }
    
}
