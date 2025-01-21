/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio4;

import java.util.Scanner;


public class JavaEjercicio4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /*Una empresa le hace los siguientes descuentos sobre el sueldo base a sus
        trabajadores: 1% por ley de política pública, 4% por seguro social, 0.5% por
        seguro forzoso y 5% por caja de ahorro. Realice un Algoritmo que determine el
        monto de cada descuento y el monto total a pagar al trabajador.
        
        */
        double baseSueldo, amountTotal;
        double leyPolitica, segSocial, segForzoso, boxAhorro;
        System.out.println("Ingrese el sueldo base de sus trabajadores: ");
        Scanner teclado=new Scanner(System.in);
        baseSueldo=teclado.nextDouble();
        leyPolitica=baseSueldo*0.01;
        segSocial=baseSueldo*0.04;
        segForzoso=baseSueldo*0.005;
        boxAhorro=baseSueldo*0.05;
        amountTotal= baseSueldo-leyPolitica-segSocial-segForzoso-boxAhorro;
        System.out.println("El monto a descontar en caja de ahorro es: "+ boxAhorro);
        System.out.println("El monto a descontar en la ley politica es es: "+ leyPolitica);
        System.out.println("El valor a descontar del seguro forzoso es de: "+ segForzoso);
        System.out.println("valor de seguro social:"+ segSocial);
        System.out.println("El monto a pagar a los trabajadores es de: "+amountTotal );
  
                
        
        
    }
    
}
