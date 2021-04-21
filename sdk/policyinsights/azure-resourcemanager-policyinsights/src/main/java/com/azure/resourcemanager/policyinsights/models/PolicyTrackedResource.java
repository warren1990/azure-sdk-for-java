// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.resourcemanager.policyinsights.fluent.models.PolicyTrackedResourceInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of PolicyTrackedResource. */
public interface PolicyTrackedResource {
    /**
     * Gets the trackedResourceId property: The ID of the policy tracked resource.
     *
     * @return the trackedResourceId value.
     */
    String trackedResourceId();

    /**
     * Gets the policyDetails property: The details of the policy that require the tracked resource.
     *
     * @return the policyDetails value.
     */
    PolicyDetails policyDetails();

    /**
     * Gets the createdBy property: The details of the policy triggered deployment that created the tracked resource.
     *
     * @return the createdBy value.
     */
    TrackedResourceModificationDetails createdBy();

    /**
     * Gets the lastModifiedBy property: The details of the policy triggered deployment that modified the tracked
     * resource.
     *
     * @return the lastModifiedBy value.
     */
    TrackedResourceModificationDetails lastModifiedBy();

    /**
     * Gets the lastUpdateUtc property: Timestamp of the last update to the tracked resource.
     *
     * @return the lastUpdateUtc value.
     */
    OffsetDateTime lastUpdateUtc();

    /**
     * Gets the inner com.azure.resourcemanager.policyinsights.fluent.models.PolicyTrackedResourceInner object.
     *
     * @return the inner object.
     */
    PolicyTrackedResourceInner innerModel();
}