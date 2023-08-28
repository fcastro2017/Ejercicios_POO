package ejercicios.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        int numeroaAdivinar = 30;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <100 ; i++) {
              System.out.print("Ingrese el número a adivinar: ");
              int numero = sc.nextInt();

              if(numero == numeroaAdivinar){
                  System.out.println("¡Felicidades! ¡Haz adivinado el número!");
                  break;
              }

              if(numero < numeroaAdivinar){
                  System.out.println("Numero demasiado bajo, intenta nuevamente.");
              }

              if(numero > numeroaAdivinar){
                  System.out.println("Numero demasiado alto, intenta nuevamente.");
              }

        }

    }
}
