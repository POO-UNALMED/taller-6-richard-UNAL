package vehiculos;

import java.util.LinkedList;

public class Pais {
    private String nombre;

    private static LinkedList<Pais> paises = new LinkedList();

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        int counter = 0;
        int maxCounter = 0;
        Pais maxVendedor = null;
        for (Pais pais: paises){
            counter = 0;
            for(Pais count: paises){
                if (pais == count){
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

    public static LinkedList<Pais> getPaises() {
        return paises;
    }
}
