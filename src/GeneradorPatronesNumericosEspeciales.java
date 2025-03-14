import java.util.Scanner;

public class GeneradorPatronesNumericosEspeciales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
            input.close();
            return;
        }

        // Generar el patrón para cada número desde 1 hasta n
        for (int k = 1; k <= n; k++) {
            // Para cada línea k, imprimir k veces el número k alternando el signo
            for (int j = 1; j <= k; j++) {
                // Si j es impar, imprimir k positivo, si es par, imprimir k negativo
                if (j % 2 == 1) {
                    System.out.print(k);
                } else {
                    System.out.print("-" + k);
                }

                // Añadir espacio después de cada número excepto el último de la línea
                if (j < k) {
                    System.out.print(" ");
                }
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        input.close();
    }
}
