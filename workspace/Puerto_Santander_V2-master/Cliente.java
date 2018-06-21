
/**
 * Write a description of class f here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;
    
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre,String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     *Devuelve el dni. 
     */
    public String getDni()
    {
        return dni;
    }

    /**
     * Devuelve el nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Imprime los datos por pantalla
     */
    public String toString(){
        return "Nombre del cliente: "+ nombre + "\nCon DNI: "+dni;
    }
}

