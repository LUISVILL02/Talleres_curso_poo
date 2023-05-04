package implementaciones;

import interfaces.Figura;

public abstract class Triangulo implements Figura {
    private String nombre;
    private int lado1;
    private int lado2;
    private int angulo;

    public Triangulo(String nombre, int lado1, int lado2, int angulo) {
        this.nombre = nombre;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
    }

    public Triangulo() {
    }

    @Override
    public String nombre() {
        return nombre;
    }

    public int getLado1() {
        return lado1;
    }

    @Override
    public double calcularArea() {
        return ((this.lado1 * this.lado2)*Math.sin(this.angulo))/2;
    }

    @Override
    public double calcularPerimetro() {
        double lado3 = Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2)-2*lado1*lado2*Math.cos(angulo));
        return (lado1+lado2+lado3);
    }

    @Override
    abstract public void dibujarFigura();
}
