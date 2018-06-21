public abstract class Producto
{
    // Cantidad de unidades vendidas del producto
    private int unidadesVendidas;
    // Precio actual del producto
    private double precio;
    
    public Producto() 
    {
        precio = 0;
        unidadesVendidas = 0;
    }
    
    public int getUnidadesVendidas()
    {
        return unidadesVendidas;
    }
    
    public double getPrecio()
    {
        return precio;
        
    }
    
    public abstract String getIdentificador();
    
    
    public void vender(){
        unidadesVendidas++;
    }
    
    public void setPrecio(double precioNuevo){
        precio = precioNuevo;
    }
    

    
}

