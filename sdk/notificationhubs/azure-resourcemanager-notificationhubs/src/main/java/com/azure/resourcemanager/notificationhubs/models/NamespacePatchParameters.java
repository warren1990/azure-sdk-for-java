// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters supplied to the Patch Namespace operation. */
@Fluent
public final class NamespacePatchParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespacePatchParameters.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The sku of the created namespace
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the NamespacePatchParameters object itself.
     */
    public NamespacePatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The sku of the created namespace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the created namespace.
     *
     * @param sku the sku value to set.
     * @return the NamespacePatchParameters object itself.
     */
    public NamespacePatchParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}