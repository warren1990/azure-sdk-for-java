// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Individual resource operation information. */
@Fluent
public final class ResourceOperation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceOperation.class);

    /*
     * Name of the resource as specified in the artifacts. For ARM resources,
     * this is the name of the resource specified in the template.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Unique identifier of the operation. For ARM resources, this is the
     * operationId obtained from ARM service.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * Type of the resource as specified in the artifacts. For ARM resources,
     * this is the type of the resource specified in the template.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * State of the resource deployment. For ARM resources, this is the current
     * provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Descriptive information of the resource operation.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /*
     * Http status code of the operation.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String statusCode;

    /**
     * Get the resourceName property: Name of the resource as specified in the artifacts. For ARM resources, this is the
     * name of the resource specified in the template.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Name of the resource as specified in the artifacts. For ARM resources, this is the
     * name of the resource specified in the template.
     *
     * @param resourceName the resourceName value to set.
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the operationId property: Unique identifier of the operation. For ARM resources, this is the operationId
     * obtained from ARM service.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the resourceType property: Type of the resource as specified in the artifacts. For ARM resources, this is the
     * type of the resource specified in the template.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Type of the resource as specified in the artifacts. For ARM resources, this is the
     * type of the resource specified in the template.
     *
     * @param resourceType the resourceType value to set.
     * @return the ResourceOperation object itself.
     */
    public ResourceOperation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the provisioningState property: State of the resource deployment. For ARM resources, this is the current
     * provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the statusMessage property: Descriptive information of the resource operation.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the statusCode property: Http status code of the operation.
     *
     * @return the statusCode value.
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}