import java.util.ArrayList;

public class EjercicioR868
{
    public ArrayList<Alumno> obtenerAlumnosOrdenadorPorNotaMedia(ArrayList<Alumno> alumnosGrupo1, ArrayList<Alumno> alumnosGrupo2) 
    {     
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        ArrayList<Alumno> listaOrdenadaDeAlumnos = new ArrayList<>();
        for(Alumno alumno : alumnosGrupo1){
            if(alumno.haAprobadoTodo()){
                listaAlumnos.add(alumno);
            }
        }
        
        for(Alumno alumno : alumnosGrupo2){
            if(alumno.haAprobadoTodo()){
                listaAlumnos.add(alumno);
            }
        }
        
        while (listaAlumnos.size() != 0) {
            Alumno alumnoConMayorNotaMedia = null;
            double notaMediaMasAltaEncontradaHastaElMomento = 0;       
            for (Alumno alumnoActual : listaAlumnos){
                double notaMediaAlumnoActual = alumnoActual.notaMedia();
                if(notaMediaAlumnoActual >= notaMediaMasAltaEncontradaHastaElMomento){
                    alumnoConMayorNotaMedia = alumnoActual;
                    notaMediaMasAltaEncontradaHastaElMomento = notaMediaAlumnoActual;
                }
            }
            listaOrdenadaDeAlumnos.add(alumnoConMayorNotaMedia);
            listaAlumnos.remove(alumnoConMayorNotaMedia);
        }
    
        return listaOrdenadaDeAlumnos;
    }
}





class Alumno
{
    private String nombreCompleto;
    private int notaLengua;
    private int notaMatematicas;
    private int notaIngles;
  
    public Alumno(String nombreCompleto, int notaLengua, int notaMatematicas, int notaIngles) 
    {
        this.nombreCompleto = nombreCompleto;
        this.notaLengua = notaLengua;
        this.notaMatematicas = notaMatematicas;
        this.notaIngles = notaIngles;
    }
    
    
    public boolean haAprobadoTodo()
    {
        return (notaLengua >= 5 && notaMatematicas >= 5 && notaIngles >= 5);
    }
    
    
    public double notaMedia() 
    {
        return (notaIngles + notaLengua + notaMatematicas)/3;
    }
    
    
    
}