package de.gematik.ti.schema.gen.vsd.v5_2.vd;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;

public class VSD_VD_Test {

    @Test
    public void testXmlToClassDeserialize() {

        URL url = Thread.currentThread().getContextClassLoader().getResource("vsd_v5_2_vd.xml");
        System.out.println("File to be parsed: " + url.getPath());
        File file = new File(url.getPath());

        //Read and Parse
        Document doc = null;
        VSD_UC_AllgemeineVersicherungsdatenXML vsdDocument = null;
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            dbfactory.setNamespaceAware(true);
            DocumentBuilder builder = dbfactory.newDocumentBuilder();

            doc = builder.parse(file);
            vsdDocument = VSD_UC_AllgemeineVersicherungsdatenXML.deserialize(doc.getDocumentElement());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // test for attributes
        Assert.assertEquals("5.2.0", vsdDocument.CDM_VERSION);

        // test for Integer Elements
        Assert.assertEquals(999567890, vsdDocument.Versicherter.Versicherungsschutz.Kostentraeger.Kostentraegerkennung.toInt());
        Assert.assertEquals(997234564, vsdDocument.Versicherter.Versicherungsschutz.Kostentraeger.AbrechnenderKostentraeger.Kostentraegerkennung.toInt());

    }
}
