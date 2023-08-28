package ejercicios.ejercicio11.claseAbstracta;

public class Triangulo extends Figura{
    private double longitudA;
    private double longitudB;
    private double longitudC;

    public Triangulo(String color, boolean rellenada, double longitudA, double longitudB, double longitudC) {
        super(color, rellenada);
        this.longitudA = longitudA;
        this.longitudB = longitudB;
        this.longitudC = longitudC;
    }

    @Override
    public double calcularArea() {
        double s = (longitudA + longitudB + longitudC)/2;
        double area = Math.sqrt(s*(s-longitudA)*(s-longitudB)*(s-longitudC));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = longitudA + longitudB + longitudC;
        return perimetro;
    }

    @Override
    public void imprimirColor() {
        System.out.println("El color del triangulo es:" + getColor());
    }

    @Override
    public void estaRellenado() {
        if(isRellenada()){
            System.out.println("El triangulo esta rellenado");
        }
        else{
            System.out.println("El triangulo no esta rellenado");
        }
    }
}
