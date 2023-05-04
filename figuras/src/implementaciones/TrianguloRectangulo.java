package implementaciones;

public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(String nombre, int cateto) {
        super(nombre, cateto, cateto, 90);
    }

    public TrianguloRectangulo() {
    }

    @Override
    public void dibujarFigura() {
        for (int i = 0; i < getLado1(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
