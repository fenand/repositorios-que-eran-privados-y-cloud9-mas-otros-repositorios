import java.util.ArrayList;

class EjercicioR399
{
  public String encontrarPalabraConMasAesCristian(ArrayList<String> palabras) 
  {
    String palabraConMasAes = null;
    int cont = 0;
    int numMaxAes = 1;
    while (cont < palabras.size()) {
      int numAes = 0;
      for(int i=0; i < palabras.get(cont).length(); i++) {
        if ((palabras.get(cont).charAt(i) == 'a')){
          numAes++;
        }
      }
      if(numAes >= numMaxAes){
        numMaxAes = numAes;
        palabraConMasAes = palabras.get(cont);
      }
      cont++;
    }
    return palabraConMasAes;
  }     
    
    public String encontrarPalabraConMasAesGianCarlo(ArrayList<String> palabras) 
    {
        String aDevolver= null;
        int maximoCoincidencias = 1;
        for(String palabra : palabras){
            int coincidencias = 0;
            for(int i = 0; i < palabra.length();i++){
                if(palabra.charAt(i) =='a'){
                    coincidencias ++;
                }
            }
            if (coincidencias >= maximoCoincidencias){
                aDevolver = palabra;
                maximoCoincidencias = coincidencias; 
            }
        }

        return aDevolver;
    }
    
    
   

}