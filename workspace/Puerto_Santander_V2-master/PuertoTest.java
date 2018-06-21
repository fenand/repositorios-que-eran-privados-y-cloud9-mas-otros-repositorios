

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void addAlquiler001()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Dani", "Kraken");
        Velero velero1 = new Velero(2, "Kraken", 4, 6854);
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(680, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(720, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(640, puerto1.liquidarAlquiler(0), 0.1);
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
    }
    
    @Test
    public void addAlquiler002()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Dani", "Kraken");
        Velero velero1 = new Velero(2, "Kraken", 4, 6854);
        System.out.println("Comprobamos que el puerto esta vacio:");
        puerto1.verEstadoAmarres();
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(3, puerto1.addAlquiler(4, cliente1, velero1));
        System.out.println("Añadimos 3 barcos:");
        puerto1.verEstadoAmarres();
        assertEquals(680, puerto1.liquidarAlquiler(1), 0.1);
        System.out.println("Eliminamos el Barco del amarre 1:");
        puerto1.verEstadoAmarres();
        assertEquals(1, puerto1.addAlquiler(2, cliente1, velero1));
        System.out.println("1)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        assertEquals(720, puerto1.liquidarAlquiler(2), 0.1);
        System.out.println("Eliminamos el Barco del amarre 2:");
        puerto1.verEstadoAmarres();
        assertEquals(2, puerto1.addAlquiler(3, cliente1, velero1));
        System.out.println("2)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        assertEquals(640, puerto1.liquidarAlquiler(0), 0.1);
        System.out.println("Eliminamos el Barco del amarre 0:");
        puerto1.verEstadoAmarres();
        assertEquals(0, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("3)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
        assertEquals(760, puerto1.liquidarAlquiler(3), 0.1);
        System.out.println("Eliminamos el Barco del amarre 3:");
        puerto1.verEstadoAmarres();
        assertEquals(3, puerto1.addAlquiler(1, cliente1, velero1));
        System.out.println("4)Añadimos 1 barco:");
        puerto1.verEstadoAmarres();
    }


    @Test
    public void prueba()
    {
        Puerto puerto1 = new Puerto();
        puerto1.verEstadoAmarres();
    }
}



