/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class AccessoriesBuilder {
    //the instance to build
    private Accessories accessories;

    /**
     * Default constructor to initialize the instance
     */
    public AccessoriesBuilder() {
        accessories = new Accessories();
    }

    public AccessoriesBuilder accessory(List<Accessory> accessory) {
        accessories.setAccessory(accessory);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Accessories build() {
        return accessories;
    }
}