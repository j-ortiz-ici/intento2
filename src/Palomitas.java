import java.util.Scanner;

public class Palomitas {
    public static void main(String[] args) {
        String respuesta = getInput("Ingrese una palabra: ");
        char[] array = convertirInput(respuesta);
        printVerificacion(verificarPalabra(array));
    }

    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public static char[] convertirInput(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        return palabra.toCharArray();
    }

    public static boolean verificarPalabra(char[] arr) {
        int der = arr.length - 1;
        int izq = 0;
        while (izq < der) {
            if (arr[izq] == arr[der]) {
                der--;
                izq++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void printVerificacion(boolean v) {
        if (v) {
            System.out.println("La palabra es palindromo");
        } else
            System.out.println("La palabra no es palindromo");
    }

}