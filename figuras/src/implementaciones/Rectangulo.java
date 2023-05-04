package implementaciones;

import interfaces.Figura;

public class Rectangulo implements Figura {
    private String nombre;
    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(this.base + this.altura);
    }

    @Override
    public void dibujarFigura() {

        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
