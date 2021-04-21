// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.models.AccessRights;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Description of a Namespace AuthorizationRules. */
@JsonFlatten
@Fluent
public class SharedAccessAuthorizationRuleResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedAccessAuthorizationRuleResourceInner.class);

    /*
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights")
    private List<AccessRights> rights;

    /*
     * A base64-encoded 256-bit primary key for signing and validating the SAS
     * token.
     */
    @JsonProperty(value = "properties.primaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryKey;

    /*
     * A base64-encoded 256-bit primary key for signing and validating the SAS
     * token.
     */
    @JsonProperty(value = "properties.secondaryKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryKey;

    /*
     * A string that describes the authorization rule.
     */
    @JsonProperty(value = "properties.keyName", access = JsonProperty.Access.WRITE_ONLY)
    private String keyName;

    /*
     * A string that describes the claim type
     */
    @JsonProperty(value = "properties.claimType", access = JsonProperty.Access.WRITE_ONLY)
    private String claimType;

    /*
     * A string that describes the claim value
     */
    @JsonProperty(value = "properties.claimValue", access = JsonProperty.Access.WRITE_ONLY)
    private String claimValue;

    /*
     * The last modified time for this rule
     */
    @JsonProperty(value = "properties.modifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String modifiedTime;

    /*
     * The created time for this rule
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private String createdTime;

    /*
     * The revision number for the rule
     */
    @JsonProperty(value = "properties.revision", access = JsonProperty.Access.WRITE_ONLY)
    private Integer revision;

    /*
     * The sku of the created namespace
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights property: The rights associated with the rule.
     *
     * @param rights the rights value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Get the primaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Get the secondaryKey property: A base64-encoded 256-bit primary key for signing and validating the SAS token.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Get the keyName property: A string that describes the authorization rule.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Get the claimType property: A string that describes the claim type.
     *
     * @return the claimType value.
     */
    public String claimType() {
        return this.claimType;
    }

    /**
     * Get the claimValue property: A string that describes the claim value.
     *
     * @return the claimValue value.
     */
    public String claimValue() {
        return this.claimValue;
    }

    /**
     * Get the modifiedTime property: The last modified time for this rule.
     *
     * @return the modifiedTime value.
     */
    public String modifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Get the createdTime property: The created time for this rule.
     *
     * @return the createdTime value.
     */
    public String createdTime() {
        return this.createdTime;
    }

    /**
     * Get the revision property: The revision number for the rule.
     *
     * @return the revision value.
     */
    public Integer revision() {
        return this.revision;
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
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharedAccessAuthorizationRuleResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharedAccessAuthorizationRuleResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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