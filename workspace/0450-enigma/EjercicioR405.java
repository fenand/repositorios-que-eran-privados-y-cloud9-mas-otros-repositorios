import java.util.ArrayList;

class EjercicioR405
{
  public String encontrarPalabraRepetidaCristian(ArrayList<String> palabras) 
  {
    String palabraABuscar = null;
    boolean buscando = true;
    int cont = 0;
    int cont2 = 0;
    int vecesRepetida = 0;
    while (buscando && palabras.size() > 0 && cont < palabras.size()){
      palabraABuscar = palabras.get(cont);
      while (buscando && cont2 < palabras.size()){
        if (palabraABuscar == palabras.get(cont2)){
          palabraABuscar = palabras.get(cont2);
          vecesRepetida++;
          if (vecesRepetida > 1){
            buscando = false;
          }
        }
        cont2++;
      }
      cont++;
      cont2 = 0;
      if (vecesRepetida < 2){
        vecesRepetida = 0;
      }
    }
    if (vecesRepetida < 2){
      palabraABuscar = null;
    }
    return palabraABuscar;
  }


  public String encontrarPalabraRepetidaJorge(ArrayList<String> palabras) 
  {
    String palabraRepetida = "";
    int contador1 = 0;
    int contador2 = contador1 + 1;
    boolean seEncontroLaPalabra = false;
    while (contador1 < palabras.size() && !seEncontroLaPalabra) {
        palabraRepetida = palabras.get(contador1);
        palabraRepetida.toLowerCase();
        while (contador2 < palabras.size() && !seEncontroLaPalabra) {
            String palabraActual = palabras.get(contador2);
            palabraActual.toLowerCase();
            if (palabraActual.equals(palabraRepetida)) {            
                palabraRepetida = palabraActual;
                seEncontroLaPalabra = true;
            }            
            contador2++;
        }
        contador1++;
        contador2 = contador1 + 1;         
    }
    if (!seEncontroLaPalabra) {
        palabraRepetida = null;
    }
    return palabraRepetida;    
  }
  
  
}