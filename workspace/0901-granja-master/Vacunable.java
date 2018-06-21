/**
 * Interfaz que determina que animales pueden ser vacunados. Para ello declara un
 * metodo vacunar() disponible para todas las clases de animales que la implementen.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public interface Vacunable
{
    /**
     * <pre>
     * Metodo que simula la vacunacion de un animal de la granja. Cuando un animal
     * es vacunado su vida incrementa en funcion de la especie:
     * 
     *      --> Pollos:   10 puntos.
     *      --> Cerdos:   20 puntos.
     *      --> Vacas:    30 puntos.
     * </pre>
     */
    void vacunar();
}