/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Accessories 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5594517231395264755L;
    private List<Accessory> accessory;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Accessory")
    public List<Accessory> getAccessory ( ) { 
        return this.accessory;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Accessory")
    public void setAccessory (List<Accessory> value) { 
        this.accessory = value;
    }
 
}
 