package br.com.devcoelho;

/** ComputadorTeste */
public class ComputadorTeste {

  public static void main(String[] args) {
    Computador mypc = new Computador();

    mypc.setMarca("HP");
    mypc.setModelo("Celeron 4");
    mypc.setCor("Vermelho");
    mypc.setNumeroSerie(129838);
    mypc.setPreco(1000);

    //mypc.imprimir();
    mypc.calcularValor();
    mypc.imprimir();
  }
}
