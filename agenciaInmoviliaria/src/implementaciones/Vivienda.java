package implementaciones;

import interfaces.Construccion;

public class Vivienda implements Construccion {
    private int precio;
    private int numHabitaciones;
    private int piso;
    private int estadoVivienda;
    private String ubicacion = "urbana";
    private int metrosCua;

    public Vivienda(int numHabitaciones, int piso, int estadoVivienda, int metrosCua) {
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
        this.estadoVivienda = estadoVivienda;
        this.metrosCua = metrosCua;
    }

    @Override
    public int getEstadoConstruccion() {
        return estadoVivienda;
    }

    @Override
    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int getMetrosCuadrados() {
        return metrosCua;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vivienda[ " +
                "precio: " + precio +
                ", numHabitaciones: " + numHabitaciones +
                ", piso=" + piso +
                ", estadoVivienda: " + estadoVivienda +
                ", ubicacion: '" + ubicacion + '\'' +
                ", metrosCua: " + metrosCua +
                ']';
    }
}
