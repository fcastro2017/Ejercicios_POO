package ejercicios.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de elementos: ");
        int n = sc.nextInt();
        int [] array= new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato"+ (i+1)+": ");
            array[i] = sc.nextInt();
        }

        int mayor;
        mayor = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
