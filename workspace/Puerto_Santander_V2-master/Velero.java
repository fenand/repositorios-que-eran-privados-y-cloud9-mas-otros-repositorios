/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    //numero de mastiles qe tiene el barco 
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles,String matricula,float eslora,int anoFab)
    {
        super(matricula, eslora, anoFab);
        this.numeroMastiles = numeroMastiles;
    }
    
    /**
     * Devuelve el coeficiente de bernua del Velero
     */
    public int getCoeficienteBernua(){
       return numeroMastiles; 
    }
    
     /**
     * Imprime los datos por pantalla del Velero
     */
    public String toString(){
        return "Matricula: "+ getMatricula() + "\nEslora: "+ getEslora() +"\nAño Fabricación: "
                + getAnoFabricacion() + "\nNumero de mastiles: "+ numeroMastiles;
    }
}