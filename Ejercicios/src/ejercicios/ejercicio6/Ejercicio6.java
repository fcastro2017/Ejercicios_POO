package ejercicios.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de secuencia:");
        int n = sc.nextInt();
        String res="";

        for (int i = 0; i < n; i++) {
            res = (res + " "+"*").trim();
            System.out.println(res);
        }
    }
}
