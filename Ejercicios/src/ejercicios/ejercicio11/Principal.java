package ejercicios.ejercicio11;

import ejercicios.ejercicio11.claseAbstracta.Circulo;
import ejercicios.ejercicio11.claseAbstracta.Rectangulo;
import ejercicios.ejercicio11.claseAbstracta.Triangulo;

public class Principal {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("azul", true, 8);
        System.out.println("El area del circulo es : " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es : " + circulo.calcularPerimetro());
        circulo.imprimirColor();
        circulo.estaRellenado();

        Rectangulo rectangulo = new Rectangulo("verde", false, 5, 7);
        System.out.println("El area del rectangulo es : " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es :" + rectangulo.calcularPerimetro());
        rectangulo.imprimirColor();
        rectangulo.estaRellenado();

        Triangulo triangulo = new Triangulo("rojo", false, 5, 7, 9);
        System.out.println("El area del triangulo es : " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es : " + triangulo.calcularPerimetro());
        triangulo.imprimirColor();
        triangulo.estaRellenado();

    }
}
