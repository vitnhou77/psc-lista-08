import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        char resultado = verificaNumero(num);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }

    static char verificaNumero(int n) {
        if (n > 0)
            return 'P';
        else
            return 'N';
    }
}
