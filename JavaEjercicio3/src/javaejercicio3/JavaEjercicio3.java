/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio3;

import java.util.Scanner;

public class JavaEjercicio3 {
    
    public static void main(String[] args) {
        
        /* Programa que dependiendo del promedio de un alumno 
        nos diga si aprobo o no una materia*/
        
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el promedio del alumno");
        promedio=teclado.nextDouble();
        
        condicionFinal=(promedio>=6) ? "Aprobado" : "Desaprobado";
        System.out.println("El estudiante:"+condicionFinal);
        
        
    }
    
}
