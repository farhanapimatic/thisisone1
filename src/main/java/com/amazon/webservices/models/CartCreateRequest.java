/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartCreateRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5695258299086300958L;
    private String mergeCart;
    private Items24 items;
    private List<String> responseGroup;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MergeCart")
    public String getMergeCart ( ) { 
        return this.mergeCart;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MergeCart")
    public void setMergeCart (String value) { 
        this.mergeCart = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Items")
    public Items24 getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Items")
    public void setItems (Items24 value) { 
        this.items = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseGroup")
    public List<String> getResponseGroup ( ) { 
        return this.responseGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseGroup")
    public void setResponseGroup (List<String> value) { 
        this.responseGroup = value;
    }
 
}
 