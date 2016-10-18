/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Allan Wong
 */
public class Node {
    //Properties
    Node next;
    int data;
    
    //Constructors
    public Node(int newData){
    data = newData;
    next = null;
    }
    
    public Node(int newData, Node newNext){
    data = newData;
    next = newNext;
    }
    
    //Getters & Setters
    public int getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
      }
    
    public void setData(int newData){
        data = newData;
    
    }
    
    public void setNext(Node newNode){
        next = newNode;
    }
    
    
    
}
