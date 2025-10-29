import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o custo do item: ");
        double custo = sc.nextDouble();

        double novoCusto = somaImposto(taxa, custo);
        System.out.println("Custo com imposto: R$ " + novoCusto);

        sc.close();
    }

    static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * (taxaImposto / 100));
    }
}
