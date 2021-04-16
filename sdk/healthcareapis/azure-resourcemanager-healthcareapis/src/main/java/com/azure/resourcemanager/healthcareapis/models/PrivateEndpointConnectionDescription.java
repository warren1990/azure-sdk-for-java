// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateEndpointConnectionDescriptionInner;

/** An immutable client-side representation of PrivateEndpointConnectionDescription. */
public interface PrivateEndpointConnectionDescription {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the privateEndpoint property: The resource of private end point.
     *
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: A collection of information about the state of the
     * connection between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * Gets the provisioningState property: The provisioning state of the private endpoint connection resource.
     *
     * @return the provisioningState value.
     */
    PrivateEndpointConnectionProvisioningState provisioningState();

    /**
     * Gets the systemData property: System metadata for this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.healthcareapis.fluent.models.PrivateEndpointConnectionDescriptionInner
     * object.
     *
     * @return the inner object.
     */
    PrivateEndpointConnectionDescriptionInner innerModel();

    /** The entirety of the PrivateEndpointConnectionDescription definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PrivateEndpointConnectionDescription definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpointConnectionDescription definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PrivateEndpointConnectionDescription definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the service instance.
             * @param resourceName The name of the service instance.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String resourceName);
        }
        /**
         * The stage of the PrivateEndpointConnectionDescription definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithPrivateLinkServiceConnectionState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateEndpointConnectionDescription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpointConnectionDescription create(Context context);
        }
        /** The stage of the PrivateEndpointConnectionDescription definition allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: The resource of private end point..
             *
             * @param privateEndpoint The resource of private end point.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }
        /**
         * The stage of the PrivateEndpointConnectionDescription definition allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: A collection of information about the state of
             * the connection between service consumer and provider..
             *
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection
             *     between service consumer and provider.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Begins update for the PrivateEndpointConnectionDescription resource.
     *
     * @return the stage of resource update.
     */
    PrivateEndpointConnectionDescription.Update update();

    /** The template for PrivateEndpointConnectionDescription update. */
    interface Update extends UpdateStages.WithPrivateEndpoint, UpdateStages.WithPrivateLinkServiceConnectionState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateEndpointConnectionDescription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpointConnectionDescription apply(Context context);
    }
    /** The PrivateEndpointConnectionDescription update stages. */
    interface UpdateStages {
        /** The stage of the PrivateEndpointConnectionDescription update allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: The resource of private end point..
             *
             * @param privateEndpoint The resource of private end point.
             * @return the next definition stage.
             */
            Update withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }
        /**
         * The stage of the PrivateEndpointConnectionDescription update allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: A collection of information about the state of
             * the connection between service consumer and provider..
             *
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection
             *     between service consumer and provider.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateEndpointConnectionDescription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpointConnectionDescription refresh(Context context);
}