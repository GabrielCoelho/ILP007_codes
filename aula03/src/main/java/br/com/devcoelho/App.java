package br.com.devcoelho;

import java.util.Scanner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int op = 0;
    while (op == 0) {
      System.out.println("Escolha um exercício: ");
      System.out.println("1. Acampamento");
      op = entry.nextInt();
      switch (op) {
        case 1:
          exercicio01();
          op = 0;
          break;

        default:
          System.out.println("Exercicio não existente!");
          op = 0;
          break;
      }
    }
  }

  /**
   * Exercício 01 Descricao: Desenvolver uma classe Acampamento e implementar o método de impressão
   * dos dados e separação das equipes de acordo com a idade do membro do acampamento: 6-10 anos:
   * Equipe 'A'; 11-20 anos: Equipe 'B'; acima de 21 anos: Equipe 'C';
   */
  public static void exercicio01() {
    AcampamentoTeste.main();
  }
}
