import java.util.Scanner;

public class CalculadoraNumerosPerfectos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Verificar si un número específico es perfecto
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int num = input.nextInt();

        // Verificación de número perfecto
        boolean esPerfecto = false;
        if (num > 1) {
            int sumaDivisores = 1; // Empezamos con 1 que siempre es divisor

            // Buscamos divisores desde 2 hasta la raíz cuadrada del número
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    // Agregamos el divisor
                    sumaDivisores += i;

                    // Si i no es la raíz cuadrada, agregamos el divisor complementario
                    if (i != num / i) {
                        sumaDivisores += num / i;
                    }
                }
            }

            // Un número es perfecto si es igual a la suma de sus divisores propios
            esPerfecto = (sumaDivisores == num);
        }

        if (esPerfecto) {
            System.out.println(num + " es un número perfecto.");
            System.out.println("Divisores propios: ");

            // Mostrar divisores propios
            System.out.print("1"); // 1 siempre es divisor propio
            int suma = 1;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(" + " + i);
                    suma += i;
                }
            }

            System.out.println(" = " + suma);
        } else {
            System.out.println(num + " no es un número perfecto.");
        }

        // Encontrar números perfectos en un rango
        System.out.print("\nIngrese el inicio del rango: ");
        int inicio = input.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = input.nextInt();

        // Validar el rango
        if (inicio > fin) {
            System.out.println("Error: El inicio del rango debe ser menor o igual al fin.");
            input.close();
            return;
        }

        // Buscar y mostrar números perfectos en el rango
        System.out.println("Números perfectos encontrados en el rango [" + inicio + ", " + fin + "]: ");
        boolean encontrado = false;

        for (int i = inicio; i <= fin; i++) {
            // Verificar si i es un número perfecto
            boolean iPerfecto = false;
            if (i > 1) {
                int sumaDivisoresI = 1; // Empezamos con 1 que siempre es divisor

                // Buscamos divisores desde 2 hasta la raíz cuadrada del número
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        // Agregamos el divisor
                        sumaDivisoresI += j;

                        // Si j no es la raíz cuadrada, agregamos el divisor complementario
                        if (j != i / j) {
                            sumaDivisoresI += i / j;
                        }
                    }
                }

                // Un número es perfecto si es igual a la suma de sus divisores propios
                iPerfecto = (sumaDivisoresI == i);
            }

            if (iPerfecto) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron números perfectos en el rango especificado.");
        } else {
            System.out.println(); // Salto de línea después de mostrar los números
        }

        input.close();
    }
}
