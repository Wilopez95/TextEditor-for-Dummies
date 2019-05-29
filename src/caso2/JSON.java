/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author Wilson
 */
public class JSON implements FileProcess{


    @Override
    public void Save(String ruta,String texto) {
        JSONObject obj = new JSONObject();
        //JSONObject innerObj = new JSONObject();

        obj.put("texto", texto);
        try {

                FileWriter file = new FileWriter(ruta);
                file.write(obj.toJSONString());
                file.flush();
                file.close();

        } catch (IOException e) {
        }
    }

    @Override
    public String Load(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
