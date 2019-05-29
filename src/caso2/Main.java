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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComandManager comand = ComandManager.getInstance();
        
        /*comand.SaveFile(0);
        
        comand.saveMemento("Hola harry esta es una");
        comand.saveMemento("Hola harry esta es una prueba");
        comand.undoMemento();
        System.out.println("VOLVAMOS");
        comand.redoMemento();
        comand.redoMemento();*/
        
        MainWindows mc =  new MainWindows();
        mc.setVisible(true);
        mc.setTitle("TextEditor 4 Dummies");
        
        
        
    }
    
}
