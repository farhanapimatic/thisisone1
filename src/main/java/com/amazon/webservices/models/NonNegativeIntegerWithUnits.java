/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NonNegativeIntegerWithUnits 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5043053253706668350L;
    private String units;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Units")
    public String getUnits ( ) { 
        return this.units;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Units")
    public void setUnits (String value) { 
        this.units = value;
    }
 
}
 