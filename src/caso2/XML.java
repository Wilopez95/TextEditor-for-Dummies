/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Wilson
 */
public class XML implements FileProcess{

    @Override
    public void Save(String ruta, String texto) {
                try {
 
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
 
		// elemento texto
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("documento");
		doc.appendChild(rootElement);
 
		//texto
		Element text = doc.createElement("texto");
                text.appendChild(doc.createTextNode(texto));
		rootElement.appendChild(text);
                
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
                
                //String path = new File(".").getCanonicalPath();
                String FILE_NAME = ruta;
		StreamResult result = new StreamResult(new File(FILE_NAME));
 
		// Si se quiere mostrar por la consola...
		// StreamResult result = new StreamResult(System.out);
 
		transformer.transform(source, result);
 
		System.out.println("File saved!");
 
	} catch (ParserConfigurationException pce) {
                pce.printStackTrace();
	} catch (TransformerException tfe) {
			tfe.printStackTrace();
        }
    }

    @Override
    public String Load(String ruta) {
        String State = "";
         try {
            File archivo = new File(ruta);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            NodeList totalTexto = document.getElementsByTagName("texto");
            Node nodo = totalTexto.item(0);
            
            // guarda en una variable global
            State =  nodo.getTextContent();
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
         return State;
    }
    
}
