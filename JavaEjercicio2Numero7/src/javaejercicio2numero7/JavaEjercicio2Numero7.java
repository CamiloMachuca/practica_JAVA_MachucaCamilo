
package javaejercicio2numero7;

import java.util.Scanner;

public class JavaEjercicio2Numero7 {

    public static void main(String[] args) {
        // Conversor de temperatura
        int temperatura;
        String UnidadOrigen;
        double medicion;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese la temperatura a combertir:");
        temperatura=teclado.nextInt();
        teclado=new Scanner(System.in);
        System.out.println("Ingrese la unidad de origen:");
        UnidadOrigen=teclado.next();
        switch (UnidadOrigen){
            case "Farenheit":
                medicion=(temperatura-32)*5/9;
                System.out.println("La medicion es de: "+medicion);
                break;
            case "Celsius":
                medicion=(temperatura*9/5)+32;
                System.out.println("La medicion es de: "+medicion);
                break;
                
            default:medicion=0;
                        
        
        }
        
    }
    
}
