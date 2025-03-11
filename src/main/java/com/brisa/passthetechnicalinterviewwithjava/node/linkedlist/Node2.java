package com.brisa.passthetechnicalinterviewwithjava.node;

public class Node2 {

  public static void main(String[] args) {
    Node node1 = new Node("First");
    Node node2 = new Node("Second");
    Node node3 = new Node("Third");
    node2.setNextNode(node3);
    System.out.println(node2.getNextNode().data);

  }
}
