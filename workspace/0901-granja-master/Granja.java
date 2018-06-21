/**
 * Clase que simula la alimentacion y cuidado de los animales de una
 * granja muy simple.
 * 
 * Los animales pueden ser alimentados y vacunados, asi como tambien pueden emitir
 * los sonidos caracteristicos de su especie.
 *
 * @author Didac Fernandez
 * @version 2018/05/15 - 11:40
 */
public class Granja
{
    /**
     * Constructor de objetos de la clase Granja
     */
    public Granja()
    {        
    }

    /**
     * Metodo que simula el acto de alimentar a un animal de la granja.
     *
     * @param  animal  El objeto de la clase Animal que es alimentado.
     */
    public void alimentar(Animal animal)
    {
        if(animal.getPuntosDeVida() > 0){
            animal.comer();
        }
        else{
            System.out.println("El animal tiene 0 puntos de vida.");
        }
    }

    /**
     * Metodo que simula el acto de vacunar a un animal de la granja. Solo pueden
     * ser vacunados aquellos animales que implementen la clase Vacunable.
     * 
     * Recibe como parametro una variable estatica de la clase interfaz Vacunable
     * que solo puede almacenar de forma dinamica objetos de las clases que la
     * implementan, asegurandose que solo se pueda invocar sobre animales
     * que sean vacunables.
     *
     * @param  animal  El objeto de la clase Vacunable que representa al animal a vacunar.
     */
    public void vacunar(Vacunable animal)
    {
        animal.vacunar();
    }

    /**
     * Metodo que simula a un animal de la granja emitiendo su sonido caracteristico.
     *
     * @param  animal  El objeto de la clase Animal que emite el sonido.
     */
    public void hacerEmitirSonidoCaracteristico(Animal animal)
    {
        animal.emitirSonidoCaracteristico();
    }
}
