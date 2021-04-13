// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** PolyBase settings. */
@Fluent
public final class PolybaseSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolybaseSettings.class);

    /*
     * Reject type.
     */
    @JsonProperty(value = "rejectType")
    private PolybaseSettingsRejectType rejectType;

    /*
     * Specifies the value or the percentage of rows that can be rejected
     * before the query fails. Type: number (or Expression with resultType
     * number), minimum: 0.
     */
    @JsonProperty(value = "rejectValue")
    private Object rejectValue;

    /*
     * Determines the number of rows to attempt to retrieve before the PolyBase
     * recalculates the percentage of rejected rows. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "rejectSampleValue")
    private Object rejectSampleValue;

    /*
     * Specifies how to handle missing values in delimited text files when
     * PolyBase retrieves data from the text file. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "useTypeDefault")
    private Object useTypeDefault;

    /*
     * PolyBase settings.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the rejectType property: Reject type.
     *
     * @return the rejectType value.
     */
    public PolybaseSettingsRejectType rejectType() {
        return this.rejectType;
    }

    /**
     * Set the rejectType property: Reject type.
     *
     * @param rejectType the rejectType value to set.
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectType(PolybaseSettingsRejectType rejectType) {
        this.rejectType = rejectType;
        return this;
    }

    /**
     * Get the rejectValue property: Specifies the value or the percentage of rows that can be rejected before the query
     * fails. Type: number (or Expression with resultType number), minimum: 0.
     *
     * @return the rejectValue value.
     */
    public Object rejectValue() {
        return this.rejectValue;
    }

    /**
     * Set the rejectValue property: Specifies the value or the percentage of rows that can be rejected before the query
     * fails. Type: number (or Expression with resultType number), minimum: 0.
     *
     * @param rejectValue the rejectValue value to set.
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectValue(Object rejectValue) {
        this.rejectValue = rejectValue;
        return this;
    }

    /**
     * Get the rejectSampleValue property: Determines the number of rows to attempt to retrieve before the PolyBase
     * recalculates the percentage of rejected rows. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the rejectSampleValue value.
     */
    public Object rejectSampleValue() {
        return this.rejectSampleValue;
    }

    /**
     * Set the rejectSampleValue property: Determines the number of rows to attempt to retrieve before the PolyBase
     * recalculates the percentage of rejected rows. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param rejectSampleValue the rejectSampleValue value to set.
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectSampleValue(Object rejectSampleValue) {
        this.rejectSampleValue = rejectSampleValue;
        return this;
    }

    /**
     * Get the useTypeDefault property: Specifies how to handle missing values in delimited text files when PolyBase
     * retrieves data from the text file. Type: boolean (or Expression with resultType boolean).
     *
     * @return the useTypeDefault value.
     */
    public Object useTypeDefault() {
        return this.useTypeDefault;
    }

    /**
     * Set the useTypeDefault property: Specifies how to handle missing values in delimited text files when PolyBase
     * retrieves data from the text file. Type: boolean (or Expression with resultType boolean).
     *
     * @param useTypeDefault the useTypeDefault value to set.
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withUseTypeDefault(Object useTypeDefault) {
        this.useTypeDefault = useTypeDefault;
        return this;
    }

    /**
     * Get the additionalProperties property: PolyBase settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: PolyBase settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}