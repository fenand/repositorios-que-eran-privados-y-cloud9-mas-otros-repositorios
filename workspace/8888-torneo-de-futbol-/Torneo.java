import java.util.ArrayList;

public class Torneo {
    
    private ArrayList<Equipo> equipos;
    
    
    public Torneo(){
        equipos = new ArrayList<>();
    }
    
    public void indicarResultados(String entrada) {
        
        String[] lineasEntrada = entrada.split("\n");
        for(int i = 0; i < lineasEntrada.length; i++) {
            String[] partesDeLaLinea = lineasEntrada[i].split(";");
            String resultado = partesDeLaLinea[2];
            
            //Creamos un array donde en la primera posicion va
            //el equipo local y en la segunda el visitante
            Equipo[] equiposPartido = new Equipo[2];
            for (int j = 0; j < equiposPartido.length; j++) {
                String nombreEquipoActual = partesDeLaLinea[j];
                equiposPartido[j] = devolverEquipo(nombreEquipoActual);
                if (equiposPartido[j] == null){ 
                    equiposPartido[j] = new Equipo(nombreEquipoActual);
                    equipos.add(equiposPartido[j]);
                }
            }
            
            switch (resultado) {
                case "gana": 
                    equiposPartido[0].ganarPartido();
                    equiposPartido[1].perderPartido();
                    break;
                case "empata": 
                    equiposPartido[0].empatarPartido();
                    equiposPartido[1].empatarPartido();
                    break;
                case "pierde": 
                    equiposPartido[0].perderPartido();
                    equiposPartido[1].ganarPartido();
                    break;
            } 
        }
    }
    
    
    public String mostrarClasificacion() {
        
        String aDevolver = "Equipo                         |  J |  G |  E |  P |  P\n";
        
        //Ordenamos alfabéticamente...
        for (int i = 0;i<equipos.size() - 1;i++){
            int posicionMaxima = i;
            String nombreEquipoMaximo = equipos.get(i).getNombre();
            for(int j =  i + 1; j < equipos.size(); j++ ){
                String nombreEquipoAComparar = equipos.get(j).getNombre();
                if (nombreEquipoMaximo.compareToIgnoreCase(nombreEquipoAComparar) < 0){
                    posicionMaxima = j;
                    nombreEquipoMaximo = nombreEquipoAComparar;
                }
            }
            
            Equipo auxiliar = equipos.get(i);
            equipos.set(i,equipos.get(posicionMaxima));
            equipos.set(posicionMaxima, auxiliar);
        } 
        
        //Ordenamos por puntos
        for (int i = 0;i<equipos.size() - 1;i++){
            int posicionMaxima = i;
            int puntosEquipoMaximo = equipos.get(i).getPuntos();
            for(int j =  i + 1; j < equipos.size(); j++ ){
                int puntosEquipoAComparar = equipos.get(j).getPuntos();
                if (puntosEquipoMaximo < puntosEquipoAComparar){
                    posicionMaxima = j;
                    puntosEquipoMaximo = puntosEquipoAComparar;
                }
            }
            
            Equipo auxiliar = equipos.get(i);
            equipos.set(i,equipos.get(posicionMaxima));
            equipos.set(posicionMaxima, auxiliar);
        }
        
        for(int k = 0; k< equipos.size() ; k++) {
            aDevolver += equipos.get(k) + "\n";
        }
        
        
        return aDevolver;
       
       
        
    }
    
    
    
    private Equipo devolverEquipo(String nombreEquipo)
    {
        Equipo aDevolver = null;
        int contador = 0;
        while(aDevolver == null){
            if (equipos.get(contador).getNombre().equals(nombreEquipo)){
                aDevolver = equipos.get(contador);
            }
            contador++;
        }
        
        return aDevolver;
    }
    
}