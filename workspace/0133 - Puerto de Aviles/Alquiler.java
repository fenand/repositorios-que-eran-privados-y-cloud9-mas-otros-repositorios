/**
 * El alquiler de un amarre del puerto nautico.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Cada alquiler se realiza por un numero de dias y esta a asociado a una 
 * embarcacion. El alquiler debe ser liquidado antes de que el barco abandone el
 * puerto.
 *
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
public class Alquiler
{
    // Precio base de un alquiler.
    private final static int PRECIO_BASE = 300;
    // Multiplicador aplicado a la eslora.
    private final static int MULTIPLICADOR_ESLORA = 10;
    // Duracion del alquiler.
    private int numeroDias;
    // Barco que solicita el alquiler.
    private Barco barco;
    
    /**
     * Constructor - Crea un alquiler indicando su duracion en dias y el barco 
     * que lo realiza.
     * 
     * @param numeroDias Numero de dias que dura el alquiler.
     * @param barco Barco que realiza el alquiler.
     */
    public Alquiler(int numDias, Barco barco)
    {
        this.barco = barco;  
        numeroDias = numDias;
    }
    
    
    /**
     *  Devuelve el costo del alquiler
     *  @return el precio a pagar por el alquiler
     */
    public double getPrecio()
    {
        return (numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA)) + 
                (PRECIO_BASE * barco.getCoeficienteBernua());
    }
    
    /**
     * Devuelve toda la información de la clase Alquiler.
     * @return - todos los atributos declarados más arriba e inicializados en el constructor.
     */
    @Override
    public String toString()
    {
        return "Numero de dias de alquiler: " + numeroDias + "\nBarco:\n" + barco;
    }
 
}