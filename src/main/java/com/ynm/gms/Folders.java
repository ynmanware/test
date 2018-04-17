package com.ynm.gms;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implement a function folderNames, which accepts a string containing an XML file that specifies folder structure and returns all folder names that start with startingLetter. The XML format is given in the example below.
 * For example, for the letter 'u' and an XML file:
 */

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = documentBuilder.parse(new InputSource(new StringReader(xml)));
        NodeList nodeList = doc.getElementsByTagName("folder");

        List<String> folders = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            String folder = nodeList.item(i).getAttributes().getNamedItem("name").getNodeValue();
            if (folder != null && folder.toLowerCase().startsWith("u")) {
                folders.add(folder);
            }
        }
        return folders;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for (String name : names)
            System.out.println(name);
    }
}