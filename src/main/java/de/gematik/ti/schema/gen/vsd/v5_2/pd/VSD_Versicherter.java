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
public class VSD_Versicherter  {
    
    public static final String NAMESPACE_PREFIX = "VSD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Versicherten_ID;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public VSD_Person Person;
    
    // default Constructor
    public VSD_Versicherter() {
        
        this.Versicherten_ID = new String();
        
        this.Person = new VSD_Person();
        
    }
    
    // copy Constructor
    public VSD_Versicherter(VSD_Versicherter _VSD_Versicherter) {
        
        this.Versicherten_ID = _VSD_Versicherter.Versicherten_ID;
        this.Person = _VSD_Versicherter.Person;
    }
    
    public static VSD_Versicherter deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        VSD_Versicherter _VSD_Versicherter = new VSD_Versicherter();
        
        NodeList nodeListVersicherten_ID = element.getElementsByTagNameNS(VSD_Versicherter.NAMESPACE_URI ,"Versicherten_ID");
        
        if (nodeListVersicherten_ID.getLength() == 0) {
            _VSD_Versicherter.Versicherten_ID = null;
        } else {
            _VSD_Versicherter.Versicherten_ID = String.valueOf(((Element) nodeListVersicherten_ID.item(0)).getTextContent());
        }
        
        NodeList nodeListPerson = element.getElementsByTagNameNS(VSD_Person.NAMESPACE_URI ,"Person");
        Node nodePerson = nodeListPerson.item(0);
        _VSD_Versicherter.Person = VSD_Person.deserialize(nodePerson);
        
        return _VSD_Versicherter;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<VSD_Versicherter>();
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
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("Versicherten_ID", this.Versicherten_ID);
        elemArray.put("Person", this.Person);
        
        return elemArray;
    }
}
