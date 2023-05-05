import implementaciones.Local;
import implementaciones.PlazaGaraje;
import implementaciones.Solar;
import implementaciones.Vivienda;
import interfaces.Inmueble;
import laAgencia.Agencia;

public class Main {
    public static void main(String[] args) {

        Inmueble inmueble1 = new Solar("rustica",80,2000);
        Inmueble inmueble2 = new Vivienda(4,3,1,90);

        Inmueble inmueble3 = new Local(2,40,500);
        Inmueble inmueble4 = new PlazaGaraje("publico",20,200);

        Agencia agencia = new Agencia();

        agencia.añadirAlquilerInmueble(inmueble4);
        agencia.añadirAlquilerInmueble(inmueble3);

        agencia.añadirVentaInmuble(inmueble1);
        agencia.añadirVentaInmuble(inmueble2);

        agencia.inmueblesVentas(5000);

        agencia.localesSegundaMano(20);

        System.out.println("total solares rusticos: "+agencia.solaresRusticos());
    }
}