/**
 * Clase que representa a una ave de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public abstract class Ave extends Animal
{    
    private static final int PESO_GANADO_POR_COMER_AVE = 1;

    /**
     * Constructor de objetos de la clase Ave
     * 
     * @param   pesoInicial              El peso inicial del objeto Ave.
     * @param   sonidoCaracteristico     El sonido caracteristico del objeto Ave.
     */
    public Ave(int pesoInicial,String sonidoCaracteristico)
    {
        super(pesoInicial,sonidoCaracteristico);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void comer()
    {
        super.comer();
        incrementarPeso(PESO_GANADO_POR_COMER_AVE);
    }
}