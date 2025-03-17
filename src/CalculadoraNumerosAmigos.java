import java.util.Scanner;

public class CalculadoraNumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = input.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Los números deben ser enteros positivos.");
            input.close();
            return;
        }

        System.out.print("Los divisores propios de " + numero1 + " son: ");
        int sumaDivisores1 = 0;
        boolean primerDivisor = true;

        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                if (!primerDivisor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                sumaDivisores1 += i;
                primerDivisor = false;
            }
        }

        System.out.println();
        System.out.println("La suma de los divisores propios de " + numero1 + " es: " + sumaDivisores1);

        System.out.print("Los divisores propios de " + numero2 + " son: ");
        int sumaDivisores2 = 0;
        primerDivisor = true;

        for (int i = 1; i < numero2; i++) {
            if (numero2 % i == 0) {
                if (!primerDivisor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                sumaDivisores2 += i;
                primerDivisor = false;
            }
        }

        System.out.println();
        System.out.println("La suma de los divisores propios de " + numero2 + " es: " + sumaDivisores2);

        if (sumaDivisores1 == numero2 && sumaDivisores2 == numero1) {
            System.out.println("¡" + numero1 + " y " + numero2 + " son números amigos!");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }

        input.close();
    }
}
