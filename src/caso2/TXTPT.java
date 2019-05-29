/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Wilson
 */
public class TXTPT implements FileProcess{


    @Override
    public void Save(String ruta,String texto) {
         
        String FILE_NAME = ruta;
        
        String textAux = ponerTabs(texto);
        
        try
        {
            File archivo=new File(FILE_NAME);

            FileWriter escribir=new FileWriter(archivo,true);

            escribir.write(textAux);

            escribir.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
    }
    
     private String ponerTabs(String texto)
    {
        String textAux = "";
        String textFinal = "";
        for (int i = 0; i <texto.length(); i++) 
        { 
            char c = texto.charAt (i); 
            textAux += c;
            if ((i+1)%10 == 0)
            {
                textFinal += (textAux + "\t");
                textAux = "";
            }
            //System.out.println (textFinal); 
        }
        return textFinal;
        
    }

    @Override
    public String Load(String ruta) {
        String textoAux = "";
        String texto = "";
        
        try
        {
            FileReader lector=new FileReader(ruta);

            BufferedReader contenido=new BufferedReader(lector);

            while((textoAux=contenido.readLine())!=null)
            {
                texto += quitarTabs(textoAux);
                //System.out.println(textoAux);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
        return texto;    
    
}
    
 private String quitarTabs(String texto)
    {
        String textAux = "";
        String textFinal = "";
        for (int i = 0; i <texto.length(); i++) 
        {                 
            char c = texto.charAt(i);
            System.out.println("char: " + c);
            if(c != '\t')
            {
                textAux += c;
                System.out.println("char if: " + c);
                if ((i+1)%10 == 0)
                {
                    textFinal += textAux;
                    textAux = "";
                }
                    
            }
            
            //System.out.println (textFinal); 
        }
        textFinal += textAux;
        return textFinal;
    }
}
