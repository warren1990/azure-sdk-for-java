// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The file system to mount on each node. */
@Fluent
public final class MountConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MountConfiguration.class);

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "azureBlobFileSystemConfiguration")
    private AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "nfsMountConfiguration")
    private NfsMountConfiguration nfsMountConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "cifsMountConfiguration")
    private CifsMountConfiguration cifsMountConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "azureFileShareConfiguration")
    private AzureFileShareConfiguration azureFileShareConfiguration;

    /**
     * Get the azureBlobFileSystemConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the azureBlobFileSystemConfiguration value.
     */
    public AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration() {
        return this.azureBlobFileSystemConfiguration;
    }

    /**
     * Set the azureBlobFileSystemConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param azureBlobFileSystemConfiguration the azureBlobFileSystemConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration withAzureBlobFileSystemConfiguration(
        AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        return this;
    }

    /**
     * Get the nfsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the nfsMountConfiguration value.
     */
    public NfsMountConfiguration nfsMountConfiguration() {
        return this.nfsMountConfiguration;
    }

    /**
     * Set the nfsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param nfsMountConfiguration the nfsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration withNfsMountConfiguration(NfsMountConfiguration nfsMountConfiguration) {
        this.nfsMountConfiguration = nfsMountConfiguration;
        return this;
    }

    /**
     * Get the cifsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the cifsMountConfiguration value.
     */
    public CifsMountConfiguration cifsMountConfiguration() {
        return this.cifsMountConfiguration;
    }

    /**
     * Set the cifsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param cifsMountConfiguration the cifsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration withCifsMountConfiguration(CifsMountConfiguration cifsMountConfiguration) {
        this.cifsMountConfiguration = cifsMountConfiguration;
        return this;
    }

    /**
     * Get the azureFileShareConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the azureFileShareConfiguration value.
     */
    public AzureFileShareConfiguration azureFileShareConfiguration() {
        return this.azureFileShareConfiguration;
    }

    /**
     * Set the azureFileShareConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param azureFileShareConfiguration the azureFileShareConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration withAzureFileShareConfiguration(AzureFileShareConfiguration azureFileShareConfiguration) {
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureBlobFileSystemConfiguration() != null) {
            azureBlobFileSystemConfiguration().validate();
        }
        if (nfsMountConfiguration() != null) {
            nfsMountConfiguration().validate();
        }
        if (cifsMountConfiguration() != null) {
            cifsMountConfiguration().validate();
        }
        if (azureFileShareConfiguration() != null) {
            azureFileShareConfiguration().validate();
        }
    }
}