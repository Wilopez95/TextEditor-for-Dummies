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
public class TXT implements FileProcess{


    @Override
    public void Save(String ruta,String texto) {
        
        String FILE_NAME =ruta;
        try
        {
            File archivo=new File(FILE_NAME);

            FileWriter escribir=new FileWriter(archivo,true);

            escribir.write(texto);

            escribir.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
    }

    @Override
    public String Load(String ruta) {
       String textoAux = "";
       String texto= "";
        
        try
        {
            FileReader lector=new FileReader(ruta);

            BufferedReader contenido=new BufferedReader(lector);

            while((textoAux=contenido.readLine())!=null)
            {
                texto += textoAux;
                //System.out.println(textoAux);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
        return texto;
    }
    
    
   
    
    
}
