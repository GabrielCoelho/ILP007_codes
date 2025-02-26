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

    // mypc.imprimir();
    mypc.calcularValor();
    mypc.imprimir();

    Computador yourpc = new Computador();

    yourpc.setMarca("IBM");
    yourpc.setModelo("Rayzen 6");
    yourpc.setCor("Preto");
    yourpc.setNumeroSerie(41263);
    yourpc.setPreco(10000);

    yourpc.calcularValor();
    yourpc.imprimir();

    if (yourpc.alterarValor(100) == 1) {
      System.out.println("Valor Alterado");
    } else {
      System.out.println("Valor NÃO Alterado");
    }
    yourpc.imprimir();
  }
}
