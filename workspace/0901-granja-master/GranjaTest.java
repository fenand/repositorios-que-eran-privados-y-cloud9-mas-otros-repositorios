
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GranjaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GranjaTest
{
    private Granja granja1;
    private Pollo pollo1;
    private Pato pato1;
    private Cerdo cerdo1;
    private Vaca vaca1;

    
    /**
     * Default constructor for test class GranjaTest
     */
    public GranjaTest()
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
        granja1 = new Granja();
        pollo1 = new Pollo();
        pato1 = new Pato();
        cerdo1 = new Cerdo();
        vaca1 = new Vaca();
        granja1.alimentar(pollo1);
        granja1.alimentar(pato1);
        granja1.alimentar(cerdo1);
        granja1.alimentar(vaca1);
        granja1.hacerEmitirSonidoCaracteristico(pollo1);
        granja1.hacerEmitirSonidoCaracteristico(pato1);
        granja1.hacerEmitirSonidoCaracteristico(cerdo1);
        granja1.hacerEmitirSonidoCaracteristico(vaca1);
        granja1.vacunar(pollo1);
        granja1.vacunar(cerdo1);
        granja1.vacunar(vaca1);
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
    public void test0901()
    {
    }
}

