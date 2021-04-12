// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.KeysClient;
import com.azure.resourcemanager.automation.fluent.models.KeyListResultInner;
import com.azure.resourcemanager.automation.models.KeyListResult;
import com.azure.resourcemanager.automation.models.Keys;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class KeysImpl implements Keys {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeysImpl.class);

    private final KeysClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public KeysImpl(KeysClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public KeyListResult listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        KeyListResultInner inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        if (inner != null) {
            return new KeyListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<KeyListResult> listByAutomationAccountWithResponse(
        String resourceGroupName, String automationAccountName, Context context) {
        Response<KeyListResultInner> inner =
            this.serviceClient().listByAutomationAccountWithResponse(resourceGroupName, automationAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new KeyListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private KeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}