/**
 * Clase que representa una vaca de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public class Cerdo extends Mamifero implements Vacunable
{
    private static final int PESO_INICIAL_CERDO = 15;
    private static final String SONIDO_CERDO = "Ñoinq, ñoinq";
    private static final int PUNTOS_DE_VIDA_POR_VACUNA_CERDO = 20;

    /**
     * Constructor de objetos de la clase Cerdo
     */
    public Cerdo()
    {
        super(PESO_INICIAL_CERDO,SONIDO_CERDO);
    }

    /**
     * {@inheritDoc}
     */
    public void vacunar()
    {
        incrementarPuntosDeVida(PUNTOS_DE_VIDA_POR_VACUNA_CERDO);
    }
}
