package implementaciones;

import interfaces.Superficie;

public class Solar implements Superficie {
    private String ubicacion;
    private int metrosCuadrados;
    private int precioPorMC;

    public Solar(String ubicacion, int metrosCuadrados, int precioPorMC) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
        this.precioPorMC = precioPorMC;
    }

    @Override
    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public double getPrecio() {
        return metrosCuadrados*precioPorMC;
    }
    public int getPrecioPorMC(){
        return precioPorMC;
    }

    @Override
    public String toString() {
        return "Solar[ " +
                "ubicacion: '" + ubicacion + '\'' +
                ", metrosCuadrados: " + metrosCuadrados +
                ", precioPorMC: " + precioPorMC +
                ']';
    }
}
