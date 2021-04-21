// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List EventSources operation. */
@Fluent
public final class EventSourceListResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSourceListResponseInner.class);

    /*
     * Result of the List EventSources operation.
     */
    @JsonProperty(value = "value")
    private List<EventSourceResourceInner> value;

    /**
     * Get the value property: Result of the List EventSources operation.
     *
     * @return the value value.
     */
    public List<EventSourceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List EventSources operation.
     *
     * @param value the value value to set.
     * @return the EventSourceListResponseInner object itself.
     */
    public EventSourceListResponseInner withValue(List<EventSourceResourceInner> value) {
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