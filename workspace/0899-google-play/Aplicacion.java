public class Aplicacion extends Producto
{
    private static final double PRECIO_INICIAL = 0.99;
    private static final int UNIDADES_VENDIDAS_CAMBIO_PRECIO = 2;
        
    private String nombre;
    private double tamanoEnMB;
    private Categoria categoria;
  
    
    /**
     * Constructor for objects of class Aplicacion
     * @param nombre String con el nombre la apli
     * @param tamanoEnMB double con el esacio en la memoria que ocupa la api en MB
     * @param categoria categoria de la aplicacion definido en su propia clse
     */
    public Aplicacion(String nombre, double tamanoEnMB, Categoria categoria)
    {
        super();
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamanoEnMB = tamanoEnMB;
        
        //Fijar el precio de la aplicacion
        setPrecio(PRECIO_INICIAL);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public double getTamanoEnMB()
    {
        return tamanoEnMB;
    }
    
    public String getCategoria()
    {
        return categoria.getCategoria();
    }
    
    public String getIdentificador()
    {
        return nombre;
    }
    
    public void vender() {
        super.vender();
        if (getUnidadesVendidas() >= UNIDADES_VENDIDAS_CAMBIO_PRECIO) {
            setPrecio(categoria.getPrecioIncrementado());
        }
    }
    
}

