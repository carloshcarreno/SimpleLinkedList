/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.linkedlistadt;

import edu.upb.classes.SimpleLinkedList;

/**
 *
 * @author cahuc
 */
public class MainApp {
    
    public static void main(String[] args) {

       SimpleLinkedList list = new SimpleLinkedList();
       list.add(1);
       list.add(3);
       list.add(10);
       list.add(5);
       
       list.print();
       
    }
    
}
