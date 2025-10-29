import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int soma = somar(a, b, c);
        System.out.println("A soma é: " + soma);

        sc.close();
    }

    static int somar(int x, int y, int z) {
        return x + y + z;
    }
}
