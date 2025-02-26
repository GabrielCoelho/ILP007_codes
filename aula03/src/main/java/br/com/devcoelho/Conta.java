package br.com.devcoelho;

/** Conta */
public class Conta {
  public String conta;
  public String agencia;
  public double saldo;
  public String nomeCliente;

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public int sacar(double quantia) {
    if (this.getSaldo() >= quantia) {
      this.setSaldo(this.getSaldo() - quantia);
      return 1;
    }

    return 0;
  }

  public void depositar(double quantia) {
    this.setSaldo(this.getSaldo() + quantia);
  }

  public void imprimir() {
    String msg =
        "Conta: "
            + this.getConta()
            + " | Agência: "
            + this.getAgencia()
            + " | Nome Cliente: "
            + this.getNomeCliente()
            + " | Saldo: R$ "
            + this.getSaldo();
    System.out.println(msg);
  }
}
