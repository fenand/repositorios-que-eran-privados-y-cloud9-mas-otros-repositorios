/**
 * Clase que representa una vaca de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public class Vaca extends Mamifero implements Vacunable
{
    private static final int PESO_INICIAL_VACA = 25;
    private static final String SONIDO_VACA = "Muuuu, muuuu";
    private static final int PUNTOS_DE_VIDA_POR_VACUNA_VACA = 30;

    /**
     * Constructor de objetos de la clase Vaca
     */
    public Vaca()
    {
        super(PESO_INICIAL_VACA,SONIDO_VACA);
    }

    /**
     * {@inheritDoc}
     */
    public void vacunar()
    {
        incrementarPuntosDeVida(PUNTOS_DE_VIDA_POR_VACUNA_VACA);
    }
}
