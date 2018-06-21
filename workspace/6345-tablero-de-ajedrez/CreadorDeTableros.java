public class CreadorDeTableros
{
    private final static int NUMERO_DE_ESCAQUES = 8;
    
    public String devolverTablero(String dato) 
    {
        String aDevolver = "";
        
        String[] partesDato = dato.split(" "); //podemos utilizar tambien  \\s
        int anchoEscaque = Integer.parseInt(partesDato[0]);
        String caracterNegro = partesDato[1];
        
        
        aDevolver += devolverTapa(anchoEscaque);
        // En cada iteracion se dibujan dos lineas, por eso se divide entre 2.
        for (int i=0 ; i < NUMERO_DE_ESCAQUES / 2 ; i++) {
            aDevolver += devuelveFilaInicioEscaqueBlanco(anchoEscaque,caracterNegro);
            aDevolver += devuelveFilaInicioEscaqueNegro(anchoEscaque,caracterNegro);
        }
        
        aDevolver += devolverTapa(anchoEscaque);
        
        return aDevolver;
    }
    
    
    /**
     * Devuelve el borde del tablero (inferior o superior, es el mismo)
     */
    public String devolverTapa(int anchoEscaque) 
    {
        String tapaADevolver = "|";
        for (int i = 0; i < anchoEscaque * NUMERO_DE_ESCAQUES; i++) {
            tapaADevolver += "-";
        }
        return tapaADevolver + "|\n";
    }
        
    
    /**
     * Devuelve todo el texto que conforma una fila del tablero que comienza
     * con escaque blanco
     */
    public String devuelveFilaInicioEscaqueBlanco(int anchoEscaque, String caracterNegro)
    {
        String aDevolver = "";
        for(int i = 0; i < anchoEscaque; i++) {
           aDevolver += devuelveLinea(true, anchoEscaque, caracterNegro);
        }
        return aDevolver ;
    }
    
    
    /**
     * Devuelve todo el texto que conforma una fila del tablero que comienza
     * con escaque negro
     */
    public String devuelveFilaInicioEscaqueNegro(int anchoEscaque, String caracterNegro)
    {
        String aDevolver = "";
        for(int i = 0; i < anchoEscaque; i++) {
           aDevolver += devuelveLinea(false, anchoEscaque, caracterNegro);
        }
        return aDevolver ;        
    }
    
    
    /**
     * Devuelve una linea del tablero que comienza por escaques blanco si 
     * el primer parametro es true, por escaques negros si el primer parametro es false
     */
    public String devuelveLinea(boolean seIniciaConBlancos, int anchoEscaque, String caracterNegro)
    {
        String aDevolver = "|";
        for(int i = 0; i < NUMERO_DE_ESCAQUES ; i++){
            aDevolver+= devuelveParteEscaqueLinea(seIniciaConBlancos, anchoEscaque, caracterNegro);
            seIniciaConBlancos = !seIniciaConBlancos;
        }
        return aDevolver + "|\n";
    }
    
    
    /**
     * Devuelve la parte de un escaque (negro o blanco) correspondiente a un alinea
     */
    public String devuelveParteEscaqueLinea(boolean escaqueBlanco, int anchoEscaque, String caracterNegro) 
    {
        String aDevolver = "";
        String caracterEscaque = escaqueBlanco ? " " : caracterNegro;
        for (int i = 0; i < anchoEscaque; i++) {
            aDevolver += caracterEscaque;
        }
        return aDevolver;
    }


}
