// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventSubscriptionIdentityType. */
public final class EventSubscriptionIdentityType extends ExpandableStringEnum<EventSubscriptionIdentityType> {
    /** Static value SystemAssigned for EventSubscriptionIdentityType. */
    public static final EventSubscriptionIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for EventSubscriptionIdentityType. */
    public static final EventSubscriptionIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates or finds a EventSubscriptionIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventSubscriptionIdentityType.
     */
    @JsonCreator
    public static EventSubscriptionIdentityType fromString(String name) {
        return fromString(name, EventSubscriptionIdentityType.class);
    }

    /** @return known EventSubscriptionIdentityType values. */
    public static Collection<EventSubscriptionIdentityType> values() {
        return values(EventSubscriptionIdentityType.class);
    }
}