import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class EjercicioR481
{
  public String devolverEnOrden(ArrayList<Integer> numeros)
  {
    String numerosOrdenados = "";
    
    while(numeros.size() > 0){
        int numeroMasAltoEncontradoHastaElMomento = 0;
        int posicionNumeroMasAlto = 0;
        for (int i=0; i < numeros.size(); i++){
            if(numeros.get(i)>= numeroMasAltoEncontradoHastaElMomento){
              numeroMasAltoEncontradoHastaElMomento = numeros.get(i);
              posicionNumeroMasAlto = i;
            }
        }
        numerosOrdenados += numeroMasAltoEncontradoHastaElMomento + ", ";
        numeros.remove(posicionNumeroMasAlto);
    }
    
    return (numerosOrdenados.length()>0) ? (numerosOrdenados.substring(0, numerosOrdenados.length()-2)) : (numerosOrdenados);
  }
  
  
    public String devolverEnOrden(ArrayList<Integer> numeros)
    {
        Collections.sort(numeros, Collections.reverseOrder());
        String numerosOrdenados = "";
        int contador = 0;
        while (contador < numeros.size()) {
            if (numeros.size() - 1 != contador) {
                numerosOrdenados += numeros.get(contador) + ", ";
            }
            else {
                numerosOrdenados += numeros.get(contador);
            }
            contador++;
        }
        return numerosOrdenados;
    }  
  
  
  
  

}