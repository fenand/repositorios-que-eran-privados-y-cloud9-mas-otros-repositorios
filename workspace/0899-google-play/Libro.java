public class Libro extends ProductoMultimedia
{
    private int numeroPaginas;
    private boolean ficcion;
    
    public Libro(String titulo, int anoSalida, int numeroPaginas, boolean ficcion)
    {
        super(titulo, anoSalida);
        this.numeroPaginas = numeroPaginas;
        this.ficcion = ficcion;
        
        //Fijamos el precio del libro
        double precioLibro = numeroPaginas / 100;
        precioLibro = (getAno() > 2010) ? ((precioLibro * getAno()) - 2010) : precioLibro;
        setPrecio(precioLibro);
    }
    
    /**
     * Devuelve el numero de paginas 
     */
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    /**
     *  Devuelve si el libro pertenece al genero de ficcion o no
     */
    public boolean getFiccion()
    {
        return ficcion;
    }
    
    
}

