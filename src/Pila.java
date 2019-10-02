/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mlugom
 */
import java.util.*;
public class Pila<S> implements LinearList{
    private ChainNode<S> head;
    private ChainNode<S> tail;

    public Pila() {
        this.head = new ChainNode(null);
        this.tail = new ChainNode(null);
    }
    
    @Override
    public boolean isEmpty() {
        return this.head.getNext() == null;
    }

    @Override
    public Object poll() {
        if(this.isEmpty()){
            System.out.println("Pila vacía");
            return null;
        }else{
            ChainNode<S> result = this.head.getNext();
            this.head.setNext(result.getNext());
            return result.getElement();
        }
    }
    
    public Object peek(){
        if(this.isEmpty()){
            System.out.println("Pila vacía");
            return null;
        }else{
            ChainNode<S> result = this.head.getNext();
            return result.getElement();
        }
    }

    @Override
    public void add(Object theElement) {
        ChainNode<S> nodo = new ChainNode((S) theElement);
        if(this.isEmpty()){
            this.head.setNext(nodo);
            this.tail.setNext(nodo);
        }else{
            nodo.setNext(this.head.getNext());
            this.head.setNext(nodo);
        }
    }
    
    @Override
    public String toString(){
        if(this.isEmpty()){
            return "[]";
        }else{
            String result = "[";
            ChainNode myIterator = this.head;
            while(myIterator.hasNext()){
                myIterator = myIterator.getNext();
                result += myIterator.getElement();
                if(myIterator.hasNext()){
                   result += ", "; 
                }
            }
            result += "]";
            return result;
        }
    }
    
}
