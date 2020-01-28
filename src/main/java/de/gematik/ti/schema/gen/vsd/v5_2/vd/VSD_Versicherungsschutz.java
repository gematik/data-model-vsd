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
public class VSD_Versicherungsschutz  {
    
    public static final String NAMESPACE_PREFIX = "VSD";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Beginn;
    
    /*@isSingleAndOptionalValue*/
    
    public String Ende;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public VSD_Kostentraeger Kostentraeger;
    
    // default Constructor
    public VSD_Versicherungsschutz() {
        
        this.Beginn = new String();
        
        this.Ende = null;
        
        this.Kostentraeger = new VSD_Kostentraeger();
        
    }
    
    // copy Constructor
    public VSD_Versicherungsschutz(VSD_Versicherungsschutz _VSD_Versicherungsschutz) {
        
        this.Beginn = _VSD_Versicherungsschutz.Beginn;
        this.Ende = _VSD_Versicherungsschutz.Ende;
        this.Kostentraeger = _VSD_Versicherungsschutz.Kostentraeger;
    }
    
    public static VSD_Versicherungsschutz deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        VSD_Versicherungsschutz _VSD_Versicherungsschutz = new VSD_Versicherungsschutz();
        
        NodeList nodeListBeginn = element.getElementsByTagNameNS(VSD_Versicherungsschutz.NAMESPACE_URI ,"Beginn");
        
        if (nodeListBeginn.getLength() == 0) {
            _VSD_Versicherungsschutz.Beginn = null;
        } else {
            _VSD_Versicherungsschutz.Beginn = String.valueOf(((Element) nodeListBeginn.item(0)).getTextContent());
        }
        
        NodeList nodeListEnde = element.getElementsByTagNameNS(VSD_Versicherungsschutz.NAMESPACE_URI ,"Ende");
        
        if (nodeListEnde.getLength() == 0) {
            _VSD_Versicherungsschutz.Ende = null;
        } else {
            _VSD_Versicherungsschutz.Ende = String.valueOf(((Element) nodeListEnde.item(0)).getTextContent());
        }
        
        NodeList nodeListKostentraeger = element.getElementsByTagNameNS(VSD_Kostentraeger.NAMESPACE_URI ,"Kostentraeger");
        Node nodeKostentraeger = nodeListKostentraeger.item(0);
        _VSD_Versicherungsschutz.Kostentraeger = VSD_Kostentraeger.deserialize(nodeKostentraeger);
        
        return _VSD_Versicherungsschutz;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<VSD_Versicherungsschutz>();
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
        
        elemArray.put("Beginn", this.Beginn);
        elemArray.put("Ende", this.Ende);
        elemArray.put("Kostentraeger", this.Kostentraeger);
        
        return elemArray;
    }
}
