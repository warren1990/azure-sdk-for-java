// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.marketplaceordering.fluent.MarketplaceAgreementsClient;
import com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner;
import com.azure.resourcemanager.marketplaceordering.models.AgreementTerms;
import com.azure.resourcemanager.marketplaceordering.models.MarketplaceAgreements;
import com.azure.resourcemanager.marketplaceordering.models.OfferType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class MarketplaceAgreementsImpl implements MarketplaceAgreements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarketplaceAgreementsImpl.class);

    private final MarketplaceAgreementsClient innerClient;

    private final com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager serviceManager;

    public MarketplaceAgreementsImpl(
        MarketplaceAgreementsClient innerClient,
        com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AgreementTerms get(OfferType offerType, String publisherId, String offerId, String planId) {
        AgreementTermsInner inner = this.serviceClient().get(offerType, publisherId, offerId, planId);
        if (inner != null) {
            return new AgreementTermsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AgreementTerms> getWithResponse(
        OfferType offerType, String publisherId, String offerId, String planId, Context context) {
        Response<AgreementTermsInner> inner =
            this.serviceClient().getWithResponse(offerType, publisherId, offerId, planId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgreementTermsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AgreementTerms create(
        OfferType offerType, String publisherId, String offerId, String planId, AgreementTermsInner parameters) {
        AgreementTermsInner inner = this.serviceClient().create(offerType, publisherId, offerId, planId, parameters);
        if (inner != null) {
            return new AgreementTermsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AgreementTerms> createWithResponse(
        OfferType offerType,
        String publisherId,
        String offerId,
        String planId,
        AgreementTermsInner parameters,
        Context context) {
        Response<AgreementTermsInner> inner =
            this.serviceClient().createWithResponse(offerType, publisherId, offerId, planId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgreementTermsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AgreementTerms sign(String publisherId, String offerId, String planId) {
        AgreementTermsInner inner = this.serviceClient().sign(publisherId, offerId, planId);
        if (inner != null) {
            return new AgreementTermsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AgreementTerms> signWithResponse(
        String publisherId, String offerId, String planId, Context context) {
        Response<AgreementTermsInner> inner =
            this.serviceClient().signWithResponse(publisherId, offerId, planId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgreementTermsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AgreementTerms cancel(String publisherId, String offerId, String planId) {
        AgreementTermsInner inner = this.serviceClient().cancel(publisherId, offerId, planId);
        if (inner != null) {
            return new AgreementTermsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AgreementTerms> cancelWithResponse(
        String publisherId, String offerId, String planId, Context context) {
        Response<AgreementTermsInner> inner =
            this.serviceClient().cancelWithResponse(publisherId, offerId, planId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgreementTermsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AgreementTerms getAgreement(String publisherId, String offerId, String planId) {
        AgreementTermsInner inner = this.serviceClient().getAgreement(publisherId, offerId, planId);
        if (inner != null) {
            return new AgreementTermsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AgreementTerms> getAgreementWithResponse(
        String publisherId, String offerId, String planId, Context context) {
        Response<AgreementTermsInner> inner =
            this.serviceClient().getAgreementWithResponse(publisherId, offerId, planId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgreementTermsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public List<AgreementTerms> list() {
        List<AgreementTermsInner> inner = this.serviceClient().list();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new AgreementTermsImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<AgreementTerms>> listWithResponse(Context context) {
        Response<List<AgreementTermsInner>> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new AgreementTermsImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private MarketplaceAgreementsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager manager() {
        return this.serviceManager;
    }
}