import java.util.Scanner;

public class ValidadorNumerosPrimosGemelos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Igrese el primer numero ");
        int Inicio = input.nextInt();
        System.out.println("ingrese el segundo numero ");
        int fin = input.nextInt();
        System.out.println("el primer numero es " + Inicio + " el segundo numero es " + fin);
        if (Inicio < 0 || fin < Inicio) {
            System.out.println("Rango no valido ");
            input.close();
            return;
        }
        ;
        int contPrimos = 0;
        for (int i = Inicio; i <= fin; i++) {
            if (i <= 1) {
                continue;
            }
            if (i == 2) {
                contPrimos += 1;
            }
            if (i % 2 == 1) {
                contPrimos += 1;
            }
        }
        System.out.println("Hay " + (int) (Math.floor(contPrimos / 2)) + " pares de primos en total");
        input.close();
    }
}