import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingresa el texto que deseas invertir: ");
        String cadena = scanner.nextLine();
        System.out.println("El texto invertido es: " + invertirCadena(cadena));

    }
    private static String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}