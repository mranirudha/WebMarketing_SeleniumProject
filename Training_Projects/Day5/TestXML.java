package testsDDT;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.w3c.dom.*;


public class TestXML
{

	
	@Test
	public void ReadXML()
	{
		
		try {
				File file = new File("Data\\sk.xml"); //file location should be specified correctly
				// Prepare XML
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document document = db.parse(file);
				document.getDocumentElement().normalize();
				System.out.println("Debug: Root element"+ document.getDocumentElement().getNodeName());
				NodeList node = document.getElementsByTagName("TestData");
				System.out.println("TestData Details");
				System.out.println("________________________________________________");

				//Read XML to get test data

					for (int i = 0; i < node.getLength(); i++) 
					{
						Node currentNode = node.item(i);
						if (currentNode.getNodeType() == Node.ELEMENT_NODE) 
							{
								Element element = (Element) currentNode;
								NodeList searchkey = element.getElementsByTagName("Search-Key");
								Element search = (Element) searchkey.item(0);
								NodeList search1 = search.getChildNodes();
								String MySearch = ((Node)search1.item(0)).getNodeValue();
								System.out.println("Search key:"+ MySearch);
							}
					}
		}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
}
	
	@Test
	public void WriteXML()
	{
		
	}
}
