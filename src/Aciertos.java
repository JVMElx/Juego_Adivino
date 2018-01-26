
import java.util.Scanner;

/**
 * Programa para adivinar un número generado aleatoriamente.
 * Tema7 proyecto corporativo.
 * @author JAVIER VICENTE
 * @version 1.0 22/01/2018
 */
public class Aciertos {

    /**
     * @param args Array de argumentos.
     */
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        System.out.print(x);
        Scanner sc = new Scanner(System.in);
        /**
         * mientras que n sea distinto de x se repite.
         */
        do {
        /**
       	 *Se le pide al usuario que introduzca un número entero.
       	 */
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            /**
             * Se realiza la comprobación del mismo.
             * si es mayor entraria en el primer if y si es menor saltaria al else if.
             * y aumentaria el contador a 1.
             */
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        /**
         * En caso de ser igual se imprime que has acertado con el número de intentos que has necesitado hasta llegar al resultado.
         * y se cierra la clase escanner
         */
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}