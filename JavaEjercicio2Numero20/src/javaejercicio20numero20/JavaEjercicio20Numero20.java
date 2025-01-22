
package javaejercicio20numero20;

import java.util.Scanner;


public class JavaEjercicio20Numero20 {

    
    public static void main(String[] args) {
        // Identificación del trimestre
        int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el numero del mes en el que se encuentra");
        numero=teclado.nextInt();
        if (numero>=1 && numero<=3){
            System.out.println("Primer trimestre");
        
        }
        else if (numero >=4 && numero<=6){
                System.out.println("Segundo trimestre");
        }
        else if (numero >=7 && numero<=9){
                System.out.println("Tercer trimestre");
        }
        else if (numero>=10 && numero<=12){
                System.out.println("Cuarto trimestre");
        }
        else{
                System.out.println("El numero es incorrecto");
            }
    }
    
}
