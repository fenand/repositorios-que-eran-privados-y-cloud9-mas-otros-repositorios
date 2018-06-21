/**
 * Representa un puerto nautico.
 * 
 * Pertenece al proyecto '0133 - Puerto de Aviles'.
 * 
 * Un puerto nautico tiene un numero de amarres.  
 * Un amarre tiene capacidad para un unico barco y no se puede alquilar
 * si se encuenta ocupado. 
 *
 * @author DAM1-2017/2018
 * @version 2018/05/11
 */
 public class Puerto 
 {  
    // Numero de amarres del puerto.
    private static final int NUMERO_AMARRES = 4;
    // Alquileres de amarres.
    private Alquiler[] amarres;
    
    /**
     * Constructor - Crea un puerto nautico e inicializa los amarres a null.
     */
    public Puerto()
    {
       amarres = new Alquiler[NUMERO_AMARRES];
    }
    
    /**
     * Devuelve toda la informacion del puerto como cadena.
     * @return Devuelve toda la informacion del puerto como cadena.
     */
    public String toString()
    {
        String aDevolver = "";
       
        for(int contadorAmarres = 0; contadorAmarres < amarres.length; contadorAmarres++){
            aDevolver += "AMARRE " + contadorAmarres + "\n";
            if(amarres[contadorAmarres] == null){
                aDevolver += "El amarre esta disponible" + "\n";
            }
            else{
                aDevolver += amarres[contadorAmarres] + "\n";
            }
        }        
        
        return aDevolver;
    }
    
    /**
     * Imprime la informacion de los amarres por pantalla.
     */
    public void verEstadoAmarres()
    {
        System.out.println(this);
    }
    
    /**
     * Alquila el primer amarre disponible para el barco indicado
     * por una cantidad de dias especificada por parametro.
     * @param numDias Duracion del alquiler.
     * @param barco Barco que solicita el alquiler.
     * @return El importe total del alquiler o -1 si no hay amarres
     *         libres.
     */
    public double alquilarAmarre(int numDias, Barco barco)
    {
        double aDevolver = -1;
        int contadorAmarres = 0;
        boolean buscando = true;
        
        while(contadorAmarres < amarres.length && buscando){
            if(amarres[contadorAmarres] == null){
                amarres[contadorAmarres] = new Alquiler(numDias, barco);
                aDevolver = amarres[contadorAmarres].getPrecio();
                buscando = false;
            }
            contadorAmarres++;
        }
        
        return aDevolver;
    }
    
    /**
     * Liquida el alquiler del amarre indicado por parametro.
     * @param numAmarre El numero del amarre del alquiler liquidado.
     * @return Devuelve el importe total del amarre o -1 si no hay
     *         ningun alquiler o el amarre no existe.
     */
    public double liquidarAlquilerAmarre(int numAmarre)
    {
        double aDevolver = -1;
        if (numAmarre < NUMERO_AMARRES && numAmarre >= 0 && amarres[numAmarre] != null){
            aDevolver = amarres[numAmarre].getPrecio();
            amarres[numAmarre] = null;
        }
        return aDevolver;
    
    }
    
    
     
 }