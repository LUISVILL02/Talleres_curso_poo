package laAgencia;

import implementaciones.Local;
import implementaciones.PlazaGaraje;
import implementaciones.Solar;
import implementaciones.Vivienda;
import interfaces.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Inmueble> venta;
    private List<Inmueble> alquiler;

    public Agencia() {
        this.venta = new ArrayList<>();
        this.alquiler = new ArrayList<>();
    }

    public void añadirVentaInmuble(Inmueble inmueble){
        if (inmueble instanceof Vivienda || inmueble instanceof Solar){
            if (venta.isEmpty()){
                venta.add(inmueble);
            }
            if (!venta.contains(inmueble)){
                venta.add(inmueble);
            }
        }
    }
    public void añadirAlquilerInmueble(Inmueble inmueble){
        if (inmueble instanceof PlazaGaraje || inmueble instanceof Local){
            if (alquiler.isEmpty()){
                alquiler.add(inmueble);
            }
            if (!alquiler.contains(inmueble)){
                alquiler.add(inmueble);
            }
        }
    }

    public void inmueblesVentas(int precio){
        for (Inmueble inmuebles : venta) {
            if (inmuebles instanceof Vivienda){
                Vivienda vivienda = (Vivienda) inmuebles;
                if (vivienda.getPrecio() < precio){
                    System.out.println(vivienda.toString());
                }
            }
            if (inmuebles instanceof Solar){
                Solar solar = (Solar) inmuebles;
                if (solar.getPrecio() < precio){
                    System.out.println(solar.toString());
                }
            }
        }
    }
    public void localesSegundaMano(int metros){
        for (Inmueble inmuebles:alquiler) {
            if(inmuebles instanceof Local){
                Local local = (Local) inmuebles;
                if (local.getMetrosCuadrados() > metros){
                    System.out.println(local.toString());
                }
            }
        }
    }
    public int solaresRusticos(){
        int cantidad = 0;
        for (Inmueble inmuebles:venta) {
            if (inmuebles instanceof Solar){
                Solar solar = (Solar) inmuebles;
                if (solar.getUbicacion().equals("rustica")){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
}
