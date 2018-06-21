public class Pelicula extends ProductoMultimedia
{
    private static final int RESOLUCION_MINIMA_FULL_HD = 1080;
    private static final int VALOR_FULL_HD = 10;
    private static final int VALOR_OTROS = 5;
    
    private int minDuracion;
    private int calidad; 
    
    /**
     * Constructor de la clase Pelicula
     * 
     * @param titulo            El titulo de la pelicula
     * @param anoCreacion       El ano de creacion de la pelicula
     * @param duracionMin       La duracion en minutos de la pelicula
     * @param calidad           La calidad de la pelicula
     */
    public Pelicula(String titulo, int anoCreacion,int minDuracion, int calidad)
    {
        super(titulo, anoCreacion);
        this.minDuracion = minDuracion;
        this.calidad = calidad;
        
        //Vamos a fijar el precio de la pelicula
        double precioPelicula = (calidad >= RESOLUCION_MINIMA_FULL_HD) ? VALOR_FULL_HD : VALOR_OTROS;
        precioPelicula = (getAno() < 2000) ? precioPelicula / 2 : precioPelicula;     
        setPrecio(precioPelicula);
    }
    
    public int getDuracion()
    {
        return minDuracion;
    }
    
    public String getCalidad()
    {
        return (calidad >= RESOLUCION_MINIMA_FULL_HD) ? "FullHD" : "HD";
    }

}    


