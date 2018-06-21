/**
 * Clase que representa un pato de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public class Pollo extends Ave implements Vacunable
{
    private static final int PESO_INICIAL_POLLO = 1;
    private static final String SONIDO_POLLO = "Pio, pio";
    private static final int PUNTOS_DE_VIDA_POR_VACUNA_POLLO = 10;

    /**
     * Constructor de objetos de la clase Pollo
     */
    public Pollo()
    {
        super(PESO_INICIAL_POLLO,SONIDO_POLLO);
    }

    /**
     * {@inheritDoc}
     */
    public void vacunar()
    {
        incrementarPuntosDeVida(PUNTOS_DE_VIDA_POR_VACUNA_POLLO);
    }
}
