/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.util.ArrayList;

/**
 *
 * @author Wilson
 */
public class Caretaker {
    private ArrayList<Memento> savedStates = new ArrayList<Memento>();
    
    public Caretaker(){
        
    }
 
   public void addMemento(Memento m) { 
       
        savedStates.add(m);
       
   }
   
   
   public Memento getMemento(int index) {
       return savedStates.get(index); 
   }
   
   public int Listasize(){
       return savedStates.size();
   }
   
   private boolean existeMemento (Memento m){
       for (int i = 0; i < savedStates.size(); i++) {
           if(savedStates.get(i).equals(m)){
               return true;
           }
       }
       return false;
   }
    
}
