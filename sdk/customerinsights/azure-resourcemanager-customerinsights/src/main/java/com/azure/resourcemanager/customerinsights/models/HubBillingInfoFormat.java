// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hub billing info. */
@Fluent
public final class HubBillingInfoFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubBillingInfoFormat.class);

    /*
     * The sku name.
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /*
     * The minimum number of units will be billed. One unit is 10,000 Profiles
     * and 100,000 Interactions.
     */
    @JsonProperty(value = "minUnits")
    private Integer minUnits;

    /*
     * The maximum number of units can be used.  One unit is 10,000 Profiles
     * and 100,000 Interactions.
     */
    @JsonProperty(value = "maxUnits")
    private Integer maxUnits;

    /**
     * Get the skuName property: The sku name.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: The sku name.
     *
     * @param skuName the skuName value to set.
     * @return the HubBillingInfoFormat object itself.
     */
    public HubBillingInfoFormat withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the minUnits property: The minimum number of units will be billed. One unit is 10,000 Profiles and 100,000
     * Interactions.
     *
     * @return the minUnits value.
     */
    public Integer minUnits() {
        return this.minUnits;
    }

    /**
     * Set the minUnits property: The minimum number of units will be billed. One unit is 10,000 Profiles and 100,000
     * Interactions.
     *
     * @param minUnits the minUnits value to set.
     * @return the HubBillingInfoFormat object itself.
     */
    public HubBillingInfoFormat withMinUnits(Integer minUnits) {
        this.minUnits = minUnits;
        return this;
    }

    /**
     * Get the maxUnits property: The maximum number of units can be used. One unit is 10,000 Profiles and 100,000
     * Interactions.
     *
     * @return the maxUnits value.
     */
    public Integer maxUnits() {
        return this.maxUnits;
    }

    /**
     * Set the maxUnits property: The maximum number of units can be used. One unit is 10,000 Profiles and 100,000
     * Interactions.
     *
     * @param maxUnits the maxUnits value to set.
     * @return the HubBillingInfoFormat object itself.
     */
    public HubBillingInfoFormat withMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
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