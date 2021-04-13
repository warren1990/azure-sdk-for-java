// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a field of a type. */
@Fluent
public final class TypeFieldInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TypeFieldInner.class);

    /*
     * Gets or sets the name of the field.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the type of the field.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: Gets or sets the name of the field.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the field.
     *
     * @param name the name value to set.
     * @return the TypeFieldInner object itself.
     */
    public TypeFieldInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Gets or sets the type of the field.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the type of the field.
     *
     * @param type the type value to set.
     * @return the TypeFieldInner object itself.
     */
    public TypeFieldInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}