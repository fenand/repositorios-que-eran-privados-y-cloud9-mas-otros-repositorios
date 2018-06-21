/**
 * Representa cualquier tipo de embarcacion.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Esta clase sirve como plantilla para modelar otros tipos de barcos 
 * mas concretos. 
 *
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
 public abstract class Barco
 {
    // Matricula del barco.
    private String matricula;
    // Propietario del barco.
    private Persona propietario;
    // Distancia en metros desde la proa a la popa.
    private double eslora;
    // Ano en el que fue fabricado el barco.
    private int anoFabricacion;
    
    /**
     * Constructor - Crea una embarcacion.
     * @param matricula Matricula del barco.
     * @param eslora Longitud del barco de proa a popa expresada en metros.
     * @param anoFabricacion Ano en el que fue construido el barco.
     * @param propietario Propietario del barco.
     */
    public Barco(String matricula, double eslora, int anoFabricacion, 
                 Persona propietario) 
    {
        this.matricula = matricula;
        this.propietario = propietario;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }
    
    /**
     * Metodo get para que muestre la informacion de la eslora
     * 
     * @return  la eslora que tiene el barco
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Metodo para mostrar la informacion del coeficiente de Bernua.
     * 
     * @return el coeficiente de Bernua.
     */
    public abstract int getBernua();
    
    /**
     * Metodo para mostrar toda la informacion de la clase Barco
     * 
     * @return la informacion de barco.
     */
    public String toString() 
    {
        //Almacenamos todos los datos a una variable String que sera la que
        //nos muestre la informacion.
        String aDevolver = " ";
        aDevolver += "Propietario del barco: " + propietario + "\n";
        aDevolver += "Matricula del barco: " + matricula + "\n";
        aDevolver += "Eslora: " + eslora + "\n";
        aDevolver += "Ano de fabricacion: " + anioFab + "\n";
        return aDevolver;
    }
    
 }
