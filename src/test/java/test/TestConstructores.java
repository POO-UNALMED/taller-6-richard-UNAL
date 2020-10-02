package test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import vehiculos.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestConstructores {
	
	public static Pais p = new Pais("Colombia");
	
	public static Fabricante f = new Fabricante("Renault", p);

	@Test
   	public void testAutomovil() {

		Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);

		boolean ok = false;
		if (ve.getPuertas() == 4 && ve.getTraccion().equals("FWD")
				&& ve.getVelocidadMaxima() == 100) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase vehiculo.Automovil");
	}
	
	@Test
   	public void testCamioneta() {

		Vehiculo ve = new Camioneta("CC", 5, "Ford", 500, 150, f, true);

		boolean ok = false;
		if (ve.getTraccion().equals("4X4")
				&& ve.getVelocidadMaxima() == 90) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase vehiculo.Camioneta");
	}
	
	@Test
   	public void testCamion() {

		Vehiculo ve = new Camion("SS", "vehiculo.Camion premium", 1000, 100, f, 3);

		boolean ok = false;
		if (ve.getPuertas() == 2 && ve.getTraccion().equals("4X2")
				&& ve.getVelocidadMaxima() == 80) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase vehiculo.Camion");
	}
	
	@Test
   	public void testVehiculo() {

		Vehiculo ve = new Vehiculo("TEST", 4, 4, "SS", 100, 10, "AWD", f);

		boolean ok = false;
		if (ve.getPlaca().equals("TEST") && ve.getPuertas() == 4 && ve.getVelocidadMaxima() == 4
				&& ve.getNombre().equals("SS") && ve.getPrecio() == 100 && ve.getPeso() == 10
				&& ve.getTraccion().equals("AWD")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase vehiculo.Vehiculo");
	}
	
	@Test
   	public void testFabricante(){
		
		Fabricante f = new Fabricante("Renault", p);
		
		boolean ok = false;
		if(f.getNombre().equals("Renault")
				&& f.getPais() == p) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Fabricante");
    }
	
	@Test
   	public void testPais(){
		
		Pais p = new Pais("Colombia");
		
		boolean ok = false;
		if(p.getNombre().equals("Colombia")) {
			ok = true;
		}
		assertTrue(ok, "Hay un error en los constructores de la clase Pais");
    }

}
