/**
 * Clase que representa un pato de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public class Pato extends Ave
{
    private static final int PESO_INICIAL_PATO = 2;
    private static final String SONIDO_PATO = "Cua, cua";

    /**
     * Constructor de objetos de la clase Pato
     */
    public Pato()
    {
        super(PESO_INICIAL_PATO,SONIDO_PATO);
    }
}
