package vehiculos;

import java.util.LinkedList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static LinkedList<Fabricante> fabricantes = new LinkedList();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int maxCounter = 0;
        Fabricante maxVendedor = null;
        for(Fabricante fabricante: fabricantes){
            int counter = 0;
            for (Fabricante count: fabricantes){
                if (fabricante == count){
                    counter++;
                    if(counter > maxCounter){
                        maxCounter = counter;
                        maxVendedor = count;
                    }
                }
            }
        }
        return maxVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static LinkedList<Fabricante> getFabricantes() {
        return fabricantes;
    }
}
