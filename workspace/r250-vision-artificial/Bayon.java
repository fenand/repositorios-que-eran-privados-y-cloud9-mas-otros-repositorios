class R250 {

    private static final char VERTICE = '+';
    private static final char VERTICAL = '|';
    private static final char HORIZONTAL = '-';

    public int detectarRectangulos(String[] entrada) {

        int numeroRectangulos = 0;
        System.out.println("EMPEZANDO UN NUEVO CASO");

        for (int numeroLineaVertice0 = 0; numeroLineaVertice0 < entrada.length; numeroLineaVertice0++) {
            String lineaActualVertice0 = entrada[numeroLineaVertice0];        
            System.out.println("Comprobando la linea " + numeroLineaVertice0 + " para el vertice 0");
            System.out.println(lineaActualVertice0);

            for (int numeroCaracterVertice0 = 0; numeroCaracterVertice0 < entrada[0].length(); numeroCaracterVertice0++) {
                char caracterActualVertice0 = lineaActualVertice0.charAt(numeroCaracterVertice0);
                System.out.println("Comprobando el caracter " + numeroCaracterVertice0 + " para el vertice 0");
                System.out.println(caracterActualVertice0);

                if (caracterActualVertice0 == VERTICE) {                
                    System.out.println("Encontrado posible vertice 0");

                    int numeroCaracterVertice1 = numeroCaracterVertice0 + 1;
                    boolean detectadaDiscontinuidad = false;
                    while (!detectadaDiscontinuidad &&  numeroCaracterVertice1 < lineaActualVertice0.length()) {
                        char caracterActualVertice1 = lineaActualVertice0.charAt(numeroCaracterVertice1);
                        System.out.println("Comprobando el caracter " + numeroCaracterVertice1 + " para el vertice 1");
                        System.out.println(caracterActualVertice1);                      

                        if (caracterActualVertice1 == VERTICE || caracterActualVertice1 == HORIZONTAL) {

                            if (caracterActualVertice1 == VERTICE) {
                                System.out.println("Encontrado posible vertice 1");

                                boolean detectadaDiscontinuidadVertical = false;
                                int numeroLineaVertice2 = numeroLineaVertice0 + 1;
                                while (!detectadaDiscontinuidadVertical && numeroLineaVertice2 < entrada.length) {
                                    String lineaActualVertice2 = entrada[numeroLineaVertice2];
                                    System.out.println("Comprobando la linea " + numeroLineaVertice2 + " para el vertice 2");
                                    System.out.println(lineaActualVertice2);    
                                    
                                    char caracterVertice2 = lineaActualVertice2.charAt(numeroCaracterVertice0);
                                    char caracterVertice3 = lineaActualVertice2.charAt(numeroCaracterVertice1);

                                    if (caracterVertice2 == VERTICE && caracterVertice3 == VERTICE) {
                                        System.out.println("Encontrados posibles vertices 2 y 3");    
                                        
                                        int numeroCaracterBase = numeroCaracterVertice0 + 1;
                                        boolean detectadaDiscontinuidadBase = false;
                                        while (!detectadaDiscontinuidadBase &&  numeroCaracterBase <= numeroCaracterVertice1) {
                                            char caracterActualBase = lineaActualVertice2.charAt(numeroCaracterBase);
                                            
                                            if (caracterActualBase != VERTICE || caracterActualBase != HORIZONTAL) {
                                                detectadaDiscontinuidadBase = true;
                                            }
                                            
                                            numeroCaracterBase++;                                                                                        
                                        }
                                        
                                        if (!detectadaDiscontinuidad) {
                                            numeroRectangulos++;                                            
                                            System.out.println("Detectado rectangulo! Ya tenemos " + numeroRectangulos);
                                        }

                                    
                                    }
                                    else if ((caracterVertice2 != VERTICE && caracterVertice2 != VERTICAL) || 
                                     (caracterVertice3 != VERTICE && caracterVertice3 != VERTICAL)) {
                                        detectadaDiscontinuidadVertical = true;
                                        System.out.println("Encontrada discontinuidad vertical!!");
                                    }
                                    
                                    numeroLineaVertice2++;                             
                                
                                }
                     
                            }

                        }
                        else {
                            detectadaDiscontinuidad = true;
                        }

                        numeroCaracterVertice1++;
                    }   
                }
            }
        }

    
        return numeroRectangulos;
    }
}
