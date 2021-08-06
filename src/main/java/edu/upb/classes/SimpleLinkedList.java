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
public class SimpleLinkedList implements Listable{
    
    private Node first;
  
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }
    
    public void print(){
       
       Node current = getFirst();
       
       do{
            System.out.println("-"+current.getValue());
            current = current.getNext();
            
       }while(current != null);
       
        
    }

    @Override
    public void add(int value) {
        
        Node node = new Node(value);
        
        if(this.first == null){
            this.first = node;
        }else{
         
            Node last = getFirst();
            
            while(last.getNext() != null){
                last = last.getNext();
            }
            
            last.setNext(node);
            
        }
        
    }

    @Override
    public Object find(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
