public abstract class ProductoMultimedia extends Producto
{
    private String titulo;
    private int ano;
    
    public ProductoMultimedia(String titulo, int ano)
    {
        super();
        this.titulo = titulo;
        this.ano = ano;
    }
    
    /**
     * Devuelve el titulo del producto multimedia.
     *
     * @return  el titulo del producto multimedia
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    /**
     * Devuelve el año de creacion del producto multimedia.
     *
     * @return  el año de creacion del producto multimedia
     */
    public int getAno()
    {
        return ano;
    }
    
    public  String getIdentificador()
    {
         return titulo;
    }
}

