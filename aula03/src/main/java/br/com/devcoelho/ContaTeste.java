package br.com.devcoelho;

import java.util.Scanner;

/** ContaTeste */
public class ContaTeste {
  public Conta account = new Conta();
  public Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ContaTeste este = new ContaTeste();
    int op = 0;
    while (op != 9) {
      System.out.println("Banco do Batata - Java Version");
      System.out.println("Menu: \n1. Cadastrar\t2. Depositar\n3. Sacar \t4. Consultar\n9. Sair");
      op = este.sc.nextInt();
      switch (op) {
        case 1:
          este.execCadastrar();
          break;
        case 2:
          este.execDepositar();
          break;
        case 3:
          este.execSacar();
          break;
        case 4:
          este.execConsultar();
          break;
        case 9:
          break;

        default:
          System.out.println("Opção Inválida");
          break;
      }
    }
  }

  public void execCadastrar() {
    sc.nextLine();
    System.out.println("Cadastrando nova conta!");
    System.out.println("Digite o Número da Conta: ");
    account.setConta(sc.nextLine());
    System.out.println("Digite o número da Agência: ");
    account.setAgencia(sc.nextLine());
    System.out.println("Digite seu nome: ");
    account.setNomeCliente(sc.nextLine());
  }

  public void execDepositar() {
    System.out.println("Digite um valor para Depósito: ");
    System.out.print("R$ ");
    account.depositar(sc.nextDouble());
  }

  public void execConsultar() {
    account.imprimir();
  }

  public void execSacar() {
    System.out.println("Informe um valor para Saque: ");
    System.out.print("R$ ");
    if (account.sacar(sc.nextDouble()) == 1) {
      System.out.println("Saque efetuado com sucesso");
    } else {
      System.out.println("Saque não foi realizado, verifique o saldo ou quantia solicitada.");
    }
  }
}
