package ejercicios.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número");
        int n = sc.nextInt();
        double factorial = 1;

        for (int i = 1; i <=n; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
