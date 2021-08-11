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
public class SimpleLinkedList implements Listable {

    private Node first;
    private int size = 0;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print() {

        Node current = getFirst();

        if (getFirst() != null) {
            do {
                System.out.println("* " + current.getValue());
                current = current.getNext();

            } while (current != null);
        } else {
            System.out.println("Empty list!");
        }

    }

    @Override
    public void add(int value) {

        Node node = new Node(value);

        if (this.first == null) {
            this.first = node;
        } else {

            Node last = getFirst();

            while (last.getNext() != null) {
                last = last.getNext();
            }

            last.setNext(node);

        }

        this.size++;

    }

    @Override
    public Object find(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        this.first = null;
        this.size = 0;

    }

    @Override
    public void remove(int index) {

        Node current = getFirst();
        int counter = 0;

        if(index >= getSize() || index<0 ){
            System.out.println("Index doesn't exist!");
        }else if (index == 0 && current != null) {
            this.first = current.getNext();
            current = null;
            this.size--;
        } else {

            do {
                current = current.getNext();
                counter++;
            } while (counter < index-1);

            current.setNext( current.getNext().getNext());

        }

    }

}
