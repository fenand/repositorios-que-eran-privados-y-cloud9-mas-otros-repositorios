public class Pato extends Ave 
{
    private static final int PESO_INICIAL = 2;
    private static final String SONIDO_CARACTERISTICO = "Cua, cua";
    
    /**
     * Constructor para objetos de la clase Pato.
     * 
     * @param modificado Indica si el animal esta modificado
     *        geneticamente.
     */
    public Pato(boolean modificado) 
    {
        super(modificado);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
}