import java.util.Scanner;
/**
 * 
 *
 * @author (Carlos Alvarez)
 * @version (23/04/2018)
 */
class Main
{
    /**
     * Método que permite calcular el numero de pizzas totales sumando porciones
     */
    public static void main(String[]args)
    {
        calcularNumeroDePizzas();
    }

    
    public static void calcularNumeroDePizzas()
    {
        // Codigo de escaneo.
        Scanner in = new Scanner(System.in);
        // Numero de casos que contiene el reso del String
        String numCasos = in.nextLine();
        if (Integer.parseInt(numCasos) >= 1 && Integer.parseInt(numCasos) <= 100) {
            int[] numPizzaTotales = new int[Integer.parseInt(numCasos)];
            for (int contador = 0 ; contador <  Integer.parseInt(numCasos) ; contador++){
                //Numero de asistentes
                String numAsistentes = in.nextLine();                
                if (Integer.parseInt(numAsistentes) <= 10000 && Integer.parseInt(numAsistentes) >=1){
                  
                    String[] textoPorciones = in.nextLine().split(" ");
                    int sumPorciones = 0;
                    for ( int contador1 = 0; contador1 <  textoPorciones.length ; contador1 ++){ 
                        int numPorcionesPorPersona = Integer.parseInt(textoPorciones[contador1]);
                        if (Integer.parseInt(textoPorciones[contador1]) >= 1 && Integer.parseInt(textoPorciones[contador1]) <=100){
                            sumPorciones = numPorcionesPorPersona + sumPorciones;
                        } 
                    }

                    if (sumPorciones % 8 != 0){
                        numPizzaTotales[contador] = (sumPorciones / 8) +1;
                    } else {
                        numPizzaTotales[contador] = (sumPorciones / 8);
                    }
                }
            }
            
            // Cuando llega a este punto la app finaliza introduciendo # en la misma y muestra por pantalla todo lo calculado anteriormente.
            String finalizarPrograma = in.nextLine();
            if (finalizarPrograma.equals("#")){
                for (int contador2 = 0; contador2 < numPizzaTotales.length; contador2 ++){                            
                    System.out.println("Caso #" + (contador2 + 1) + ": " + numPizzaTotales[contador2]);
                }
            }
        }
    }
}