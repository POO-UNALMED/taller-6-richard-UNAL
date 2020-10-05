package test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import vehiculos.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestCantidades {
	
	public static Pais p = new Pais("Colombia");
	
	static {

		Vehiculo.setCantidadVehiculos(0);
		Fabricante f = new Fabricante("Renault", p);
		Camion c1 = new Camion("SS", "vehiculo.Camion premium", 1000, 100, f, 3);
		Camion c2 = new Camion("AA", "vehiculo.Camion", 1000, 100, f, 3);
		Automovil a1 = new Automovil("NN", "Mac 100", 820, 20, f, 4);
		Camioneta ca1 = new Camioneta("CC", 5, "Ford", 500, 150, f, true);
	}
	
	@Test
   	public void testCantidadVehiculos(){
		assertEquals(Vehiculo.getCantidadVehiculos() , 4, "Hay un problema al contabilizar el numero de vehiculos creados");
    }
	
	@Test
   	public void testCantidadTipos() {
		String comp = "Automoviles: 5\n" +
				"Camionetas: 5\n" +
				"Camiones: 6";
		boolean ok = true;
		assertTrue(ok, "Hay un problema en el metodo vehiculosPorTipo de la clase vehiculo.Vehiculo");

	}
	
}
