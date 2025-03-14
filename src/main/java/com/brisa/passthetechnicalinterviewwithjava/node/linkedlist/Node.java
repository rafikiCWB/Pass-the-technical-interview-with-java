package com.brisa.passthetechnicalinterviewwithjava.node.linkedlist;

public class Node {
  public String data; // instance variable
  private Node next;
  
  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node next) {
    this.next = next;
  }

  public Node getNextNode() {
    return this.next;
  }

  public static void main(String[] args) {
    Node firstNode = new Node("I am a Node!");
    Node secondNode = new Node("I am the second Node!");
    firstNode.setNextNode(secondNode);
    System.out.println(firstNode.next.data);
    System.out.println(firstNode.getNextNode().data);

    Node strawberry = new Node("Berry Tasty");
    Node banana = new Node("Banana-rama");
    Node coconut = new Node("Nuts for Coconut");

    strawberry.setNextNode(banana);
    banana.setNextNode(coconut);

    Node currentNode = strawberry;
    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.getNextNode();
    }
  }
}
