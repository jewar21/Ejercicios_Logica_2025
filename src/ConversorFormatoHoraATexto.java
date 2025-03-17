import java.util.Scanner;

public class ConversorFormatoHoraATexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la hora en formato HH:MM (24 horas): ");
        String entrada = input.nextLine();
        input.close();

        if (entrada.length() != 5 || entrada.charAt(2) != ':') {
            System.out.println("Formato inválido. Use HH:MM");
            return;
        }

        char h1 = entrada.charAt(0);
        char h2 = entrada.charAt(1);
        char m1 = entrada.charAt(3);
        char m2 = entrada.charAt(4);

        if (!Character.isDigit(h1) || !Character.isDigit(h2) || !Character.isDigit(m1) || !Character.isDigit(m2)) {
            System.out.println("Entrada inválida. Use solo números.");
            return;
        }

        int horas = (h1 - '0') * 10 + (h2 - '0');
        int minutos = (m1 - '0') * 10 + (m2 - '0');

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora fuera de rango.");
            return;
        }

        int hora12 = (horas % 12 == 0) ? 12 : horas % 12;
        String periodo = (horas < 12) ? "de la mañana" :
                         (horas < 19) ? "de la tarde" : "de la noche";

        String textoHora = (hora12 == 1) ? "la una" : "las " + hora12;
        String resultado = "";

        if (minutos == 0) {
            resultado = "Es " + textoHora + " en punto " + periodo;
        } else if (minutos == 15) {
            resultado = "Son " + textoHora + " y cuarto " + periodo;
        } else if (minutos == 30) {
            resultado = "Son " + textoHora + " y media " + periodo;
        } else if (minutos == 45) {
            int siguienteHora = (hora12 == 12) ? 1 : hora12 + 1;
            String textoSiguienteHora = (siguienteHora == 1) ? "la una" : "las " + siguienteHora;
            resultado = "Son " + textoSiguienteHora + " menos cuarto " + periodo;
        } else if (minutos < 30) {
            resultado = "Son " + textoHora + " y " + minutos + " " + periodo;
        } else {
            int minutosFaltantes = 60 - minutos;
            int siguienteHora = (hora12 == 12) ? 1 : hora12 + 1;
            String textoSiguienteHora = (siguienteHora == 1) ? "la una" : "las " + siguienteHora;
            resultado = "Son " + textoSiguienteHora + " menos " + minutosFaltantes + " " + periodo;
        }

        System.out.println(resultado);
    }
}
