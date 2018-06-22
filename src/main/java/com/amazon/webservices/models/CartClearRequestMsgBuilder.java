/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class CartClearRequestMsgBuilder {
    //the instance to build
    private CartClearRequestMsg cartClearRequestMsg;

    /**
     * Default constructor to initialize the instance
     */
    public CartClearRequestMsgBuilder() {
        cartClearRequestMsg = new CartClearRequestMsg();
    }

    public CartClearRequestMsgBuilder body(CartClear body) {
        cartClearRequestMsg.setBody(body);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartClearRequestMsg build() {
        return cartClearRequestMsg;
    }
}