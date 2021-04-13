// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The remote virtual network should be in the same region. See here to learn more
 * (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
 */
@Fluent
public final class VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork.class);

    /*
     * The Id of the databricks virtual network.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The Id of the databricks virtual network.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Id of the databricks virtual network.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork object itself.
     */
    public VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork withId(String id) {
        this.id = id;
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