import java.util.ArrayList;

public class Usuario
{
    
    private String correoElectronico; //Correo electronico con el que se identifica el usuario
    private ArrayList<Producto> productosComprados;
    
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correo)
    {
        correoElectronico = correo;
        productosComprados = new ArrayList<>();
    }
    
    /**
     * Devuelve el nombre de la cuenta del usuario
     * 
     * @return    El nombre de la cuenta del usuario
     */
    public String getNombreCuenta()
    {
        return correoElectronico;
    }
    
    
    public void comprar(Producto producto)
    {
        productosComprados.add(producto); 
    }
}




