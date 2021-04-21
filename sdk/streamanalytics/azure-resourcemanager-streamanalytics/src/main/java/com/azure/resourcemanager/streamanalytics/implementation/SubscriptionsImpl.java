// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.fluent.SubscriptionsClient;
import com.azure.resourcemanager.streamanalytics.fluent.models.SubscriptionQuotasListResultInner;
import com.azure.resourcemanager.streamanalytics.models.SubscriptionQuotasListResult;
import com.azure.resourcemanager.streamanalytics.models.Subscriptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SubscriptionsImpl implements Subscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionsImpl.class);

    private final SubscriptionsClient innerClient;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    public SubscriptionsImpl(
        SubscriptionsClient innerClient,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SubscriptionQuotasListResult listQuotas(String location) {
        SubscriptionQuotasListResultInner inner = this.serviceClient().listQuotas(location);
        if (inner != null) {
            return new SubscriptionQuotasListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionQuotasListResult> listQuotasWithResponse(String location, Context context) {
        Response<SubscriptionQuotasListResultInner> inner =
            this.serviceClient().listQuotasWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionQuotasListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }
}