package com.brisa.passthetechnicalinterviewwithjava.node;

public class OtherNode {
  public static void main(String[] args) {

    Node oldest = new Node("John");
    Node middle = new Node("Jacob");
    Node youngest = new Node("Jingleheimer");

    youngest.setNextNode(middle);
    System.out.println(youngest.data);
    middle.setNextNode(oldest);
    System.out.println(oldest.data);

    Node currentSibling = youngest;
    String oldestName = "";
    while (currentSibling != null) {
      oldestName = currentSibling.data;
      currentSibling = currentSibling.getNextNode();
    }

    System.out.println("There goes " + oldestName + "!");
  }
}
