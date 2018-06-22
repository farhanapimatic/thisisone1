/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class LanguageBuilder {
    //the instance to build
    private Language language;

    /**
     * Default constructor to initialize the instance
     */
    public LanguageBuilder() {
        language = new Language();
    }

    public LanguageBuilder name(String name) {
        language.setName(name);
        return this;
    }

    public LanguageBuilder type(String type) {
        language.setType(type);
        return this;
    }

    public LanguageBuilder audioFormat(String audioFormat) {
        language.setAudioFormat(audioFormat);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Language build() {
        return language;
    }
}