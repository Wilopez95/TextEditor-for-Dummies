/*
 * El administrador de comandos se encarga de analizar el 
 * comando de entrada y ejecutar el caso necesario
 */
package caso2;

import java.io.IOException;

/**
 *
 * @author Wilson
 */
public class ComandManager {
    private static ComandManager comandManager; 
    private Originator originator;
    private Caretaker caretaker;
    private int indexMemento=-1;
    
    private ComandManager(){
       caretaker= new Caretaker();
       originator = new Originator();
        
    }
    
    private static synchronized void createinstance(){
         if(comandManager==null){
             comandManager = new ComandManager();
         }
     }
    
    
     public static  ComandManager getInstance(){
         if (comandManager == null){
             createinstance();
         }
         return comandManager;
     }
     
     public void SaveFile(int type, String texto,String url) throws IOException{
         switch (type) {
            case 1:
                FileProcess txt = new TXT();
                txt.Save(url,texto);
                break;
            case 2:
                FileProcess txtpt = new TXTPT();
                txtpt.Save(url,texto);
                break;
            case 3:
                FileProcess xml = new XML();
                xml.Save(url, texto);
            case 4:
                System.out.println("JSON");
                break;
            case 5:
                FileProcess csv = new CSV();
                csv.Save(url, texto);
            case 6:
                FileProcess pdf =  new PDF();
                pdf.Save(url, texto);
            }
         
     }
     
     public String LoadFile(int type,String url ){
         switch (type) {
            case 1:
                FileProcess txt = new TXT();
                return txt.Load(url);
            case 2:
                FileProcess txtpt = new TXTPT();
                return txtpt.Load(url);
            case 3:
                FileProcess xml =  new XML();
                return xml.Load(url);
            case 4:
                FileProcess json= new JSON();
                return json.Load(url);
            case 5:
                FileProcess csv = new CSV();
                return csv.Load(url);
            }
         return "Error";
     }
     
     public void saveMemento(String State){
         originator.set(State);
         caretaker.addMemento(originator.saveToMemento());
         this.indexMemento = caretaker.Listasize();
         
         
     }
     
    public void undoMemento(){
        try {
            originator.restoreFromMemento( caretaker.getMemento(indexMemento-1) );
            indexMemento--;
        } catch (Exception e) {
            System.out.println("No hay mas mementos alamacenados para deshacer");
        }
         
     }
    
    public void redoMemento(){
        try {
            originator.restoreFromMemento( caretaker.getMemento(indexMemento+1) );
            indexMemento++;
        } catch (Exception e) {
            System.out.println("No hay mas mementos almacenados para rehacer");
        }
         
     }
    
    public String getMemento (){
        return originator.getMemento();
    }
         
}
