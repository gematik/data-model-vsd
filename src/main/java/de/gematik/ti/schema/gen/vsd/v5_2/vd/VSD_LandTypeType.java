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
package de.gematik.ti.schema.gen.vsd.v5_2.vd;

import de.gematik.ti.schema.gen.vsd.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class VSD_LandTypeType  {
    
    public static final String NAMESPACE_PREFIX = "VSD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Wohnsitzlaendercode;
    
    // default Constructor
    public VSD_LandTypeType() {
        
        this.Wohnsitzlaendercode = new String();
        
    }
    
    // copy Constructor
    public VSD_LandTypeType(VSD_LandTypeType _VSD_LandTypeType) {
        
        this.Wohnsitzlaendercode = _VSD_LandTypeType.Wohnsitzlaendercode;
    }
    
    public static VSD_LandTypeType deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        VSD_LandTypeType _VSD_LandTypeType = new VSD_LandTypeType();
        
        NodeList nodeListWohnsitzlaendercode = element.getElementsByTagNameNS(VSD_LandTypeType.NAMESPACE_URI ,"Wohnsitzlaendercode");
        
        if (nodeListWohnsitzlaendercode.getLength() == 0) {
            _VSD_LandTypeType.Wohnsitzlaendercode = null;
        } else {
            _VSD_LandTypeType.Wohnsitzlaendercode = String.valueOf(((Element) nodeListWohnsitzlaendercode.item(0)).getTextContent());
        }
        
        return _VSD_LandTypeType;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<VSD_LandTypeType>();
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
        
        elemArray.put("Wohnsitzlaendercode", this.Wohnsitzlaendercode);
        
        return elemArray;
    }
}

