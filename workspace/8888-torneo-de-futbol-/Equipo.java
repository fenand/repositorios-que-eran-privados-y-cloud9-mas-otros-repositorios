public class Equipo {
    
    private String nombre;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int puntos;
    private static final int ESPACIOS_EN_BLANCO = 30;
    
    public Equipo(String nombre) {
       this.nombre = nombre;
       partidosEmpatados = 0;
       partidosGanados = 0;
       partidosJugados = 0;
       partidosPerdidos = 0;
       puntos = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPartidosJugados() {
        return partidosJugados;
    }
    
    public int getPartidosGanados() {
        return partidosGanados;
    }
    
    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }
    
    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }
    
    public int getPuntos() {
        return puntos;
    }
    
    public void ganarPartido() {
        partidosJugados++;
        partidosGanados++;
        puntos += 3;
    }
    
    /**
     * Simula que el equipo ha perdido un partido
     */
    public void perderPartido()
    {
        partidosJugados++;
        partidosPerdidos ++;
        puntos += 0;
    }

    /**
     * Simula que el equipo ha empatado un partido
     */
    public void empatarPartido()
    {
        partidosJugados ++;
        partidosEmpatados++;
        puntos += 1;
    }
    
    public String toString()
    {
        String aDevolver = nombre;
        for (int i= 0; i < (ESPACIOS_EN_BLANCO - nombre.length()); i++){
            aDevolver += " ";
        }
        
        aDevolver += " |  " + partidosJugados;
        aDevolver += " |  " + partidosGanados;
        aDevolver += " |  " + partidosEmpatados;
        aDevolver += " |  " + partidosPerdidos;
        aDevolver += " |  " + puntos;
        
        return aDevolver;    
    }
    
    
    
}