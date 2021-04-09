// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Static delivery attribute mapping details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Static")
@JsonFlatten
@Fluent
public class StaticDeliveryAttributeMapping extends DeliveryAttributeMapping {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticDeliveryAttributeMapping.class);

    /*
     * Value of the delivery attribute.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /*
     * Boolean flag to tell if the attribute contains sensitive information .
     */
    @JsonProperty(value = "properties.isSecret")
    private Boolean isSecret;

    /**
     * Get the value property: Value of the delivery attribute.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the delivery attribute.
     *
     * @param value the value value to set.
     * @return the StaticDeliveryAttributeMapping object itself.
     */
    public StaticDeliveryAttributeMapping withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSecret property: Boolean flag to tell if the attribute contains sensitive information .
     *
     * @return the isSecret value.
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set the isSecret property: Boolean flag to tell if the attribute contains sensitive information .
     *
     * @param isSecret the isSecret value to set.
     * @return the StaticDeliveryAttributeMapping object itself.
     */
    public StaticDeliveryAttributeMapping withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StaticDeliveryAttributeMapping withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}