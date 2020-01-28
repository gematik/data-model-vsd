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
package de.gematik.ti.schema.gen.vsd.v5_2.pd;

import de.gematik.ti.schema.gen.vsd.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class VSD_UC_PersoenlicheVersichertendatenXML  {
    
    public static final String NAMESPACE_PREFIX = "VSD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
    
    // attributes:
    /*@isRequired*/
    public String CDM_VERSION;
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public VSD_Versicherter Versicherter;
    
    // default Constructor
    public VSD_UC_PersoenlicheVersichertendatenXML() {
        
        this.CDM_VERSION = new String();
        
        this.Versicherter = new VSD_Versicherter();
        
    }
    
    // copy Constructor
    public VSD_UC_PersoenlicheVersichertendatenXML(VSD_UC_PersoenlicheVersichertendatenXML _VSD_UC_PersoenlicheVersichertendatenXML) {
        
        this.CDM_VERSION = _VSD_UC_PersoenlicheVersichertendatenXML.CDM_VERSION;
        
        this.Versicherter = _VSD_UC_PersoenlicheVersichertendatenXML.Versicherter;
    }
    
    public static VSD_UC_PersoenlicheVersichertendatenXML deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        VSD_UC_PersoenlicheVersichertendatenXML _VSD_UC_PersoenlicheVersichertendatenXML = new VSD_UC_PersoenlicheVersichertendatenXML();
        
        _VSD_UC_PersoenlicheVersichertendatenXML.CDM_VERSION = element.getAttributeNode("CDM_VERSION") != null ? element.getAttributeNode("CDM_VERSION").getValue() : null;
        
        NodeList nodeListVersicherter = element.getElementsByTagNameNS(VSD_Versicherter.NAMESPACE_URI ,"Versicherter");
        Node nodeVersicherter = nodeListVersicherter.item(0);
        _VSD_UC_PersoenlicheVersichertendatenXML.Versicherter = VSD_Versicherter.deserialize(nodeVersicherter);
        
        return _VSD_UC_PersoenlicheVersichertendatenXML;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<VSD_UC_PersoenlicheVersichertendatenXML>();
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
        
        elemArray.put("Versicherter", this.Versicherter);
        
        return elemArray;
    }
}
