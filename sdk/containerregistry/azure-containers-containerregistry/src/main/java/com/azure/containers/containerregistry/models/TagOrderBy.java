// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TagOrderBy. */
public final class TagOrderBy extends ExpandableStringEnum<TagOrderBy> {
    /** Static value timedesc for TagOrderBy. */
    public static final TagOrderBy LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /** Static value timeasc for TagOrderBy. */
    public static final TagOrderBy LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates or finds a TagOrderBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TagOrderBy.
     */
    @JsonCreator
    public static TagOrderBy fromString(String name) {
        return fromString(name, TagOrderBy.class);
    }

    /** @return known TagOrderBy values. */
    public static Collection<TagOrderBy> values() {
        return values(TagOrderBy.class);
    }
}