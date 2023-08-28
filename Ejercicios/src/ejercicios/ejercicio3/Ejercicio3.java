package ejercicios.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        double pagoFijo = 10.00;
        double pago;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el consumo:");
        int consumo = sc.nextInt();

        if (consumo <= 50) {
            pago = pagoFijo;
            System.out.println(pago);
        }
        if (consumo >= 51 && consumo <= 200) {
            pago =  (10 + 0.5*(consumo-50)) ;
            System.out.println(pago);
        }
        if (consumo > 200) {
            pago = (10 + 0.5*(consumo-50) + 1.5*(consumo - 200));
            System.out.println(pago);
        }
    }
}
