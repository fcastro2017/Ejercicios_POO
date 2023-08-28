package ejercicios.ejercicio11.claseAbstracta;

public class Circulo extends Figura {

    private double radio;
    public static double PI = 3.1416;

    public Circulo(String color, boolean rellenada, double radio) {
        super(color, rellenada);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = PI * radio * radio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * PI * radio;
        return perimetro;
    }

    @Override
    public void imprimirColor() {
        System.out.println("El color del circulo es:" + getColor());
    }

    @Override
    public void estaRellenado() {
        if(isRellenada()){
            System.out.println("El circulo esta rellenado");
        }
        else{
            System.out.println("El circulo no esta rellenado");
        }
    }
}
