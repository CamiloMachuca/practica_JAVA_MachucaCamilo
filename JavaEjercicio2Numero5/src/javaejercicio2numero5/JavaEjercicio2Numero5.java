
package javaejercicio2numero5;

import java.util.Scanner;


public class JavaEjercicio2Numero5 {

    public static void main(String[] args) {
        // TODO code application logic here
        double precioFinal, precioProducto;
        String tipoCliente;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        precioProducto=teclado.nextDouble();
        System.out.println("Ingrese el tipo de cliente (A/B/C):");
        tipoCliente=teclado.next();
        
        switch (tipoCliente){
            case "A":
                precioFinal=(precioProducto*0.30)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
              
            case "a":
                precioFinal=(precioProducto*0.30)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
                
            case "B":
                precioFinal=(precioProducto*0.20)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
                
            case "b":
                precioFinal=(precioProducto*0.20)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
            
            case "C":
                precioFinal=(precioProducto*0.10)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
                
            case "c":
                precioFinal=(precioProducto*0.10)/100;
                System.out.println("El precio final con descuento es: "+precioFinal);
                break;
            default: precioFinal=0;
                
                
        
        }
    }
    
}
