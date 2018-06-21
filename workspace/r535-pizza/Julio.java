<import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        calcularNumeroDePizzas();
    }

    public static void calcularNumeroDePizzas() 
    {     
        Scanner scIn = new Scanner(System.in);
        String entradaPorTeclado = "";
        String pedidoFiesta = "";

        double porciones = 0;
        ArrayList<Integer> pizzasPedido = new ArrayList<>();

        while(!entradaPorTeclado.equals("#")){
            entradaPorTeclado = scIn.nextLine();
            pedidoFiesta += entradaPorTeclado + "\n";
        }

        String[] pedidoFiestaMatriz = pedidoFiesta.split("\n");

        int i = 2;
        for(int pedidosCont; pedidosCont < Integer.parseInt(pedidoFiestaMatriz[0]); pedidosCont++){
            String[] comanda = pedidoFiestaMatriz[i].split(" ");
            for(int j = 0; j < comanda.length; j++){
                porciones += Integer.parseInt(comanda[j]);
            }
            pizzasPedido.add((int) Math.ceil(porciones / 8));
            i += 2;
            porciones = 0;
        }

        for(int k = 0; k < pizzasPedido.size(); k++){
            System.out.println("Caso #" + (k + 1) + ": " + pizzasPedido.get(k));
        }
    }
}