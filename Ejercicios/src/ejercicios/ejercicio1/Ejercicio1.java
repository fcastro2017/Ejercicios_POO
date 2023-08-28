package ejercicios.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int cobroxHora= 40;
        double pago;
        int horasExtras;
        int horasExtrasRestantes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese horas trabajadas");
        int horasTrabajadas = sc.nextInt();

        if(horasTrabajadas <=40){
           pago = 40 * horasTrabajadas;
           System.out.println(pago);

        }
        else
           if(horasTrabajadas>40){
               horasExtras = horasTrabajadas - 40;
               if(horasExtras<=8){
               pago = (cobroxHora* 40) + (2*cobroxHora*horasExtras);
                   System.out.println(pago);
               }
               else{
                   horasExtrasRestantes = horasExtras - 8;
                   pago = (40 * 40) + (2*cobroxHora*8) + (3*cobroxHora*horasExtrasRestantes);
                   System.out.println(pago);
               }
           }
    }
}
