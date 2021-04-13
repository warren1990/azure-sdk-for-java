// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary item. */
@Fluent
public final class Summary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Summary.class);

    /*
     * Gets the count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Gets the item.
     */
    @JsonProperty(value = "item")
    private String item;

    /**
     * Get the count property: Gets the count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Gets the count.
     *
     * @param count the count value to set.
     * @return the Summary object itself.
     */
    public Summary withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the item property: Gets the item.
     *
     * @return the item value.
     */
    public String item() {
        return this.item;
    }

    /**
     * Set the item property: Gets the item.
     *
     * @param item the item value to set.
     * @return the Summary object itself.
     */
    public Summary withItem(String item) {
        this.item = item;
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