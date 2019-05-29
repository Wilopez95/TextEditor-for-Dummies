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
public class CSV implements FileProcess{

    @Override
    public void Save(String ruta,String texto) {
        String FILE_NAME = ruta;
        
        
        String textAux = ponerComas(texto);
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
    
    private String ponerComas(String texto) {
        return texto.replace(" ", ",");
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
                texto += ponerEspacios(textoAux);
                //System.out.println(textoAux);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
        //System.out.println(texto);
        return texto;
    }
    
    
        private String ponerEspacios(String texto) {
        String textAux = "";
        for (int i = 0; i <texto.length(); i++) 
        {                 
            char c = texto.charAt(i);
            if(c == ',')
            {
                if((texto.charAt(i+1) == ','))
                {
                    textAux += ", ";
                    i++;
                }
                else
                {
                    textAux += " ";
                }
            }else
                textAux += c;
        }
        System.out.println (textAux); 
        return textAux;
        //return texto.replace(",", " ");
    }
    
}
