// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.billing.fluent.models.BillingAccountInner;
import com.azure.resourcemanager.billing.fluent.models.InvoiceSectionWithCreateSubPermissionInner;
import com.azure.resourcemanager.billing.models.BillingAccountUpdateRequest;

/** An instance of this class provides access to all the operations defined in BillingAccountsClient. */
public interface BillingAccountsClient {
    /**
     * Lists the billing accounts that a user has access to.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing accounts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingAccountInner> list();

    /**
     * Lists the billing accounts that a user has access to.
     *
     * @param expand May be used to expand the soldTo, invoice sections and billing profiles.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing accounts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingAccountInner> list(String expand, Context context);

    /**
     * Gets a billing account by its ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account by its ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingAccountInner get(String billingAccountName);

    /**
     * Gets a billing account by its ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the soldTo, invoice sections and billing profiles.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account by its ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingAccountInner> getWithResponse(String billingAccountName, String expand, Context context);

    /**
     * Updates the properties of a billing account. Currently, displayName and address can be updated. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the update billing account operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BillingAccountInner>, BillingAccountInner> beginUpdate(
        String billingAccountName, BillingAccountUpdateRequest parameters);

    /**
     * Updates the properties of a billing account. Currently, displayName and address can be updated. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the update billing account operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BillingAccountInner>, BillingAccountInner> beginUpdate(
        String billingAccountName, BillingAccountUpdateRequest parameters, Context context);

    /**
     * Updates the properties of a billing account. Currently, displayName and address can be updated. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the update billing account operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingAccountInner update(String billingAccountName, BillingAccountUpdateRequest parameters);

    /**
     * Updates the properties of a billing account. Currently, displayName and address can be updated. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the update billing account operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingAccountInner update(String billingAccountName, BillingAccountUpdateRequest parameters, Context context);

    /**
     * Lists the invoice sections for which the user has permission to create Azure subscriptions. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoice section properties with create subscription permission.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InvoiceSectionWithCreateSubPermissionInner> listInvoiceSectionsByCreateSubscriptionPermission(
        String billingAccountName);

    /**
     * Lists the invoice sections for which the user has permission to create Azure subscriptions. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoice section properties with create subscription permission.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InvoiceSectionWithCreateSubPermissionInner> listInvoiceSectionsByCreateSubscriptionPermission(
        String billingAccountName, Context context);
}