package br.com.devcoelho;

/** AcampamentoTeste */
public class AcampamentoTeste {
  public static void main(String[] args) {
    Acampamento membroMaromo = new Acampamento();

    membroMaromo.setNome("Marcos Roberto de Morais");
    membroMaromo.setIdade(43);
    membroMaromo.imprimir();
    membroMaromo.separarGrupo();
    membroMaromo.imprimir();
  }
}
