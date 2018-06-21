/**
 * Representa un yate.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Un yate es una embarcacion a motor que dispone de camarotes. Su 
 * coeficiente de Bernua es igual a: su potencia en CV + el numero de 
 * camarotes.
 * 
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
 public class Yate extends EmbarcacionAMotor
 {  
    // Cantidad de camarotes.
    private int numCamarotes;
    
    /**
     * Constructor de objetos de la clase yate.
     * @param matricula Matricula del barco.
     * @param eslora Longitud del barco de proa a popa expresada en metros.
     * @param anoFabricacion Ano en el que fue construido el barco.
     * @param propietario Propietario del barco.
     * @param potencia Potencia del motor en CV.
     * @param numCamarotes El numero de camarotes que tiene el yate.
     */
    public Yate(String matricula, double eslora, int anoFabricacion, Persona propietario, int potencia, int numCamarotes)
    {
        super(matricula, eslora, anoFabricacion, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }    
    
    /**
     * Devuelve el coeficiente bernua de la embarcacion.
     * @return El coeficiente bernua.
     */
    @Override
    public  int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + numCamarotes;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "\nCAMAROTES:" + numCamarotes; 
        return aDevolver;
    }
    
 }