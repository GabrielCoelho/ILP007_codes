package br.com.devcoelho;

import java.util.Scanner;

/** Exemplo 2 */
public class App {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int a, b;
    System.out.println("Digite o valor de a: ");
    a = Integer.parseInt(leitor.nextLine());
    // a = leitor.nextInt();
    System.out.println("Digite o valor de b: ");
    b = Integer.parseInt(leitor.nextLine());

    System.out.println("A + B = " + (a + b));
    System.out.println("A - B = " + (a - b));
    System.out.println("A * B = " + (a * b));
    System.out.println("A / B = " + (a / b));
  }
}
