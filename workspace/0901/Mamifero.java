public abstract class Mamifero extends Animal
{
    private static final int INCREMENTO_COMER = 2;
    private int calidadRaza;
    
    
    public Mamifero(int calidadRaza)
    {
        super();
        this.calidadRaza = calidadRaza;
    }
    
    public void comer()
    {
        setPeso(getPeso() + INCREMENTO_COMER);
        super.comer();
        if (calidadRaza >= 5)
        {
            variaPuntosDeVida(calidadRaza);
        }
    }
  
}