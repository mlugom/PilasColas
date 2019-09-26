
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

    protected ChainNode<S> firstNode;
    private ChainNode<S> endNode;
    

    public Cola() {
        firstNode = null;
        endNode= null;
    }
    
    
    @Override
    public boolean isEmpty() {
        return firstNode == null && endNode == null;
    }


    @Override
    public Object poll() {
        if(this.isEmpty()){
            System.out.println("Cola vacía");
            return null;
        }else{
            ChainNode<S> result = this.firstNode.getNext();
            this.firstNode.setNext(result.getNext());
            return result.getElement();
        }
    }

    @Override
    public void add(Object theElement) {
        ChainNode<S> nodo = new ChainNode((S) theElement,null);
        if(this.isEmpty()){
            this.firstNode.setNext(nodo);
            this.endNode.setNext(nodo);
        }else{
            
            this.endNode.getNext().setNext(nodo);
            this.endNode.setNext(nodo);
            
        }
    }

    
}
