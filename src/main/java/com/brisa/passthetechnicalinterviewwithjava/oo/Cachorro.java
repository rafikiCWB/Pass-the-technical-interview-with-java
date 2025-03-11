package com.brisa.passthetechnicalinterviewwithjava.oo;

// Classe Cachorro: herda de Animal (herança)
class Cachorro extends Animal implements Voador {
  // Atributo específico da classe Cachorro
  private String raca;

  // Construtor
  public Cachorro(String nome, int idade, String raca, TipoAlimentacao tipoAlimentacao) {
    super(nome, idade, tipoAlimentacao);
    this.raca = raca;
  }

  // Sobrescrita do método emitirSom (polimorfismo)
  @Override
  public void emitirSom() {
    System.out.println("Au au!");
  }

  // Método específico da classe Cachorro
  public void correr() {
    System.out.println(getNome() + " está correndo.");
  }

  // Getter e setter para o atributo raca
  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  @Override
  public void voar() {
    System.out.println("Cachorro não voa" + getNome() + "está tentando");
  }
}

