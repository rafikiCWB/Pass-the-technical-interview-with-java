package com.brisa.passthetechnicalinterviewwithjava.oo;

// Classe Animal: representa um animal genérico
class Animal {
  // Atributos (encapsulamento)
  private String nome;
  private int idade;
  private TipoAlimentacao tipoAlimentacao;

  // Construtor
  public Animal(String nome, int idade, TipoAlimentacao tipoAlimentacao) {
    this.nome = nome;
    this.idade = idade;
    this.tipoAlimentacao = tipoAlimentacao;
  }

  // Métodos (abstração)
  public void emitirSom() {
    System.out.println("Som genérico de animal");
  }

  public void dormir() {
    System.out.println(nome + " está dormindo.");
  }

  // Getters e setters (encapsulamento)
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", tipoAlimentacao=" + tipoAlimentacao +
        '}';
  }
}
