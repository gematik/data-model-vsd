/*
* Copyright (c) 2020 gematik GmbH
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*    http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

//
//  This is a generated file, do not edit.
//  This file was generated from an xsd file and represents a simple or complex type of it.
//  Generated by a fork of xsd2cocoa (see https://github.com/Daij-Djan/xsd2cocoa) and a specified custom transform template.
//
package de.gematik.ti.schema.gen.vsd.v5_2.gvd;

import de.gematik.ti.schema.gen.vsd.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class VSD_UC_GeschuetzteVersichertendatenXML  {
    
    public static final String NAMESPACE_PREFIX = "VSD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
    
    // attributes:
    /*@isRequired*/
    public String CDM_VERSION;
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public VSD_Zuzahlungsstatus Zuzahlungsstatus;
    
    /*@isSingleAndOptionalValue*/
    
    public IntegerWrapper BesonderePersonengruppe;
    
    /*@isSingleAndOptionalValue*/
    
    public IntegerWrapper DMP_Kennzeichnung;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public VSD_Selektivvertraege Selektivvertraege;
    
    /*@isSingleAndOptionalValue*/
    
    public VSD_RuhenderLeistungsanspruch RuhenderLeistungsanspruch;
    
    // default Constructor
    public VSD_UC_GeschuetzteVersichertendatenXML() {
        
        this.CDM_VERSION = new String();
        
        this.Zuzahlungsstatus = new VSD_Zuzahlungsstatus();
        
        this.BesonderePersonengruppe = null;
        
        this.DMP_Kennzeichnung = null;
        
        this.Selektivvertraege = new VSD_Selektivvertraege();
        
        this.RuhenderLeistungsanspruch = null;
        
    }
    
    // copy Constructor
    public VSD_UC_GeschuetzteVersichertendatenXML(VSD_UC_GeschuetzteVersichertendatenXML _VSD_UC_GeschuetzteVersichertendatenXML) {
        
        this.CDM_VERSION = _VSD_UC_GeschuetzteVersichertendatenXML.CDM_VERSION;
        
        this.Zuzahlungsstatus = _VSD_UC_GeschuetzteVersichertendatenXML.Zuzahlungsstatus;
        this.BesonderePersonengruppe = _VSD_UC_GeschuetzteVersichertendatenXML.BesonderePersonengruppe;
        this.DMP_Kennzeichnung = _VSD_UC_GeschuetzteVersichertendatenXML.DMP_Kennzeichnung;
        this.Selektivvertraege = _VSD_UC_GeschuetzteVersichertendatenXML.Selektivvertraege;
        this.RuhenderLeistungsanspruch = _VSD_UC_GeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch;
    }
    
    public static VSD_UC_GeschuetzteVersichertendatenXML deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        VSD_UC_GeschuetzteVersichertendatenXML _VSD_UC_GeschuetzteVersichertendatenXML = new VSD_UC_GeschuetzteVersichertendatenXML();
        
        _VSD_UC_GeschuetzteVersichertendatenXML.CDM_VERSION = element.getAttributeNode("CDM_VERSION") != null ? element.getAttributeNode("CDM_VERSION").getValue() : null;
        
        NodeList nodeListZuzahlungsstatus = element.getElementsByTagNameNS(VSD_Zuzahlungsstatus.NAMESPACE_URI ,"Zuzahlungsstatus");
        Node nodeZuzahlungsstatus = nodeListZuzahlungsstatus.item(0);
        _VSD_UC_GeschuetzteVersichertendatenXML.Zuzahlungsstatus = VSD_Zuzahlungsstatus.deserialize(nodeZuzahlungsstatus);
        
        NodeList nodeListBesonderePersonengruppe = element.getElementsByTagNameNS(VSD_UC_GeschuetzteVersichertendatenXML.NAMESPACE_URI ,"BesonderePersonengruppe");
        
        if (nodeListBesonderePersonengruppe.getLength() == 0) {
            _VSD_UC_GeschuetzteVersichertendatenXML.BesonderePersonengruppe = null;
        } else {
            _VSD_UC_GeschuetzteVersichertendatenXML.BesonderePersonengruppe = IntegerWrapper.valueOf(((Element) nodeListBesonderePersonengruppe.item(0)).getTextContent());
        }
        
        NodeList nodeListDMP_Kennzeichnung = element.getElementsByTagNameNS(VSD_UC_GeschuetzteVersichertendatenXML.NAMESPACE_URI ,"DMP_Kennzeichnung");
        
        if (nodeListDMP_Kennzeichnung.getLength() == 0) {
            _VSD_UC_GeschuetzteVersichertendatenXML.DMP_Kennzeichnung = null;
        } else {
            _VSD_UC_GeschuetzteVersichertendatenXML.DMP_Kennzeichnung = IntegerWrapper.valueOf(((Element) nodeListDMP_Kennzeichnung.item(0)).getTextContent());
        }
        
        NodeList nodeListSelektivvertraege = element.getElementsByTagNameNS(VSD_Selektivvertraege.NAMESPACE_URI ,"Selektivvertraege");
        Node nodeSelektivvertraege = nodeListSelektivvertraege.item(0);
        _VSD_UC_GeschuetzteVersichertendatenXML.Selektivvertraege = VSD_Selektivvertraege.deserialize(nodeSelektivvertraege);
        
        NodeList nodeListRuhenderLeistungsanspruch = element.getElementsByTagNameNS(VSD_RuhenderLeistungsanspruch.NAMESPACE_URI ,"RuhenderLeistungsanspruch");
        Node nodeRuhenderLeistungsanspruch = nodeListRuhenderLeistungsanspruch.item(0);
        _VSD_UC_GeschuetzteVersichertendatenXML.RuhenderLeistungsanspruch = VSD_RuhenderLeistungsanspruch.deserialize(nodeRuhenderLeistungsanspruch);
        
        return _VSD_UC_GeschuetzteVersichertendatenXML;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<VSD_UC_GeschuetzteVersichertendatenXML>();
        for( Node node : nodeList) {
            result.add(deserialize(node));
        }
        return result;
    }
    
    /**
    * Returns a map of attributes
    */
    public Map<String, Object> getAttributes() {
        HashMap<String, Object> attributesDict = new HashMap<>();
        
        attributesDict.put("CDM_VERSION", this.CDM_VERSION);
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("Zuzahlungsstatus", this.Zuzahlungsstatus);
        elemArray.put("BesonderePersonengruppe", this.BesonderePersonengruppe);
        elemArray.put("DMP_Kennzeichnung", this.DMP_Kennzeichnung);
        elemArray.put("Selektivvertraege", this.Selektivvertraege);
        elemArray.put("RuhenderLeistungsanspruch", this.RuhenderLeistungsanspruch);
        
        return elemArray;
    }
}
