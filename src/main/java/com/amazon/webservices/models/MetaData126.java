/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetaData126 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5467492548680455676L;
    private List<KeyValuePair> keyValuePair;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("KeyValuePair")
    public List<KeyValuePair> getKeyValuePair ( ) { 
        return this.keyValuePair;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("KeyValuePair")
    public void setKeyValuePair (List<KeyValuePair> value) { 
        this.keyValuePair = value;
    }
 
}
 