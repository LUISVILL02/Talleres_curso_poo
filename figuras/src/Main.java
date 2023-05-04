import implementaciones.Cuadrado;
import implementaciones.Rectangulo;
import implementaciones.Triangulo;
import implementaciones.TrianguloRectangulo;
import interfaces.Figura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        int verF = 0;
        double area = 0;
        double perimetro = 0;
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        TrianguloRectangulo triRec = new TrianguloRectangulo();
        boolean menu = true;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Crear rectángulo\n" +
                    "2. Crear cuadrado\n" +
                    "3. Crear triángulo\n"+
                    "4. ver figura\n" +
                    "5. salir"));
            switch (opcion){
                case 1:
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el base del rectangulo: "));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el altura del rectangulo: "));
                    rectangulo = new Rectangulo("rectangulito",base,altura);
                    verF = 1;
                    break;
                case 2:
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado: "));
                    cuadrado = new Cuadrado("cuadradito",lado);
                    verF = 2;
                    break;
                case 3:
                    int cateto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cateto del triangulo: "));
                    triRec = new TrianguloRectangulo("triangulito", cateto);
                    verF = 3;
                    break;
                case 4:
                    if (verF == 1){
                        area = rectangulo.calcularArea();
                        perimetro = rectangulo.calcularPerimetro();
                        System.out.println("area: "+area+" perimetro: "+perimetro);
                        rectangulo.dibujarFigura();
                    }
                    if (verF == 2){
                        area = cuadrado.calcularArea();
                        perimetro = cuadrado.calcularPerimetro();
                        System.out.println("area: "+area+" perimetro: "+perimetro);
                        cuadrado.dibujarFigura();
                    }
                    if (verF == 3){
                        area = triRec.calcularArea();
                        perimetro = triRec.calcularPerimetro();
                        System.out.println("area: "+area+" perimetro: "+perimetro);
                        triRec.dibujarFigura();
                    }
                    if (verF == 0){
                        System.out.println("Cree una figura primero!");
                    }
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    break;
            }

        }while (menu);
    }
}