/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class ItemLookupResponseMsgBuilder {
    //the instance to build
    private ItemLookupResponseMsg itemLookupResponseMsg;

    /**
     * Default constructor to initialize the instance
     */
    public ItemLookupResponseMsgBuilder() {
        itemLookupResponseMsg = new ItemLookupResponseMsg();
    }

    public ItemLookupResponseMsgBuilder body(ItemLookupResponse body) {
        itemLookupResponseMsg.setBody(body);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ItemLookupResponseMsg build() {
        return itemLookupResponseMsg;
    }
}