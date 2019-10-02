
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mlugom
 */
public class Cola<S> implements LinearList{

    protected ChainNode<S> head;
    private ChainNode<S> tail;
    

    public Cola() {
        head = new ChainNode(null);
        tail = new ChainNode(null);
    }
    
    
    @Override
    public boolean isEmpty() {
        return head.getNext()==null;
    }


    @Override
    public Object poll() {
        if(this.isEmpty()){
            System.out.println("Cola vacía");
            return null;
        }else{
            ChainNode<S> result = this.head.getNext();
            this.head.setNext(result.getNext());
            return result.getElement();
        }
    }
    
    public Object peek(){
        if(this.isEmpty()){
            System.out.println("Cola vacía");
            return null;
        }else{
            return this.head.getNext().getElement();
        }
    }

    @Override
    public void add(Object theElement) {
        ChainNode<S> nodo = new ChainNode((S) theElement,null);
        if(this.isEmpty()){
            this.head.setNext(nodo);
            this.tail.setNext(nodo);
        }else{
            
            this.tail.getNext().setNext(nodo);
            this.tail.setNext(nodo);
            
        }
    }

    
}
