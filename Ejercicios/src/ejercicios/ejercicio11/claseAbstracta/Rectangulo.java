package ejercicios.ejercicio11.claseAbstracta;

public class Rectangulo extends Figura {

    private double ancho;
    private double altura;

    public Rectangulo(String color, boolean rellenada, double ancho, double altura) {
        super(color, rellenada);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = ancho * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (2 * ancho) + (2 * altura);
        return perimetro;
    }

    @Override
    public void imprimirColor() {
        System.out.println("El color del rectangulo es:" + getColor());
    }

    @Override
    public void estaRellenado() {
        if(isRellenada()){
            System.out.println("El rectangulo esta rellenado");
        }
        else{
            System.out.println("El rectangulo no esta rellenado");
        }
    }

}
