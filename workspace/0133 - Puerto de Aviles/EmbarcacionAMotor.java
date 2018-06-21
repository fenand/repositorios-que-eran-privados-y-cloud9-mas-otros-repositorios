/**
 * Representa una embarcacion a motor.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Una embarcacion a motor es un barco caracterizado por la potencia de su 
 * motor. Su coeficiente de Bernau es: la potencia de su motor en CV.
 * 
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
public class EmbarcacionAMotor extends Barco 
{
    // Potencia del motor expresada en CV.
    private int potenciaCV;
    
     /**
     * Constructor para objetos de la clase EmbarcacionAMotor.
     * 
     * @param matricula La matricula del barco a motor.
     * @param eslora La longitud en metros del barco a motor.
     * @param anoFabricacion El ano en que se ha fabricado el barco a motor.
     * @param persona El cliente propietario del barco a motor.
     * @param potenciaCV La potencia en CV del barco a motor.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anoFabricacion, Persona persona, int potenciaCV)
    {
        super(matricula, eslora, anoFabricacion, persona);
        this.potenciaCV = potenciaCV;
    }
    
    /**
     * Metodo que devuelve el Coeficiente Bernua.
     * @return    El coeficiente Bernua.
     */
    @Override
    public int getCoeficienteBernua()
    {
        return potenciaCV;
    }
    
    /**
     * Devuelve un String con los datos de la embarcacion a motor.
     *
     * @return     Cadena con los datos. 
     */
    @Override
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "\nPotencia: " + potencia + "CV.";
        return aDevolver;
    }

}