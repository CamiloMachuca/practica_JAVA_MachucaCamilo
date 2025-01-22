
package javaejercicio2numero22;

import java.util.Scanner;

public class JavaEjercicio2Numero22 {

    public static void main(String[] args) {
        // TODO code application logic here
        int mes, dia;
        String signo;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero del mes(1-12)");
        mes=teclado.nextInt();
        System.out.println("Ingrese el numero del dia (1-31)");
        dia=teclado.nextInt();
        
        if ((mes==3 && dia>=21) || (mes==4 && dia<=19)){
            signo="Aries";
        
        }
        else if((mes==4 && dia>=20)||(mes==5 && dia<=20)){
            signo="Tauro";
        }
        else if((mes==5 && dia >=21)|| (mes==6 && dia <=20)){
            signo="Geminis";
        }
        else if((mes==6 && dia>=21) || (mes==7 && dia<=22)){
            signo="Cancer";
        }
        else if((mes==7 && dia>=23)|| (mes==8 && dia<=22)){
            signo="Leo";
        }
        else if((mes==8 && dia >=23)|| (mes==9 && dia<=22)){
            signo="Virgo";
        }
        else if((mes==9 && dia>=23) || (mes==10 && dia<=22)){
            signo="Libra";
        }
        else if((mes==10 && dia>=23) || (mes==11 && dia<=21)){
            signo="Escorpio";
        }
        else if((mes==11 && dia>=22) || (mes==12 && dia<=21)){
            signo="Sagitario";
        }
        else if((mes==12 && dia>=22) || (mes==1 && dia<=19)){
            signo="Capricornio";
        }
        else if((mes==1 && dia>=20) || (mes==2 && dia<=18)){
            signo="Acuario";
        }
        else if((mes==2 && dia>=19) || (mes==3 && dia<=20)){
            signo="Piscis";
        }
        else{
            signo="Fecha no validad";
        
        }
        System.out.println("Tu signo zodiacal es: "+ signo);
    }
    
}
