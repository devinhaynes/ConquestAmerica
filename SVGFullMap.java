package application;


import java.io.File;
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class SVGFullMap {
	public static void main(String[] args) {

	      // create a new DocumentBuilderFactory
	      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	      try {
	         // use the factory to create a documentbuilder
	         DocumentBuilder builder = factory.newDocumentBuilder();

	         // create a new document from input source
	         Document doc = builder.parse("src//application//fullMap.svg");
	         
	         //Choose only coordinate data (@d = coordinates)
	         String xpathExpression = "//path/@d";
	         //parse the xml
	         XPathFactory xpf = XPathFactory.newInstance();
	         XPath xpath = xpf.newXPath();
	         XPathExpression expression = xpath.compile(xpathExpression);
	         //Add coordinate data nodes to NodeList
	         NodeList svgNodes = (NodeList)expression.evaluate(doc, XPathConstants.NODESET);
	         
	         //Gather id values
	         String xpathID = "//path/@id";
	         //parse the xml
	         XPathFactory xpfid = XPathFactory.newInstance();
	         XPath xpathid = xpfid.newXPath();
	         XPathExpression expressionid = xpathid.compile(xpathID);
	         //Add all id's to NodeList
	         NodeList idNodes = (NodeList)expressionid.evaluate(doc, XPathConstants.NODESET);
	         
	         //Print name of state : coordinate data
	         for(int i = 0; i < svgNodes.getLength(); i++) {
	        	 System.out.printf("%s: %s%n", idNodes.item(i).getNodeValue(),svgNodes.item(i).getNodeValue());
	         }
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	   }
	}