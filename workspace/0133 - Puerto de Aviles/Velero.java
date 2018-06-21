/**
 * Representa una embarcacion a vela.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Un velero se caracteriza por tener mastiles. Su coeficiente de 
 * Bernua es igual a : su numero de mastiles.
 * 
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
public class Velero extends Barco
{
    // Numero de mastiles.
    private int numMastiles;
    
    /**
     * Constructor de objetos de la clase Velero
     * @param matricula la matricula del Velero
     * @param eslora la eslora del Velero
     * @param anoFabricacion el ano de fabricacion del Velero
     * @param propietario el propietario del Velero
     * @param numeroMastiles el numero de mastiles del Velero
     */
    public Velero(String matricula, double eslora, int anoFabricacion, 
                  Persona propietario, int numMastiles)
    {
        super(matricula, eslora, anoFabricacion, propietario);
        this.numMastiles = numMastiles;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del barco.
     * Su coeficiente de Bernua es igual a : su numero de mastiles.
     * @return Devuelve el coeficiente de Bernua del barco.
     */
    @Override
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de mástiles: " + numMastiles;
    }
    
}