
package javaejercicio2numero10;

import java.util.Scanner;


public class JavaEjercicio2Numero10 {

  
    public static void main(String[] args) {
        // Sistema de recomendaciones de comida
        String clima, hora, comida;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el clima ( soleado , lluvioso , frío )");
        clima=teclado.nextLine().toLowerCase();
        System.out.println("Ingrese la hora del dia  ( mañana , tarde , noche )");
        hora=teclado.nextLine().toLowerCase();
        
        switch (clima){
            case "soleado":
                comida="pollo frito con arroz";
                break;
                
            case "lluvioso":
                comida="huevo frito con ensalada";
                break;
                
            case "frio":
                comida="sopa de pollo con papas";
                break;
            default: comida="clima no valido";
        
        }
        if (hora.equals("mañana")){
            comida= "desayuno con"+ comida;
            
        
        }else if (hora.equals("tarde")){
            comida="almuerzo con"+ comida;
        
        }else if (hora.equals("noche")){
            comida="cena con "+ comida;
        }else{
            comida="hora del dia incorrecta";
        
        }
        System.out.println("Recomendacion: "+comida);

    }
    
}
