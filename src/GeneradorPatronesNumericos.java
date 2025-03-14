import java.util.Scanner;

public class GeneradorPatronesNumericos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();

        // Validar que el número sea positivo
        if (n <= 0) {
            System.out.println("Error: Debe ingresar un número entero positivo.");
            input.close();
            return;
        }

        // Generar el patrón triangular
        for (int i = n; i >= 1; i--) {
            // Imprimir espacios en blanco para alinear el patrón
            for (int espacio = 1; espacio < i; espacio++) {
                System.out.print("  ");
            }

            // Imprimir números desde i hasta n
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            // Imprimir números desde n-1 hasta i
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); // Salto de línea para la siguiente fila
        }

        input.close();
    }
}
