// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.PolicyInner;
import com.azure.resourcemanager.billing.models.MarketplacePurchasesPolicy;
import com.azure.resourcemanager.billing.models.Policy;
import com.azure.resourcemanager.billing.models.ReservationPurchasesPolicy;
import com.azure.resourcemanager.billing.models.ViewChargesPolicy;

public final class PolicyImpl implements Policy {
    private PolicyInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    PolicyImpl(PolicyInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public MarketplacePurchasesPolicy marketplacePurchases() {
        return this.innerModel().marketplacePurchases();
    }

    public ReservationPurchasesPolicy reservationPurchases() {
        return this.innerModel().reservationPurchases();
    }

    public ViewChargesPolicy viewCharges() {
        return this.innerModel().viewCharges();
    }

    public PolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}