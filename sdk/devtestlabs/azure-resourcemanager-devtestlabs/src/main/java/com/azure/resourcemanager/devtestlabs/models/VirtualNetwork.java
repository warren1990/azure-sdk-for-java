// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.VirtualNetworkInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualNetwork. */
public interface VirtualNetwork {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the allowedSubnets property: The allowed subnets of the virtual network.
     *
     * @return the allowedSubnets value.
     */
    List<Subnet> allowedSubnets();

    /**
     * Gets the description property: The description of the virtual network.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the externalProviderResourceId property: The Microsoft.Network resource identifier of the virtual network.
     *
     * @return the externalProviderResourceId value.
     */
    String externalProviderResourceId();

    /**
     * Gets the externalSubnets property: The external subnet properties.
     *
     * @return the externalSubnets value.
     */
    List<ExternalSubnet> externalSubnets();

    /**
     * Gets the subnetOverrides property: The subnet overrides of the virtual network.
     *
     * @return the subnetOverrides value.
     */
    List<SubnetOverride> subnetOverrides();

    /**
     * Gets the createdDate property: The creation date of the virtual network.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.VirtualNetworkInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkInner innerModel();

    /** The entirety of the VirtualNetwork definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The VirtualNetwork definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualNetwork definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualNetwork definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the VirtualNetwork definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }
        /**
         * The stage of the VirtualNetwork definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithAllowedSubnets,
                DefinitionStages.WithDescription,
                DefinitionStages.WithExternalProviderResourceId,
                DefinitionStages.WithSubnetOverrides {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualNetwork create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetwork create(Context context);
        }
        /** The stage of the VirtualNetwork definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualNetwork definition allowing to specify allowedSubnets. */
        interface WithAllowedSubnets {
            /**
             * Specifies the allowedSubnets property: The allowed subnets of the virtual network..
             *
             * @param allowedSubnets The allowed subnets of the virtual network.
             * @return the next definition stage.
             */
            WithCreate withAllowedSubnets(List<Subnet> allowedSubnets);
        }
        /** The stage of the VirtualNetwork definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of the virtual network..
             *
             * @param description The description of the virtual network.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the VirtualNetwork definition allowing to specify externalProviderResourceId. */
        interface WithExternalProviderResourceId {
            /**
             * Specifies the externalProviderResourceId property: The Microsoft.Network resource identifier of the
             * virtual network..
             *
             * @param externalProviderResourceId The Microsoft.Network resource identifier of the virtual network.
             * @return the next definition stage.
             */
            WithCreate withExternalProviderResourceId(String externalProviderResourceId);
        }
        /** The stage of the VirtualNetwork definition allowing to specify subnetOverrides. */
        interface WithSubnetOverrides {
            /**
             * Specifies the subnetOverrides property: The subnet overrides of the virtual network..
             *
             * @param subnetOverrides The subnet overrides of the virtual network.
             * @return the next definition stage.
             */
            WithCreate withSubnetOverrides(List<SubnetOverride> subnetOverrides);
        }
    }
    /**
     * Begins update for the VirtualNetwork resource.
     *
     * @return the stage of resource update.
     */
    VirtualNetwork.Update update();

    /** The template for VirtualNetwork update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualNetwork apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetwork apply(Context context);
    }
    /** The VirtualNetwork update stages. */
    interface UpdateStages {
        /** The stage of the VirtualNetwork update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualNetwork refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetwork refresh(Context context);
}