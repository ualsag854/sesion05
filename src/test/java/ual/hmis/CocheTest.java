package ual.hmis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche coche;

    @BeforeEach
    void testCrearCoche() {
        coche = new Coche("marcaTest", "modeloTest", 2026, 100);
    }

    @Test
    void testGetMarca() {
        String marca = coche.getMarca();
        assertEquals(marca, "marcaTest");
    }

    @Test
    void testSetMarca() {
        coche.setMarca("marcaTestCambio");
        String marca = coche.getMarca();
        assertEquals(marca, "marcaTestCambio");
    }

    @Test
    void testGetModelo() {
        String modelo = coche.getModelo();
        assertEquals(modelo, "modeloTest");
    }

    @Test
    void testSetModelo() {
        coche.setModelo("modeloTestCambio");
        String modelo = coche.getModelo();
        assertEquals(modelo, "modeloTestCambio");
    }

    @Test
    void testGetAnio() {
        Integer anio = coche.getAnio();
        assertEquals(anio, 2026);
    }

    @Test
    void testSetAnio() {
        coche.setAnio(2030);
        Integer anio = coche.getAnio();
        assertEquals(anio, 2030);
    }

    @Test
    void testGetPrecio() {
        Integer precio = coche.getPrecio();
        assertEquals(precio, 100);
    }

    @Test
    void testSetPrecio() {
        coche.setPrecio(200);
        Integer precio = coche.getPrecio();
        assertEquals(precio, 200);
    }

    @Test
    void testEqualMismoObjeto() {
        boolean esIgual = coche.equals(coche);
        assertTrue(esIgual);
    }

    @Test
    void testEqualNull() {
        boolean esIgual = coche.equals(null);
        assertFalse(esIgual);
    }

    @SuppressWarnings("unlikely-arg-type")
    @Test
    void testEqualDiferenteObjeto() {
        boolean esIgual = coche.equals("Cadena string");
        assertFalse(esIgual);
    }

    @Test
    void testEqualDiferentesCampos() {
        Coche cambioAnio = new Coche("marcaTest", "modeloTest", 2030, 100);

        boolean esIgualAnio = coche.equals(cambioAnio);
        assertFalse(esIgualAnio);

        Coche cambioMarca = new Coche("marcaTestCambio", "modeloTest", 2026, 100);

        boolean esIgualMarca = coche.equals(cambioMarca);
        assertFalse(esIgualMarca);

        Coche cambioModelo = new Coche("marcaTest", "modeloTestCambio", 2026, 100);

        boolean esIgualModelo = coche.equals(cambioModelo);
        assertFalse(esIgualModelo);

        Coche cambioPrecio = new Coche("marcaTest", "modeloTest", 2026, 200);

        boolean esIgualPrecio = coche.equals(cambioPrecio);
        assertFalse(esIgualPrecio);
    }

    @Test
    void testToString() {
        String stringValido = "Coche [marca=marcaTest, modelo=modeloTest, año=2026, precio=100]";
        String stringCoche = coche.toString();
        assertEquals(stringValido, stringCoche);
    }

    @Test
    void testHashCode() {
        Coche coche2 = new Coche("marcaTest", "modeloTest", 2026, 100);
        assertEquals(coche.hashCode(), coche2.hashCode());
    }

    
}
