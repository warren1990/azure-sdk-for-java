// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner;
import com.azure.resourcemanager.advisor.models.RecommendationsGenerateResponse;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in RecommendationsClient. */
public interface RecommendationsClient {
    /**
     * Initiates the recommendation generation or computation process for a subscription. This operation is
     * asynchronous. The generated recommendations are stored in a cache in the Advisor service.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void generate();

    /**
     * Initiates the recommendation generation or computation process for a subscription. This operation is
     * asynchronous. The generated recommendations are stored in a cache in the Advisor service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecommendationsGenerateResponse generateWithResponse(Context context);

    /**
     * Retrieves the status of the recommendation computation or generation process. Invoke this API after calling the
     * generation recommendation. The URI of this API is returned in the Location field of the response header.
     *
     * @param operationId The operation ID, which can be found from the Location field in the generate recommendation
     *     response header.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getGenerateStatus(UUID operationId);

    /**
     * Retrieves the status of the recommendation computation or generation process. Invoke this API after calling the
     * generation recommendation. The URI of this API is returned in the Location field of the response header.
     *
     * @param operationId The operation ID, which can be found from the Location field in the generate recommendation
     *     response header.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getGenerateStatusWithResponse(UUID operationId, Context context);

    /**
     * Obtains cached recommendations for a subscription. The recommendations are generated or computed by invoking
     * generateRecommendations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceRecommendationBaseInner> list();

    /**
     * Obtains cached recommendations for a subscription. The recommendations are generated or computed by invoking
     * generateRecommendations.
     *
     * @param filter The filter to apply to the recommendations.&lt;br&gt;Filter can be applied to properties
     *     ['ResourceId', 'ResourceGroup', 'RecommendationTypeGuid', '[Category](#category)'] with operators ['eq',
     *     'and', 'or'].&lt;br&gt;Example:&lt;br&gt;- $filter=Category eq 'Cost' and ResourceGroup eq 'MyResourceGroup'.
     * @param top The number of recommendations per page if a paged version of this API is being used.
     * @param skipToken The page-continuation token to use with a paged version of this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceRecommendationBaseInner> list(String filter, Integer top, String skipToken, Context context);

    /**
     * Obtains details of a cached recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return advisor Recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceRecommendationBaseInner get(String resourceUri, String recommendationId);

    /**
     * Obtains details of a cached recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return advisor Recommendation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceRecommendationBaseInner> getWithResponse(
        String resourceUri, String recommendationId, Context context);
}