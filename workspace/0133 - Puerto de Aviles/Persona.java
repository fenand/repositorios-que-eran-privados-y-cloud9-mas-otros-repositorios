/**
 * Representa una persona
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
public class Persona {
    
    // Nombre de la persona.
    private String nombre;
    // DNI de la persona.
    private String dni;
    
    /**
     * Constructor de objetos de la clase Persona.
     * @param nombre Nombre de la persona.
     * @param dni DNI de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;       
    }
    
    /**
     * Devuelve la informacion de la persona como una cadena.
     * @return Devuelve la informacion de la persona como una cadena.
     */
    @Override
    public String toString()
    {
        return "Propietario: " + nombre + "\nDNI: " + dni;
    }
}