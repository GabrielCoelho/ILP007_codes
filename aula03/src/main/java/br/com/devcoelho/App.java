package br.com.devcoelho;

import java.util.Scanner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int op = 0;
    while (op != 9) {
      System.out.println("Escolha um exercício: ");
      System.out.println("1. Acampamento\n2. Computador\n3. Conta\n9. Sair");
      op = entry.nextInt();
      switch (op) {
        case 1:
          exercicio01();
          break;
        case 2:
          exercicio02();
          break;
        case 3:
          exercicio03();
          break;
        case 9:
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

  /**
   * Exercício 02 Descrição: Desenvolver uma classe Computador e implementar o método de impressão
   * dos dados, um método para calcular um acrescimo em caso de duas marcas, e um método para
   * alterar o valor diretamente (em caso do valor passado ser maior que zero).
   */
  public static void exercicio02() {
    ComputadorTeste.main(null);
  }

  /**
   * Exercício 03 Descrição: Desenvolver uma Classe e implementar seus atributos e métodos Noutra
   * Classe, onde teremos o método main, e um objeto da primeira Classe "Conta"; Nela teremos o menu
   * para integrar e trabalhar com os métodos da primeira classe.
   */
  public static void exercicio03() {
    ContaTeste.main(null);
  }
}
