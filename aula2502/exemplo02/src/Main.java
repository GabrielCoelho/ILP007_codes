import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        x = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro valor: ");
        y = Integer.parseInt(leitor.nextLine());
        int soma = x + y;
        System.out.println("Resultado: " + soma);
    }
}