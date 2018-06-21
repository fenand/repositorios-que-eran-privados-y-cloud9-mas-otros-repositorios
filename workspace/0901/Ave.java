import java.util.Random;

public abstract class Ave extends Animal
{
    private static final int INCREMENTO_COMER = 1; 
    
    private boolean modificadoGeneticamente;
    
    
    public Ave(boolean modificado)
    {
        super();
        modificadoGeneticamente = modificado;
    }
    
    public void comer() 
    {
        setPeso(getPeso() + INCREMENTO_COMER);
        if (modificadoGeneticamente) {
            Random aleatorio = new Random();
            if (aleatorio.nextBoolean()) {  //50% de posibilidades
                super.comer();
            }
        }
        else{
            super.comer();
        }
    }
}