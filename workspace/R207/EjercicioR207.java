import java.util.ArrayList;

class EjercicioR207
{
  public String devolverEnOrden(ArrayList<String> palabras)
  {
    String aDevolver = "";
    //Repetir tantas veces como elementos tenga "palabras" originalmente
    while(palabras.size() > 0) {
    
      //Repetir tantas veces como elementos tenga palabras
      //Busco la mayor, la añado a un variable y la borro de la colección
      String palabraMayorLongitud = "";
      for(String palabraActual : palabras) {
        if(palabraActual.length() >=  palabraMayorLongitud.length()){
          palabraMayorLongitud = palabraActual;
        }
      }
      aDevolver += palabraMayorLongitud    ;
      palabras.remove(palabraMayorLongitud);
      if (palabras.size() > 0) {
        aDevolver += ",";
      }
    }
    
    return aDevolver;

  }

}