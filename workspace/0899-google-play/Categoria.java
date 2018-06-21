public enum Categoria
{
    MULTIMEDIA("Multimedia", 2),
    COMUNICACIONES("Comunicaciones", 2),
    JUEGOS("Juegos", 5),
    PRODUCTIVIDAD("Productividad", 10);
    
    private String categoria;
    private double precioIncrementado;
    
    private Categoria(String categoria, double precioIncrementado)
    {
        this.categoria = categoria;
        this.precioIncrementado = precioIncrementado;
    }
    
    public String getCategoria()
    {
        return categoria;
    }
    
    public double getPrecioIncrementado()
    {
        return precioIncrementado;
    }
    
    
}


