// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** AuthenticationPolicy of type Open. */
@Fluent
public final class OpenAuthenticationAccessPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenAuthenticationAccessPolicies.class);

    /*
     * Open authentication policies.
     */
    @JsonProperty(value = "policies")
    private Map<String, OpenAuthenticationAccessPolicy> policies;

    /**
     * Get the policies property: Open authentication policies.
     *
     * @return the policies value.
     */
    public Map<String, OpenAuthenticationAccessPolicy> policies() {
        return this.policies;
    }

    /**
     * Set the policies property: Open authentication policies.
     *
     * @param policies the policies value to set.
     * @return the OpenAuthenticationAccessPolicies object itself.
     */
    public OpenAuthenticationAccessPolicies withPolicies(Map<String, OpenAuthenticationAccessPolicy> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policies() != null) {
            policies()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}