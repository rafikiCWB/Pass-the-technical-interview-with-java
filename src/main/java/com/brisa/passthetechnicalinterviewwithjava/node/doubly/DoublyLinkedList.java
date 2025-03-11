package com.brisa.passthetechnicalinterviewwithjava.node.doubly;

public class DoublyLinkedList {

    public Nodess head;
    public Nodess tail;

    public void addToHead(String data) {
        Nodess newHead = new Nodess(data);
        Nodess currentHead = this.head;
        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;
        if (this.tail == null) {
            this.tail = newHead;
        }
    }


    public void addToTail(String data) {//1 {
    Nodess newTail = new Nodess(data);
    Nodess currentTail = this.tail;
        if (currentTail != null) {
        currentTail.setNextNode(newTail);
        newTail.setPreviousNode(currentTail);
    }
        this.tail = newTail;
        if (this.head == null) {
        this.head = newTail;
    }
}


    public String removeHead() {
        Nodess removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        if (this.tail == null) {
            this.head.setPreviousNode(null);
        }
        if (removedHead == this.head) {
            this.removeTail();
        }
        return removedHead.data;
    }

    public String removeTail() {
        Nodess removedTail = this.tail;
        if (removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }
        if (removedTail == this.head) {
            this.removeHead();
        }
        return removedTail.data;
    }

    public Nodess removeByData(String data) {
        Nodess nodeToRemove = null;
        Nodess currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        if (nodeToRemove == null) {
            return null;
        } else if (nodeToRemove == this.head) {
            this.removeHead();
        } else if (nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            Nodess nextNode = nodeToRemove.getNextNode();
            Nodess previousNode = nodeToRemove.getPreviousNode();

            nextNode.setPreviousNode(previousNode);
            previousNode.setNextNode(nextNode);
        }
        return nodeToRemove;
    }


    public String printList() {
        Nodess currentNode = this.head;
        StringBuilder output = new StringBuilder("<head> ");
        while (currentNode != null) {
            output.append(currentNode.data).append(" ");
            currentNode = currentNode.getNextNode();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }

    public static void main(String[] args) {
        DoublyLinkedList subway = new DoublyLinkedList();
//        subway.addToHead("Times Square");
//        subway.addToHead("Grand Central");
//        subway.addToHead("Central Park");
//        subway.printList();
//        subway.addToTail("Penn Station");
//        subway.addToTail("Wall Street");
//        subway.addToTail("Brooklyn Bridge");
//        subway.printList();
//
//        subway.removeHead();
//        subway.removeTail();
//        subway.printList();
//
//        subway.removeByData("Times Square");
//        subway.removeByData("Penn Station");
//        subway.printList();

        subway.addToHead("hello");
        subway.removeHead();
        subway.printList();

    }
}

