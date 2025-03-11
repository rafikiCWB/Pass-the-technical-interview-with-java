package com.brisa.passthetechnicalinterviewwithjava.oo;

// Classe principal
public class Aplicacao {
  public static void main(String[] args) {
    // Criando objetos de diferentes classes (instanciação)
    Animal animalGenerico = new Animal("Animal Genérico", 5, TipoAlimentacao.ONIVORO);
    Cachorro cachorro = new Cachorro("Rex", 3, "Pastor Alemão", TipoAlimentacao.CARNIVORO);
    Gato gato = new Gato("Mimi", 2, true, TipoAlimentacao.HERBIVORO);

    // Chamando métodos dos objetos (polimorfismo)
    animalGenerico.emitirSom(); // Saída: Som genérico de animal
    cachorro.emitirSom(); // Saída: Au au!
    gato.emitirSom(); // Saída: Miau!

    // Acessando atributos e métodos específicos de cada classe
    cachorro.correr(); // Saída: Rex está correndo.
    gato.arranhar(); // Saída: Mimi está arranhando.

    System.out.println(cachorro.getRaca()); // Saída: Pastor Alemão
    System.out.println(gato.isTemPelagemLonga()); // Saída: true

    System.out.println("------------");
    System.out.println(animalGenerico);
    System.out.println(cachorro);
    System.out.println(gato);

  }

}