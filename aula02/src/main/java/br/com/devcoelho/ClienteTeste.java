package br.com.devcoelho;

public class ClienteTeste {
  public static void main(String[] args) {
    Cliente maromo = new Cliente();

    maromo.setCodigo(1);
    maromo.setNome("Marcos Roberto de Morais");
    maromo.setLimiteCredito(15000);
  }
}
