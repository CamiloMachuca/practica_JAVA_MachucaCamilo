
package javapracticaextra1;

import java.util.Scanner;

public class JavaPracticaExtra1 {

    public static void main(String[] args) {
        /*En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de 
        secundario. Cada fila corresponde a las notas de cada alumno.
        
        Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas
        del alumno y que en un vector diferente se calculen los promedios.*/
        
        double notas [][]= new double[4][3];
        double promedios[]= new double[4];
        Scanner teclado= new Scanner(System.in);
        
        for (int f=0;f<notas.length;f++){
            System.out.println("Ingrese las 3 notas del alumno:"+ f);
            for (int c=0; c<notas[0].length;c++){
                notas[f][c]=teclado.nextDouble();
            }
        }
        
        double total;
        for (int f=0;f<notas.length;f++){
            total=0;
            for (int c=0;c<notas[0].length;c++){
                total=total+notas[f][c];
            
            }
            promedios[f]=total/notas[0].length;
            
            
        }
        
        for (int f=0;f<notas.length;f++){
            System.out.println("Las notas del alumno "+f+" son:");
            for (int c=0;c<notas[0].length;c++){
                System.out.println(notas[f][c]);
            }
            System.out.println("El promedio fue de:"+ promedios[f]);
        
        }
    }
    
}
