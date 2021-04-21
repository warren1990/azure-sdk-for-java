// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.InputProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An input object, containing all information associated with the named input. All inputs are contained under a
 * streaming job.
 */
@Fluent
public final class InputInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InputInner.class);

    /*
     * The properties that are associated with an input. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private InputProperties properties;

    /*
     * Resource name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the properties property: The properties that are associated with an input. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @return the properties value.
     */
    public InputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties that are associated with an input. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @param properties the properties value to set.
     * @return the InputInner object itself.
     */
    public InputInner withProperties(InputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the InputInner object itself.
     */
    public InputInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public InputInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}