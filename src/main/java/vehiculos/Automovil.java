package vehiculos;

import java.util.List;

public class Automovil extends Vehiculo {
    private int puestos;

    private static int contarAutomovil;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4 , 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        contarAutomovil++;
    }

    public static int getContarAutomovil() {
        return contarAutomovil;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
