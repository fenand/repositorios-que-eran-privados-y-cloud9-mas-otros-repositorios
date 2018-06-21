public abstract class Animal
{   
    private static final int PUNTOS_VIDA_INICIALES = 100;
    private static final int VARIACION_VIDA_AL_COMER = -10;    
    
    private int peso;
    private int puntosDeVida;
    private String sonidoCaracteristico;

    
    public Animal()
    {
        puntosDeVida = PUNTOS_VIDA_INICIALES;
        peso = 0;
        sonidoCaracteristico = "";
    }
    
    /**
     * Metodo que muestra por pantalla el sonido caracteristico del animal.
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(sonidoCaracteristico);
    }
    
    public void setPeso(int nuevoPeso)
    {
        peso = nuevoPeso;
    }
    
    public int getPeso()
    {
        return peso;
    }
    n
    public void setSonidoCaracteristico(String sonido) 
    {
        sonidoCaracteristico = sonido;
    }
    
    /**
     * Modifica los puntos de vida del animal dependiendo 
     * del numero introducido por parametro.
     * 
     * @param puntos El numero de puntos de vida que se sumaran 
     * o restaran a los actuales.
     */
    public void variaPuntosDeVida(int puntos) 
    {
        puntosDeVida += puntos;
    }
    
    public void comer()
    {
        puntosDeVida += VARIACION_VIDA_AL_COMER;
    }
    
}