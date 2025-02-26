package br.com.devcoelho;

/** Computador */
public class Computador {
  public String marca;
  public String cor;
  public String modelo;
  public long numeroSerie;
  public double preco;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public long getNumeroSerie() {
    return numeroSerie;
  }

  public void setNumeroSerie(long numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void imprimir() {
    String msg =
        "Marca: "
            + this.getMarca()
            + " | Modelo: "
            + this.getModelo()
            + " | Cor: "
            + this.getCor()
            + " | Num. Serie: "
            + this.getNumeroSerie()
            + " | Preço: R$ "
            + this.getPreco();
    System.out.println(msg);
  }

  public void calcularValor() {
    if (this.getMarca().matches("HP")) {
      this.setPreco(this.getPreco() * 1.3);
    }

    if (this.getMarca().matches("IBM")) {
      this.setPreco(this.getPreco() * 1.5);
    }
  }

  public int alterarValor(double novoValor) {
    int retorno = 0;
    if (novoValor > 0) {
      this.setPreco(novoValor);
      retorno = 1;
    }

    return retorno;
  }
}
