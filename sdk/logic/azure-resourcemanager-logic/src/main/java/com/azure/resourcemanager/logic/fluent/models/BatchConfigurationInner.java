// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.BatchConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The batch configuration resource definition. */
@Fluent
public final class BatchConfigurationInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BatchConfigurationInner.class);

    /*
     * The batch configuration properties.
     */
    @JsonProperty(value = "properties", required = true)
    private BatchConfigurationProperties properties;

    /**
     * Get the properties property: The batch configuration properties.
     *
     * @return the properties value.
     */
    public BatchConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The batch configuration properties.
     *
     * @param properties the properties value to set.
     * @return the BatchConfigurationInner object itself.
     */
    public BatchConfigurationInner withProperties(BatchConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BatchConfigurationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BatchConfigurationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model BatchConfigurationInner"));
        } else {
            properties().validate();
        }
    }
}