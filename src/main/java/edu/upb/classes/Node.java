/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.classes;

/**
 *
 * @author cahuc
 */
public class Node {
    
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
   
}
