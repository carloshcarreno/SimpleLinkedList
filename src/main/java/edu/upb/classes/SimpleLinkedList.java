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
    private Node last;
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
            this.last = node;
        } else {
            this.last.setNext(node);
            this.last = node;

        }

        this.size++;

    }

    @Override
    public int find(int index) throws Exception {

        Node current = getFirst();
        int result = 0;
        int counter = 0;

        if (index >= getSize() || index < 0) {
            throw new Exception("Index doesn't exist!");
        } else if (current == null) {
            throw new Exception("Empty list!");
        } else if (index == 0) {
            result = this.first.getValue();
        } else {

            do {
                current = current.getNext();
                counter++;
            } while (counter < index);

            result = current.getValue();

        }

        return result;

    }

    @Override
    public int findByValue(int value) throws Exception {

        Node current = getFirst();
        int index = 0;

        while (current.getValue() != value) {
            index++;
            current = current.getNext();

            if (index == getSize()) {
                throw new Exception("Not found");
            }
        }

        return index;
    }

    @Override
    public void update(int index, int value) throws Exception{

        Node current = getFirst();
        int counter = 0;

        if (index >= getSize() || index < 0) {
            throw new Exception("Index doesn't exist!");
        } else if (current == null) {
            throw new Exception("Empty list!");
        } else if (index == 0) {
            this.first.setValue(value);
        } else {

            do {
                current = current.getNext();
                counter++;
            } while (counter < index);

            current.setValue(value);

        }


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

        if (index >= getSize() || index < 0) {
            System.out.println("Index doesn't exist!");
        } else if (index == 0 && current != null) {
            this.first = current.getNext();
            current = null;
            this.size--;
        } else {

            do {
                current = current.getNext();
                counter++;
            } while (counter < index - 1);

            current.setNext(current.getNext().getNext());
        }

    }

}
