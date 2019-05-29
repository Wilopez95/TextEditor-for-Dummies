/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.io.IOException;

/**
 *
 * @author Wilson
 */
public interface FileProcess {
    
    public void Save(String ruta,String texto) throws IOException;
    public String Load(String ruta);
    
}
