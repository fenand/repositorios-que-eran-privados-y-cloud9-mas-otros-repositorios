/**
 * Clase que representa un animal de la granja.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public abstract class Animal
{
    private static final int PUNTOS_DE_VIDA_INICIALES = 100;
    private static final int PUNTOS_DE_VIDA_PERDIDOS_AL_COMER = 10;
    private int puntosDeVida;
    private int peso;
    private String sonidoCaracteristico;

    /**
     * Constructor de objetos de la clase Animal
     * 
     * @param   pesoInicial              El peso inicial del objeto Animal.
     * @param   sonidoCaracteristico     El sonido caracteristico del objeto Animal.
     */
    public Animal(int pesoInicial,String sonidoCaracteristico)
    {
        puntosDeVida = PUNTOS_DE_VIDA_INICIALES;
        peso = pesoInicial;
        this.sonidoCaracteristico = sonidoCaracteristico;
    }

    /**
     * Metodo que simula el acto de ingesta de alimentos del animal.
     * 
     * Cuando se invoca incrementa en 1 kilogramo el peso si se trata de un
     * pollo o un pato o en 2 kilogramos si se trata de un cerdo o una vaca.
     * En cualquier caso, reduce los puntos de vida del animal en 10 puntos.
     */
    public void comer()
    {
        puntosDeVida -= PUNTOS_DE_VIDA_PERDIDOS_AL_COMER;
    }

    /**
     * Metodo que simula al un animal emitiendo el sonido caracteristico de su especie.
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(sonidoCaracteristico);
    }

    /**
     * Getter del peso del animal.
     *
     * @return  El peso del animal en Kg.
     */
    public int getPeso()
    {
        return peso;
    }

    /**
     * Getter de los puntos de vida del animal.
     *
     * @return  Los puntos de vida del animal.
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }

    /**
     * Metodo que incrementa el peso del animal tras ser alimentado en funcion
     * de la clase a la que pertenece.
     */
    public void incrementarPeso(int incrementoDePeso)
    {
        peso += incrementoDePeso;
    }

    /**
     * Metodo que incrementa los puntos de vida del animal tras ser vacunado.
     */
    public void incrementarPuntosDeVida(int incrementoPuntosDeVida)
    {
        puntosDeVida += incrementoPuntosDeVida;
    }
}
