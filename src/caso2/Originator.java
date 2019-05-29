/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

/**
 *
 * @author Wilson
 */
public class Originator {
    
    private String State;
    
    public Originator(){
        
    }
    
    public void set(String state) 
    { 
       System.out.println("Originator: Setting state to "+state);
       this.State = state; 
    }
    
    public Memento saveToMemento() 
    { 
        System.out.println("Originator: Saving to Memento.");
        return new Memento(State); 
    }
    
    public void restoreFromMemento(Memento m) 
    {
        State = m.getSavedState(); 
        System.out.println("Originator: State after restoring from Memento: "+State);
    }
    
    public String getMemento(){
        return State;
    }
    
}
