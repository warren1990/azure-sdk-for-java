// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the create or update connection type operation. */
@JsonFlatten
@Fluent
public class ConnectionTypeCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionTypeCreateOrUpdateParameters.class);

    /*
     * Gets or sets the name of the connection type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets a Boolean value to indicate if the connection type is
     * global.
     */
    @JsonProperty(value = "properties.isGlobal")
    private Boolean isGlobal;

    /*
     * Gets or sets the field definitions of the connection type.
     */
    @JsonProperty(value = "properties.fieldDefinitions", required = true)
    private Map<String, FieldDefinition> fieldDefinitions;

    /**
     * Get the name property: Gets or sets the name of the connection type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the connection type.
     *
     * @param name the name value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @return the isGlobal value.
     */
    public Boolean isGlobal() {
        return this.isGlobal;
    }

    /**
     * Set the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @param isGlobal the isGlobal value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * Get the fieldDefinitions property: Gets or sets the field definitions of the connection type.
     *
     * @return the fieldDefinitions value.
     */
    public Map<String, FieldDefinition> fieldDefinitions() {
        return this.fieldDefinitions;
    }

    /**
     * Set the fieldDefinitions property: Gets or sets the field definitions of the connection type.
     *
     * @param fieldDefinitions the fieldDefinitions value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withFieldDefinitions(Map<String, FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ConnectionTypeCreateOrUpdateParameters"));
        }
        if (fieldDefinitions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fieldDefinitions in model ConnectionTypeCreateOrUpdateParameters"));
        } else {
            fieldDefinitions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}