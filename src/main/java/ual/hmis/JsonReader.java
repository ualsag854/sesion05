package ual.hmis;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public final class JsonReader {

    /** Constructor. */
    /* package */ JsonReader() {
        throw new IllegalStateException("Utility class");
    }

	public static Coche[] leerCochesJSON (final String archivo) {

		Coche[] coches = null;
        final Gson gson = new Gson();
        final JsonParser parser = new JsonParser();

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8)) {
            // Parsear el archivo JSON en un objeto de la clase JsonObject
            final JsonObject jsonObject = parser.parse(reader).getAsJsonObject();

            // Obtener el arreglo de objetos "coches"
            final JsonArray cochesJson = jsonObject.getAsJsonArray("coches");

            // Crear un arreglo de la clase Coche y llenarlo con los objetos del archivo JSON
            coches = gson.fromJson(cochesJson, Coche[].class);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coches;
        
	}
}