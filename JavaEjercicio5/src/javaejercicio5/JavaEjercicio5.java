
package javaejercicio5;

import java.util.Scanner;

public class JavaEjercicio5 {

  
    public static void main(String[] args) {
        /*El periódico el Informador cobra por un aviso clasificado un monto que depende
        del número de palabras, tamaño en centímetros y número de colores. Cada
        palabra tiene un costo de $20.000, cada centímetro tiene un costo de
        $15.000 y cada color tiene un costo de $25.000. Realice un algoritmo
        que determine el monto a pagar por un aviso clasificado.
        */
        int P, C, R, PS, CMS, CRS, precio;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba cuantas palabras hay en total:");
        P=teclado.nextInt();
        System.out.println("Escriba cuantos cm hay en total: ");
        C=teclado.nextInt();
        System.out.println("Escriba cuantos colores se han usado en total: ");
        R=teclado.nextInt();
        PS=(P*20000);
        CMS=(C*15000);
        CRS=(R*25000);
        precio=(PS+CMS*CRS);
        System.out.println("El precio total es de: "+ precio+ "$");
        
         
        
    }
    
}
