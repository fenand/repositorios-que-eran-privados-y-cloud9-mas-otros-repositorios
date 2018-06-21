import java.util.ArrayList;

class R250 {
    /**
     * Metodo para detectar y contar la cantidad de rectangulos existentes en un diagrama ASCII pasado
     * por parametro en forma de una matriz de String.
     */
    public int detectarRectangulos(String[] entrada) {
        int contadorRectangulos = 0;
        // Evaluamos cada entrada
        for (int i = 0; i < entrada.length; i++){
            ArrayList<Integer> posicionEsquinas = new ArrayList<>();
            // Bucle for par almacenar las posiciones de esquinas "+" en la entrada actual de la matriz
            for (int j = 0; j < entrada[0].length(); j++){
                if (entrada[i].charAt(j) == '+'){
                    posicionEsquinas.add(j);
                }
            }
            // En caso de haber guardado 2 o mas vertices
            if (posicionEsquinas.size() >= 2){
                // Bucle m (vertice superior izquierdo) y n (superior derecho) para las combinacines de vertices de la entrada actual
                for (int m = 0; m < posicionEsquinas.size(); m++){
                    int primeraEsquina = posicionEsquinas.get(m);
                    for (int n = m+1; n < posicionEsquinas.size(); n++){
                        int segundaEsquina = posicionEsquinas.get(n);
                        // Si la union de las esquinas actuales de la horizontal es valida
                        if (unionHorizontal(entrada[i], primeraEsquina, segundaEsquina)){
                            // Se buscan vertices en las entradas inferiores dadas las posiciones de los vertices de la entrada actua
                            for (int l = i + 1; l <= entrada.length - 1; l++){
                                if (buscarVerticesHaciaAbajo(primeraEsquina, segundaEsquina, entrada[l])){
                                    // En caso de encontrar una coicidencia comprueba la union horizontal de estos
                                    if (unionHorizontal(entrada[l], primeraEsquina, segundaEsquina)){
                                        // En caso de ser valida comprueba las dos uniones verticales
                                        if (unionVertical(primeraEsquina, segundaEsquina, i, l, entrada)){
                                            // En caso de ser validas se ha encontrado un rectangulo
                                            contadorRectangulos++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return contadorRectangulos;
    }

    /**
     * Metodo para validar uniones entre vertices en horizontal. Comprueba si el substring entre dos vertices
     * del rectangulo esta formado por caracteres validos.
     * 
     * @param   linea   La linea que contiene los vertices.
     * @param   primeraEsquina  Referencia de la coordenada X de la matriz
     * @param   segundaEsquina  Referencia de la coordenada Y de la matriz
     * @return  True si la union entre los vertices es valida
     */
    private boolean unionHorizontal(String linea, int primeraEsquina, int segundaEsquina){
        boolean unionHorizontalValida = true;
        for (int i = primeraEsquina + 1; i < segundaEsquina && unionHorizontalValida; i++){
            if (!linea.substring(primeraEsquina + 1, primeraEsquina + 2 ).matches("[+-]")){
                unionHorizontalValida = false;
            }
        }

        return unionHorizontalValida;
    }

    /**
     * Metodo para validar uniones entre vertices en el eje Y. Comprueba si el substring entre dos vertices
     * del rectangulo esta formado por caracteres validos.
     * 
     * @param   primeraPosicionHorizontal   Referencia de la coordenada del vertice izquierdo superior
     * @param   segundaPosicionVertical     Referencia de la coordenada del vertice derecho superior
     * @param   primeraLinea                Referencia de la coordenada Y de los vertices superiores
     * @param   segundaLinea                Referencia de la coordenada Y de los vertices inferiores
     * @return  True si la union entre los vertices es valida
     */
    private boolean unionVertical(int primeraPosicionHorizontal, int segundaPosicionHorizontal,int primeraLinea, int segundaLinea, String[] entrada){
        boolean unionVerticalValida = true;

        for (int i = primeraLinea + 1; i < segundaLinea && unionVerticalValida; i++){
            if (!entrada[i].substring(primeraPosicionHorizontal, primeraPosicionHorizontal + 1).matches("[+|]") || !entrada[i].substring(segundaPosicionHorizontal, segundaPosicionHorizontal + 1).matches("[+|]")){
                unionVerticalValida = false;
            }
        }

        return unionVerticalValida;
    }

    /**
     * Metodo para comprobar si existen dos vertices en las mismas posiciones que los evaluados actualmente
     * del eje X en las entradas inferiores a la actual.
     * 
     * @param   primeraEsquina      Referencia de la coordenada del vertice izquierdo superior
     * @param   segundaEsquina      Referencia de la coordenada del vertice derecho superior
     * @param   entrada             La linea horizontal de la matriz donde buscar las parejas de los vertices
     * @return  True en caso de encontrar la pareja de vertices
     */
    private boolean buscarVerticesHaciaAbajo(int primeraEsquina, int segundaEsquina, String entrada){
        boolean esquinasEncontradas = true;

        if (entrada.charAt(primeraEsquina) != '+' || entrada.charAt(segundaEsquina) != '+'){
            esquinasEncontradas = false;
        }

        return esquinasEncontradas;
    }
}