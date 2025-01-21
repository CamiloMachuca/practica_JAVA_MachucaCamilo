
package javaejercicioo3;

import java.util.Scanner;

public class JavaEjercicioo3 {

    public static void main(String[] args) {
        /*Un banco da a sus ahorradores un interés de 1.5% sobre el monto ahorrado mensual.
        Teniendo como dato de entrada el saldo inicial del ahorrador y el número de
        meses, determine el saldo final.
        */
        double saldoInicial;
        int numberMounths;
        double monto, SaldoFinal;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese el saldo inicial del ahorrador");
        
        saldoInicial=teclado.nextDouble();
        System.out.println("Ingrese el numero de meses: ");
        numberMounths=teclado.nextInt();
        monto =0.015*saldoInicial * numberMounths;
        
        
        SaldoFinal=saldoInicial+ monto;
        System.out.println("El saldo final equivale a: " +SaldoFinal);
    }
    
}
