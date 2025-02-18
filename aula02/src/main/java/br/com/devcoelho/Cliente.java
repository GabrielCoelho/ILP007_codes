package br.com.devcoelho;

public class Cliente {
  // Atributos
  public int codigo;
  public String nome;
  public double limiteCredito;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getLimiteCredito() {
    return limiteCredito;
  }

  public void setLimiteCredito(double limiteCredito) {
    this.limiteCredito = limiteCredito;
  }

  public String imprimirDados() {
    String msg =
        "Codigo: " + this.codigo + "\nNome: " + this.nome + "\nLimite: R$ " + this.limiteCredito;
    return msg;
  }
}
