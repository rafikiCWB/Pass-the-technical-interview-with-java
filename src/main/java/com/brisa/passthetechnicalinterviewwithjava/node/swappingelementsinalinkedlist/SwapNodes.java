package com.brisa.passthetechnicalinterviewwithjava.node.swappingelementsinalinkedlist;

import com.brisa.passthetechnicalinterviewwithjava.node.linkedlist.LinkedListNode;

import com.brisa.passthetechnicalinterviewwithjava.node.linkedlist.Node;

public class SwapNodes {
    
    public static void swapNodes(LinkedListNode list, int data1, int data2) {
        Node node1 = list.head;
        Node node2 = list.head;
        Node node1Prev = null;
        Node node2Prev = null;

        while (node1 != null) {
            node1.data = data1; 
            break;
        }

        node1Prev = node1;
        node1 = node1.getNextNode();

    }
}
