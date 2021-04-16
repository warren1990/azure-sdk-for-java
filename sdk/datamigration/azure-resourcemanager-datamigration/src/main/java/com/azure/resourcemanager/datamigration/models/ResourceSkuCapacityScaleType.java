// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceSkuCapacityScaleType. */
public final class ResourceSkuCapacityScaleType extends ExpandableStringEnum<ResourceSkuCapacityScaleType> {
    /** Static value Automatic for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType AUTOMATIC = fromString("Automatic");

    /** Static value Manual for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType MANUAL = fromString("Manual");

    /** Static value None for ResourceSkuCapacityScaleType. */
    public static final ResourceSkuCapacityScaleType NONE = fromString("None");

    /**
     * Creates or finds a ResourceSkuCapacityScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceSkuCapacityScaleType.
     */
    @JsonCreator
    public static ResourceSkuCapacityScaleType fromString(String name) {
        return fromString(name, ResourceSkuCapacityScaleType.class);
    }

    /** @return known ResourceSkuCapacityScaleType values. */
    public static Collection<ResourceSkuCapacityScaleType> values() {
        return values(ResourceSkuCapacityScaleType.class);
    }
}