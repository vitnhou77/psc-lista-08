import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = sc.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minuto = sc.nextInt();

            char periodo = converterHora(hora);
            int hora12 = (hora == 0 || hora == 12) ? 12 : hora % 12;

            exibirHora(hora12, minuto, periodo);

            System.out.print("Deseja converter outra hora? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        sc.close();
    }

    static char converterHora(int hora24) {
        if (hora24 < 12)
            return 'A'; // AM
        else
            return 'P'; // PM
    }

    static void exibirHora(int hora, int minuto, char periodo) {
        String periodoStr = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %02d:%02d %s%n", hora, minuto, periodoStr);
    }
}
