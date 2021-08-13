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
    public int find(int index) throws Exception;
    public int findByValue(int value) throws Exception;
    public void update(int index, int value) throws Exception;
    public void clear();
    public void remove(int index);
    
}
