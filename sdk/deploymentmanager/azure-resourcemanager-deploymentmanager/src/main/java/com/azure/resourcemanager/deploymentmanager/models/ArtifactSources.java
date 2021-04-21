// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of ArtifactSources. */
public interface ArtifactSources {
    /**
     * Gets an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    ArtifactSource getByResourceGroup(String resourceGroupName, String artifactSourceName);

    /**
     * Gets an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    Response<ArtifactSource> getByResourceGroupWithResponse(
        String resourceGroupName, String artifactSourceName, Context context);

    /**
     * Deletes an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String artifactSourceName);

    /**
     * Deletes an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String artifactSourceName, Context context);

    /**
     * Lists the artifact sources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of artifact sources.
     */
    List<ArtifactSource> list(String resourceGroupName);

    /**
     * Lists the artifact sources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of artifact sources.
     */
    Response<List<ArtifactSource>> listWithResponse(String resourceGroupName, Context context);

    /**
     * Gets an artifact source.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    ArtifactSource getById(String id);

    /**
     * Gets an artifact source.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    Response<ArtifactSource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an artifact source.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an artifact source.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ArtifactSource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ArtifactSource definition.
     */
    ArtifactSource.DefinitionStages.Blank define(String name);
}