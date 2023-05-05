package implementaciones;

import interfaces.Construccion;

public class Local implements Construccion {

    private int estadoLocal;
    private String ubicacion = "urbana";
    private int metrosCua;
    private int precioMC;

    public Local(int estadoLocal, int metrosCua, int precioMC) {
        this.estadoLocal = estadoLocal;
        this.metrosCua = metrosCua;
        this.precioMC = precioMC;
    }

    @Override
    public int getEstadoConstruccion() {
        return estadoLocal;
    }

    @Override
    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int getMetrosCuadrados() {
        return metrosCua;
    }
    public int precio(){
        return precioMC * metrosCua;
    }

    @Override
    public String toString() {
        return "Local[ " +
                "estadoLocal: " + estadoLocal +
                ", ubicacion: '" + ubicacion + '\'' +
                ", metrosCua: " + metrosCua +
                ", precioMC: " + precioMC +
                ']';
    }
}
