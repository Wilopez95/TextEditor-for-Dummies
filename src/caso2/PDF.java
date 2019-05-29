/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import com.itextpdf.text.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


/**
 *
 * @author Wilson
 */
public class PDF implements FileProcess{


    @Override
    public void Save(String ruta,String texto) {
        Document document = new Document();
        
        try {
//            String path = new File(".").getCanonicalPath();
             
            String FILE_NAME = ruta;
            
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            document.open();
            
            Paragraph paragraphHello = new Paragraph();
            //paragraphHello.add("Esto es una prueba");
            paragraphHello.setAlignment(Element.ALIGN_JUSTIFIED);
            
            document.add(paragraphHello);
            
            Paragraph paragraphLorem = new Paragraph();
            
            paragraphLorem.add(texto);
            

 
            document.add(paragraphLorem);
            //document.add(p3);
            document.close();
            
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        System.out.println("PDF created");
        document.close();

    }

    @Override
    public String Load(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
