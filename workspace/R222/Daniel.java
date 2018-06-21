import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculadora de dimensiones de puzzle.
 * 
 * Pertenece al ejercicio R222 - repl.it.
 * 
 * Esta aplicacion pide el numero de piezas de un puzzle. A partir de este 
 * numero de piezas, calcula el ancho y el largo (con menor diferencia entre 
 * ellos).
 * 
 * Se desprecia cualquier entrada de datos que no sea un numero natural 
 * (incluyendo el 0) menor o igual a 1 000 000 000. 
 * 
 * Al introducir un 0, la entrada de datos finaliza.
 * 
 * @author D4s1ns
 * @versions 2018/04/25
 */
class Main {
    // Numero maximo de piezas para el puzzle. (inclusive)
    private static final int MAX_PIECES = 1000000000;
    // Numero minimo de piezas para el puzzle. (no inclusive).
    private static final int MIN_PIECES = 0;
    // Caracter que finaliza la entrada de datos.
    private static final String END = "0";
    
    /**
     * Metodo principal - Inicia la app. 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cases = new ArrayList<>();
        boolean end = false;
        // Se piden datos al usuario hasta que introduce el caracter de cierre.
        do {
            String input = sc.next();
            // Se obvian las entradas invalidas o fuera de los limites.
            if (isValid(input, MIN_PIECES, MAX_PIECES)) {
                cases.add(Integer.parseInt(input));
            }
            // Se comprueba si se ha introducido el caracter de cierre.
            end = input.equals(END);
        }
        while (! end);
        sc.close();
        for (int pieces : cases) {
            System.out.println(calcWidthAndHeight(pieces));
        }
    }
    //Revisar.
    /**
     * Dado el numero de piezas de un puzzle, calcula el ancho y el alto que 
     * menos diferencia tengan entre ellos, teniendo en cuenta que, el ancho,
     * debe ser mayor o igual al alto y nunca menor.
     * @param numOfPieces Numero de piezas del puzle.
     * @return Devuelve una cadena de texto con el ancho y el alto con menor
     *         diferencia entre ellos separados por espacios.
     */
    public static String calcWidthAndHeight(int numOfPieces) {
        int height = (int)Math.floor(Math.sqrt(numOfPieces));
        int width = numOfPieces / height;
        // Comprueba que no se pueda formar un cuadrado para este numero de piezas.
        // Si no se puede formar, encuentra el rectangulo con menos diferencia entre
        // sus lados.
        while (! (height * width == numOfPieces)) {
            height--;
            width = (int)(numOfPieces / height);
        }
        return width + " " + height;
    }
    
    /**
     * Comprueba que, la cadena de texto introducida como parametro, se puede 
     * convertir en un entero y, su valor como entero, se encuentra entre los 
     * limites (lowerLimit y upperLimit).
     * @param input La cadena de texto a comprobar.
     * @param lowerLimit El limite inferior (no inclusive).
     * @param upperLimit El limite superior (inclusive).
     * @return VERDADERO - Si la cadena de texto es un entero entre los limites
     *         (ambos incluidos).
     *         FALSO - Si no lo es.
     */
    public static boolean isValid(String input, int lowerLimit, int upperLimit) {
        boolean refund = false;
        Integer aux;
        try {
            aux = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            aux = null;
        }
        if (aux != null && (aux > lowerLimit && aux <= upperLimit)) {
            refund = true;
        }
        return refund;
    }
}