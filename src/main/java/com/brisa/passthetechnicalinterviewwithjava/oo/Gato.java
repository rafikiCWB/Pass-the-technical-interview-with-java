package com.brisa.passthetechnicalinterviewwithjava.oo;

// Classe Gato: herda de Animal (herança)
class Gato extends Animal {
  // Atributo específico da classe Gato
  private boolean temPelagemLonga;

  // Construtor
  public Gato(String nome, int idade, boolean temPelagemLonga, TipoAlimentacao tipoAlimentacao) {
    super(nome, idade, tipoAlimentacao);
    this.temPelagemLonga = temPelagemLonga;
  }

  // Sobrescrita do método emitirSom (polimorfismo)
  @Override
  public void emitirSom() {
    System.out.println("Miau!");
  }

  // Método específico da classe Gato
  public void arranhar() {
    System.out.println(getNome() + " está arranhando.");
  }

  // Getter e setter para o atributo temPelagemLonga
  public boolean isTemPelagemLonga() {
    return temPelagemLonga;
  }

  public void setTemPelagemLonga(boolean temPelagemLonga) {
    this.temPelagemLonga = temPelagemLonga;
  }
}
