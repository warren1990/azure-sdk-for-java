// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.resourcemanager.databox.fluent.models.ValidationResponseInner;
import java.util.List;

/** An immutable client-side representation of ValidationResponse. */
public interface ValidationResponse {
    /**
     * Gets the status property: Overall validation status.
     *
     * @return the status value.
     */
    OverallValidationStatus status();

    /**
     * Gets the individualResponseDetails property: List of response details contain validationType and its response as
     * key and value respectively.
     *
     * @return the individualResponseDetails value.
     */
    List<ValidationInputResponse> individualResponseDetails();

    /**
     * Gets the inner com.azure.resourcemanager.databox.fluent.models.ValidationResponseInner object.
     *
     * @return the inner object.
     */
    ValidationResponseInner innerModel();
}