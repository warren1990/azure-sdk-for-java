// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyEventInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Query results. */
@Fluent
public final class PolicyEventsQueryResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyEventsQueryResults.class);

    /*
     * OData context string; used by OData clients to resolve type information
     * based on metadata.
     */
    @JsonProperty(value = "@odata.context")
    private String odataContext;

    /*
     * OData entity count; represents the number of policy event records
     * returned.
     */
    @JsonProperty(value = "@odata.count")
    private Integer odataCount;

    /*
     * Odata next link; URL to get the next set of results.
     */
    @JsonProperty(value = "@odata.nextLink")
    private String odataNextLink;

    /*
     * Query results.
     */
    @JsonProperty(value = "value")
    private List<PolicyEventInner> value;

    /**
     * Get the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @return the odataContext value.
     */
    public String odataContext() {
        return this.odataContext;
    }

    /**
     * Set the odataContext property: OData context string; used by OData clients to resolve type information based on
     * metadata.
     *
     * @param odataContext the odataContext value to set.
     * @return the PolicyEventsQueryResults object itself.
     */
    public PolicyEventsQueryResults withOdataContext(String odataContext) {
        this.odataContext = odataContext;
        return this;
    }

    /**
     * Get the odataCount property: OData entity count; represents the number of policy event records returned.
     *
     * @return the odataCount value.
     */
    public Integer odataCount() {
        return this.odataCount;
    }

    /**
     * Set the odataCount property: OData entity count; represents the number of policy event records returned.
     *
     * @param odataCount the odataCount value to set.
     * @return the PolicyEventsQueryResults object itself.
     */
    public PolicyEventsQueryResults withOdataCount(Integer odataCount) {
        this.odataCount = odataCount;
        return this;
    }

    /**
     * Get the odataNextLink property: Odata next link; URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: Odata next link; URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the PolicyEventsQueryResults object itself.
     */
    public PolicyEventsQueryResults withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Get the value property: Query results.
     *
     * @return the value value.
     */
    public List<PolicyEventInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Query results.
     *
     * @param value the value value to set.
     * @return the PolicyEventsQueryResults object itself.
     */
    public PolicyEventsQueryResults withValue(List<PolicyEventInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}