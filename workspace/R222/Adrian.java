import java.util.Scanner;
import java.util.ArrayList;

class Main
{

    public static void main(String[] args) {
        calcularDimensiones();
    }

    public static void calcularDimensiones() {

        Scanner scIn = new Scanner(System.in);

        int alto = 0;
        int largo = 0;
        double  l = scIn.nextInt();
       
        while(l !=0){
            
            alto = (int)Math.sqrt(l);
            
            largo=alto;

            while(alto * largo != l){
                if (alto * largo > l){
                    alto = alto - 1;   

                }
                else if(alto * largo < l){
                    largo = largo + 1;  

                }
            }
            System.out.println( largo + " " +  alto );
            
            l=scIn.nextInt();

        }
        
        
    }
}