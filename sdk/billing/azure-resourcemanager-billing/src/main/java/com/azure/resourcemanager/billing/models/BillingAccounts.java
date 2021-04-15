// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BillingAccounts. */
public interface BillingAccounts {
    /**
     * Lists the billing accounts that a user has access to.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing accounts.
     */
    PagedIterable<BillingAccount> list();

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
    PagedIterable<BillingAccount> list(String expand, Context context);

    /**
     * Gets a billing account by its ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing account by its ID.
     */
    BillingAccount get(String billingAccountName);

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
    Response<BillingAccount> getWithResponse(String billingAccountName, String expand, Context context);

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
    BillingAccount update(String billingAccountName, BillingAccountUpdateRequest parameters);

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
    BillingAccount update(String billingAccountName, BillingAccountUpdateRequest parameters, Context context);

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
    PagedIterable<InvoiceSectionWithCreateSubPermission> listInvoiceSectionsByCreateSubscriptionPermission(
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
    PagedIterable<InvoiceSectionWithCreateSubPermission> listInvoiceSectionsByCreateSubscriptionPermission(
        String billingAccountName, Context context);
}