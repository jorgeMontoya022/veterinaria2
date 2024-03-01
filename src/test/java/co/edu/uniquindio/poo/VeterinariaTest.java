/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos(){
        LOG.info("Inicio de test datosCompletos");

        var veterinaria = new Veterinaria("Bob", Especie.VERTEBRADO, "bulldog inglés", (byte)2, Genero.MACHO, "Blanco", 18.6f);

        assertEquals("Bob", veterinaria.getNombre());
        assertEquals(Especie.VERTEBRADO, veterinaria.getEspecie());
        assertEquals("bulldog inglés", veterinaria.getRaza());
        assertEquals((byte)2, veterinaria.getEdad());
        assertEquals(Genero.MACHO, veterinaria.getGenero());
        assertEquals("Blanco", veterinaria.getColor());
        assertEquals(18.6f, veterinaria.getPeso());

        LOG.info("fin de test datosCompletos");
    }

    @Test
    public void datosNulos(){
        LOG.info("Inicio de test datos nulos");

        assertThrows(Throwable.class, ()->new Veterinaria(null, null, null, (byte)0, null, null, 0f));

        LOG.info("fin del test datos nulos");
      
    }

    @Test
    public void edadNegativo(){
        assertThrows(Throwable.class, ()-> new Veterinaria("Bob", Especie.VERTEBRADO, "bulldog inglés", (byte)-2, Genero.MACHO, "Blanco", 18.6f));
    }

    @Test
    public void pesoNegativo(){
        assertThrows(Throwable.class, ()-> new Veterinaria("Bob", Especie.VERTEBRADO, "bulldog inglés", (byte)2, Genero.MACHO, "Blanco", -18.6f));
    }

    @Test
    public void datosVacios(){
        LOG.info("Inicio de test datosVacios");

        assertThrows(Throwable.class, ()-> new Veterinaria(" ", Especie.VERTEBRADO, " ", (byte)0, Genero.MACHO, " ", 0f));
        
       
    }

    


}
