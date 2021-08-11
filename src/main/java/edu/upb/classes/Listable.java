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
public interface Listable {
    
    public void add(int value);
    public Object find(int index);
    public void clear();
    public void remove(int index);
    
}
