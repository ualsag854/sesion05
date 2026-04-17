package ual.hmis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class PrincipalTest {

    @Test
    void testConstructorPrincipal() {
        Principal main = new Principal();
        assertNotNull(main);
    }

    @Test 
    void testVoidPrincipal() {
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        Principal.main(new String[]{});

        String salidaLimpia = salida.toString().trim();

        assertEquals(salidaLimpia, "Hello world!");
    }
  
    
}
