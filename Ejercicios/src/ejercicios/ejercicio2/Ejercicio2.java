package ejercicios.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad del usuario:");
        int edad = sc.nextInt();
        System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:");
        char regalo = ' ';

        if(edad>=15){
            regalo = sc.next().charAt(0);
             if(regalo == '1') {
                 System.out.println("El invitado sí puede ingresar a la fiesta.");
             }
             else{
                 System.out.println("El invitado no puede ingresar a la fiesta");
             }
        }
        else if(edad<15){
                System.out.println("El invitado sí puede ingresar a la fiesta.");
        }
    }
}
