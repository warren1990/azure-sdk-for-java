// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Returns all active and completed jobs in a subscription.
     *
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list jobs response.
     */
    PagedIterable<JobResponse> list();

    /**
     * Returns all active and completed jobs in a subscription.
     *
     * @param top An integer value that specifies how many jobs at most should be returned. The value cannot exceed 100.
     * @param filter Can be used to restrict the results to certain conditions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list jobs response.
     */
    PagedIterable<JobResponse> list(Long top, String filter, Context context);

    /**
     * Returns all active and completed jobs in a resource group.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list jobs response.
     */
    PagedIterable<JobResponse> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all active and completed jobs in a resource group.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param top An integer value that specifies how many jobs at most should be returned. The value cannot exceed 100.
     * @param filter Can be used to restrict the results to certain conditions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list jobs response.
     */
    PagedIterable<JobResponse> listByResourceGroup(String resourceGroupName, Long top, String filter, Context context);

    /**
     * Gets information about an existing job.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param jobName The name of the import/export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an existing job.
     */
    JobResponse getByResourceGroup(String resourceGroupName, String jobName);

    /**
     * Gets information about an existing job.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param jobName The name of the import/export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an existing job.
     */
    Response<JobResponse> getByResourceGroupWithResponse(String resourceGroupName, String jobName, Context context);

    /**
     * Deletes an existing job. Only jobs in the Creating or Completed states can be deleted.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param jobName The name of the import/export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String jobName);

    /**
     * Deletes an existing job. Only jobs in the Creating or Completed states can be deleted.
     *
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param jobName The name of the import/export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String jobName, Context context);

    /**
     * Gets information about an existing job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an existing job.
     */
    JobResponse getById(String id);

    /**
     * Gets information about an existing job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an existing job.
     */
    Response<JobResponse> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing job. Only jobs in the Creating or Completed states can be deleted.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing job. Only jobs in the Creating or Completed states can be deleted.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storageimportexport.models.ErrorResponseException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new JobResponse resource.
     *
     * @param name resource name.
     * @return the first stage of the new JobResponse definition.
     */
    JobResponse.DefinitionStages.Blank define(String name);
}