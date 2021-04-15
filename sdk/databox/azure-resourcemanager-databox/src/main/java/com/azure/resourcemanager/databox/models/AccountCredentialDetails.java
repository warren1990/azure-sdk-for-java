// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Credential details of the account. */
@Immutable
public final class AccountCredentialDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountCredentialDetails.class);

    /*
     * Name of the account.
     */
    @JsonProperty(value = "accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /*
     * Type of the account.
     */
    @JsonProperty(value = "dataAccountType", access = JsonProperty.Access.WRITE_ONLY)
    private DataAccountType dataAccountType;

    /*
     * Connection string of the account endpoint to use the account as a
     * storage endpoint on the device.
     */
    @JsonProperty(value = "accountConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String accountConnectionString;

    /*
     * Per share level unencrypted access credentials.
     */
    @JsonProperty(value = "shareCredentialDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareCredentialDetails> shareCredentialDetails;

    /**
     * Get the accountName property: Name of the account.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get the dataAccountType property: Type of the account.
     *
     * @return the dataAccountType value.
     */
    public DataAccountType dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Get the accountConnectionString property: Connection string of the account endpoint to use the account as a
     * storage endpoint on the device.
     *
     * @return the accountConnectionString value.
     */
    public String accountConnectionString() {
        return this.accountConnectionString;
    }

    /**
     * Get the shareCredentialDetails property: Per share level unencrypted access credentials.
     *
     * @return the shareCredentialDetails value.
     */
    public List<ShareCredentialDetails> shareCredentialDetails() {
        return this.shareCredentialDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (shareCredentialDetails() != null) {
            shareCredentialDetails().forEach(e -> e.validate());
        }
    }
}