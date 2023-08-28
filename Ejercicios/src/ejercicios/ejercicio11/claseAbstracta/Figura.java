package ejercicios.ejercicio11.claseAbstracta;

public abstract class Figura {

    private String color;
    private boolean rellenada;

    public Figura(String color, boolean rellenada) {
        this.color = color;
        this.rellenada = rellenada;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract void imprimirColor();
    public abstract void estaRellenado();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenada() {
        return rellenada;
    }

    public void setRellenada(boolean rellenada) {
        this.rellenada = rellenada;
    }



}
