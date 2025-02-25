package br.com.devcoelho;

public class Acampamento {
  public String nome;
  public char equipe;
  public int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getEquipe() {
    return equipe;
  }

  public void setEquipe(char equipe) {
    this.equipe = equipe;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void imprimir() {
    String msg = new String();
    msg = "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEquipe: " + getEquipe();
    System.out.println(msg);
  }

  public void separarGrupo() {
    if (this.getIdade() < 6) {
      this.setEquipe('-');
    } else if (this.getIdade() < 11) {
      this.setEquipe('A');
    } else if (this.getIdade() < 21) {
      this.setEquipe('B');
    } else {
      this.setEquipe('C');
    }
  }
}
