public class Granja
{
    public void alimentar(Animal animal)
    {
        animal.comer();
    }
    
    public void haceEmitirSonidoCaracteristico(Animal animal)
    {
        animal.emitirSonidoCaracteristico();
    }
    
    
    public void vacunar(Vacunable animal)
    {
        animal.vacunar();
    }
    
}