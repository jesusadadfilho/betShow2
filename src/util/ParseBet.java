/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import model.Competicao;
import model.Time;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
/**
 *
 * @author Marcelo Alves
 */
public class ParseBet {
    
     private DocumentBuilderFactory dbFactory;
     private DocumentBuilder dBuilder;
     private Document doc;
     private File inputFile;

     
     
     
     
     /**
      * 
      * @return Listagem de Times predefinidos 
      */
    public List<Competicao> getCompeticoes() {
       List<Competicao> competicao = new ArrayList<>();
       try {
         inputFile = new File("src/util/competicao.xml");
         dbFactory = DocumentBuilderFactory.newInstance();
         dBuilder = dbFactory.newDocumentBuilder();
         doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("competicao");
         for (int i = 0; i < nList.getLength(); i++) {
                Element element = (Element) nList.item(i);
                competicao.add(new Competicao(element.getTextContent()));
         }
           
         return competicao;
         
      } catch (Exception e) {
         e.printStackTrace();
      }
       return competicao;
    }
    
    
    
     
     /**
      * 
      * @return Listagem de Times predefinidos 
      */
    public List<Time> getTimes() {
       List<Time> times = new ArrayList<>();
       try {
         inputFile = new File("src/util/times.xml");
         dbFactory = DocumentBuilderFactory.newInstance();
         dBuilder = dbFactory.newDocumentBuilder();
         doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nList = doc.getElementsByTagName("time");
         for (int i = 0; i < nList.getLength(); i++) {
                Element element = (Element) nList.item(i);
                times.add(new Time(element.getTextContent()));
         }
           
         return times;
         
      } catch (Exception e) {
         e.printStackTrace();
      }
       return times;
    }
    
  
    
    
}
