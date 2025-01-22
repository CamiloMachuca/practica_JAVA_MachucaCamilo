
package javaejercicio2numero21;

import java.util.Scanner;


public class JavaEjercicio2Numero21 {

    public static void main(String[] args) {
        // Clasificación de figuras geométricas
        int numero;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese  el número de lados de la figura geométrica");
        numero=teclado.nextInt();
        if (numero==3){
            System.out.println("Triangulo");
        
        }
        else if (numero ==4){
                System.out.println("Cuadrado o rectangulo");
        }
        else if (numero ==5){
                System.out.println("Pentagono");
        }
        else if (numero==6){
                System.out.println("Hexagono");
        }
        else{
                System.out.println("Figura no soportada");
            }
    }
    
}
