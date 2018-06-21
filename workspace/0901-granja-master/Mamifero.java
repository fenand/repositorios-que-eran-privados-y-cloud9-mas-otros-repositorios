/**
 * Clase que representa a un mamifero de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public abstract class Mamifero extends Animal
{    
    private static final int PESO_GANADO_POR_COMER_MAMIFERO = 2;

    /**
     * Constructor de objetos de la clase Mamifero
     * 
     * @param   pesoInicial              El peso inicial del objeto Mamifero.
     * @param   sonidoCaracteristico     El sonido caracteristico del objeto Mamifero.
     */
    public Mamifero(int pesoInicial,String sonidoCaracteristico)
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
        incrementarPeso(PESO_GANADO_POR_COMER_MAMIFERO);
    }
}
