/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner teclado= new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese la edad del alumno");
        edad=teclado.nextInt();
        if (edad >=4 && edad <= 6){
            System.out.println("Lunes y miercoles de 16 a 17");
            
        }
        else {
            if (edad>=7 && edad <= 8 ){
                System.out.println("Martes y jueves de 16:30 a 17:30");
                
            }
            else{
                if (edad >=9 && edad <= 10){

                    System.out.println("Martes y jueves del 17:30 a 19");
                }
            else{
                if (edad >=11 && edad <13){
                    System.out.println("Lunes y miercoles de 17 a 18:30");
                }
            }
            }
        
        }
        
      
    }
    
}
