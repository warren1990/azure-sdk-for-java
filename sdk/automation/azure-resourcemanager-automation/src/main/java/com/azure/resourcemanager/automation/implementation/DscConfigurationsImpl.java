// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.DscConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.models.DscConfigurationInner;
import com.azure.resourcemanager.automation.models.DscConfiguration;
import com.azure.resourcemanager.automation.models.DscConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DscConfigurationsImpl implements DscConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DscConfigurationsImpl.class);

    private final DscConfigurationsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public DscConfigurationsImpl(
        DscConfigurationsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String automationAccountName, String configurationName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, configurationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String configurationName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, automationAccountName, configurationName, context);
    }

    public DscConfiguration get(String resourceGroupName, String automationAccountName, String configurationName) {
        DscConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, automationAccountName, configurationName);
        if (inner != null) {
            return new DscConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DscConfiguration> getWithResponse(
        String resourceGroupName, String automationAccountName, String configurationName, Context context) {
        Response<DscConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DscConfiguration createOrUpdate(
        String resourceGroupName, String automationAccountName, String configurationName, String parameters) {
        DscConfigurationInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, automationAccountName, configurationName, parameters);
        if (inner != null) {
            return new DscConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DscConfiguration> createOrUpdateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String configurationName,
        String parameters,
        Context context) {
        Response<DscConfigurationInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, configurationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DscConfiguration update(String resourceGroupName, String automationAccountName, String configurationName) {
        DscConfigurationInner inner =
            this.serviceClient().update(resourceGroupName, automationAccountName, configurationName);
        if (inner != null) {
            return new DscConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DscConfiguration> updateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String configurationName,
        String parameters,
        Context context) {
        Response<DscConfigurationInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, automationAccountName, configurationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public String getContent(String resourceGroupName, String automationAccountName, String configurationName) {
        return this.serviceClient().getContent(resourceGroupName, automationAccountName, configurationName);
    }

    public Response<String> getContentWithResponse(
        String resourceGroupName, String automationAccountName, String configurationName, Context context) {
        return this
            .serviceClient()
            .getContentWithResponse(resourceGroupName, automationAccountName, configurationName, context);
    }

    public PagedIterable<DscConfiguration> listByAutomationAccount(
        String resourceGroupName, String automationAccountName) {
        PagedIterable<DscConfigurationInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new DscConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DscConfiguration> listByAutomationAccount(
        String resourceGroupName,
        String automationAccountName,
        String filter,
        Integer skip,
        Integer top,
        String inlinecount,
        Context context) {
        PagedIterable<DscConfigurationInner> inner =
            this
                .serviceClient()
                .listByAutomationAccount(
                    resourceGroupName, automationAccountName, filter, skip, top, inlinecount, context);
        return Utils.mapPage(inner, inner1 -> new DscConfigurationImpl(inner1, this.manager()));
    }

    public DscConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, automationAccountName, configurationName, Context.NONE)
            .getValue();
    }

    public Response<DscConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, configurationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, configurationName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, configurationName, context);
    }

    private DscConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public DscConfigurationImpl define(String name) {
        return new DscConfigurationImpl(name, this.manager());
    }
}