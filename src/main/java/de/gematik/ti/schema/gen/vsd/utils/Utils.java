package de.gematik.ti.schema.gen.vsd.utils;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
* Few simple utils to read DOM. This is originally from the Jakarta Commons
* Modeler.
*/
public class Utils {
    /**
    * Return child elements with specified name.
    *
    * @param parent
    * @param ns
    * @param localName
    * @return
    */
    public static List<Node> getChildrenWithName(Element parent, String ns, String localName) {
        List<Node> r = new ArrayList<Node>();
        for (Node n = parent.getFirstChild(); n != null; n = n.getNextSibling()) {
            if (n instanceof Element) {
                Element e = (Element) n;
                String eNs = (e.getNamespaceURI() == null) ? "" : e.getNamespaceURI();
                if (ns.equals(eNs) && localName.equals(e.getLocalName())) {
                    r.add(e);
                }
            }
        }
        return r;
    }
}
