/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5246722721478401619L;
    private String cartItemId;
    private String quantity;
    private String aSIN;
    private String sellerNickname;
    private String title;
    private String productGroup;
    private MetaData126 metaData;
    private Price price;
    private Price itemTotal;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartItemId")
    public String getCartItemId ( ) { 
        return this.cartItemId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartItemId")
    public void setCartItemId (String value) { 
        this.cartItemId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Quantity")
    public String getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Quantity")
    public void setQuantity (String value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ASIN")
    public String getASIN ( ) { 
        return this.aSIN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ASIN")
    public void setASIN (String value) { 
        this.aSIN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SellerNickname")
    public String getSellerNickname ( ) { 
        return this.sellerNickname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SellerNickname")
    public void setSellerNickname (String value) { 
        this.sellerNickname = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ProductGroup")
    public String getProductGroup ( ) { 
        return this.productGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ProductGroup")
    public void setProductGroup (String value) { 
        this.productGroup = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MetaData")
    public MetaData126 getMetaData ( ) { 
        return this.metaData;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MetaData")
    public void setMetaData (MetaData126 value) { 
        this.metaData = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Price")
    public Price getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Price")
    public void setPrice (Price value) { 
        this.price = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemTotal")
    public Price getItemTotal ( ) { 
        return this.itemTotal;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemTotal")
    public void setItemTotal (Price value) { 
        this.itemTotal = value;
    }
 
}
 