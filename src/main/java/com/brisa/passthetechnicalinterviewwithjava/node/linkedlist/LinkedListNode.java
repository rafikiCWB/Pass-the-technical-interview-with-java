package com.brisa.passthetechnicalinterviewwithjava.node;

public class LinkedListNode {

    public Node head;

    public LinkedListNode() {
        this.head = null;
    }

    //ConstructorAndAddingToTheHead
    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    //Adding to the Tail
    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    // Removing the head;
    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    //Printing
    public String printList() {
        StringBuilder output = new StringBuilder("<head> ");
        Node currentNode = this.head;
        while (currentNode != null) {
            output.append(currentNode.data).append(" ");
            currentNode = currentNode.getNextNode();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }

    //Implementation
    public static void main(String[] args) {
        // Write your code here:
        LinkedListNode seasons = new LinkedListNode();
        seasons.printList();
        seasons.addToHead("summer");
        seasons.addToHead("Spring");
        seasons.printList();

        seasons.addToTail("fall");
        seasons.addToTail("winter");
        seasons.printList();

        seasons.removeHead();
        seasons.printList();


        System.out.println("----------");
        LinkedListNode testList = new LinkedListNode();
        testList.addToHead("three");
        testList.addToHead("eight");
        testList.addToTail("two");
        testList.removeHead();
        testList.addToTail("four");
        testList.removeHead();
        System.out.println(testList.head.data);


    }

}
