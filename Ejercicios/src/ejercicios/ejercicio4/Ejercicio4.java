package ejercicios.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
         int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
