// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationAccountSkuName. */
public final class IntegrationAccountSkuName extends ExpandableStringEnum<IntegrationAccountSkuName> {
    /** Static value NotSpecified for IntegrationAccountSkuName. */
    public static final IntegrationAccountSkuName NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Free for IntegrationAccountSkuName. */
    public static final IntegrationAccountSkuName FREE = fromString("Free");

    /** Static value Basic for IntegrationAccountSkuName. */
    public static final IntegrationAccountSkuName BASIC = fromString("Basic");

    /** Static value Standard for IntegrationAccountSkuName. */
    public static final IntegrationAccountSkuName STANDARD = fromString("Standard");

    /**
     * Creates or finds a IntegrationAccountSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationAccountSkuName.
     */
    @JsonCreator
    public static IntegrationAccountSkuName fromString(String name) {
        return fromString(name, IntegrationAccountSkuName.class);
    }

    /** @return known IntegrationAccountSkuName values. */
    public static Collection<IntegrationAccountSkuName> values() {
        return values(IntegrationAccountSkuName.class);
    }
}