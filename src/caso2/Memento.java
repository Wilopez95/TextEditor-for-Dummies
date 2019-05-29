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
public class Memento {
    
    private String State;
    
    public Memento(String state){
        this.State =  state;
    }
    
    public String getSavedState(){
        return this.State;
    }
    
}
