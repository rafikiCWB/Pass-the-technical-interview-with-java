package com.brisa.passthetechnicalinterviewwithjava.node.doubly;

public class Nodess {

    public String data;
    public Nodess next;
    public Nodess previous;

    public Nodess(String data) {
        this.data = data;
        this.next = null;
    }

    public Nodess getNextNode() {
        return this.next;
    }

    public void setNextNode(Nodess next) {
        this.next = next;
    }

    public Nodess getPreviousNode() {
        return this.previous;
    }

    public void setPreviousNode(Nodess previous) {
        this.previous = previous;
    }

}