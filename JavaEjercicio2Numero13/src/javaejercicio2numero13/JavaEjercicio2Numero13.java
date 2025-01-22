
package javaejercicio2numero13;

import java.util.Scanner;

public class JavaEjercicio2Numero13 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double dolares, tasaCambio = 0, resultado;
        String moneda = null;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Seleccione la moneda que quieres conseguir");
        System.out.println("1 Euros (0.85)");
        System.out.println("2 pesos colombianos (4100)");
        System.out.println("3 yenes (110)");
        
        opcion=teclado.nextInt();
        
        if (opcion<1 || opcion>3){
            System.out.println("Opcion no valida");
        }
        System.out.println("Ingrese la cantidad en dolares");
        teclado=new Scanner(System.in);
        dolares=teclado.nextDouble();
        
        switch (opcion){
            case 1:
                tasaCambio=0.85;
                moneda="Euros";
                break;
            
            case 2:
                tasaCambio=4100;
                moneda="Pesos Colombianos";
                break;
            
            case 3:
            
                tasaCambio=110;
                moneda="Yenes";
                break;
            
            
                
        }
        resultado=dolares*tasaCambio;
        System.out.println("El monto convertido es: "+resultado+" "+moneda);
        
    }
    
}
