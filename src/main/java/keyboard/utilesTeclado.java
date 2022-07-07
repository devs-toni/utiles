package keyboard;

import java.util.Scanner;

public class utilesTeclado {

    /**
     * Clase empleada para la introducción de datos por consola . . .
     */

    public static Scanner teclado = new Scanner(System.in);



    public static String introducirTexto(String mensaje) {
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    public static String introducirTextoObligatorio(String mensaje) {
        String texto = null;
        do {
            System.out.println(mensaje + ": ");
            texto = teclado.nextLine();

        } while (texto.equals(""));

        return texto;
    }

    public static void pulsaParaContinuar() {
        System.out.println("Pulsa ENTER para continuar . . .");
        teclado.nextLine();
    }

    public static int introducirNumeroObligatorio(String mensaje) {
        String texto = null;
        do {
            do {
                texto = introducirTexto(mensaje);
            } while (!(esUnNumero(texto)));
        } while (texto.equals(""));

        return Integer.parseInt(texto);
    }

    /**
     * Método de COMPROBACIÓN para verificar que el valor introducido sea un número
     * @param texto Se le pasará el valor introducido
     * @return Devolverá un booleano con la comprobación
     */

    public static boolean esUnNumero(String texto) {
        if (texto.matches("[0-9]*") || texto.isEmpty()) return true;
        else return false;
    }

}
