package ual.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonReaderTest {

	@Test
	void testConstructorEsPrivado() {
		assertThrows(IllegalStateException.class, () -> {
			new JsonReader();
		});
	}

	@Test
	void testLeerCochesJSON() {
		String ruta = "src/main/java/ual/hmis/coches.json";
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals (4, coches.length);
	}

	@Test
	void testLeerCochesJSONprimero() {
		String ruta = "src/main/java/ual/hmis/coches.json";
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals(primero, coches[0]);
		assertTrue (primero.equals(coches[0]));
		assertTrue (coches[0].equals(primero));
	}

	@Test
	void testLeerCochesJSONExcepcion() {
		String ruta = "src/main/java/ual/hmis/archivo_falso.json";
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertNull(coches);
	}


}