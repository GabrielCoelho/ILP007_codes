package br.com.devcoelho;

public class ClienteTeste {
  public static void main(String[] args) {
    Cliente maromo = new Cliente();
    Cliente thaito = new Cliente();

    maromo.setCodigo(1);
    maromo.setNome("Marcos Roberto de Morais");
    maromo.setLimiteCredito(15000);

    thaito.setCodigo(2);
    thaito.setNome("Thaito Gabriel Batalini");
    thaito.setLimiteCredito(10000);

    System.out.println(maromo.imprimirDados());
    System.out.println(thaito.imprimirDados());
  }
}
