// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.models.ManagedIdentity;
import com.azure.resourcemanager.signalr.models.ProvisioningState;
import com.azure.resourcemanager.signalr.models.ResourceSku;
import com.azure.resourcemanager.signalr.models.ServerlessUpstreamSettings;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRCorsSettings;
import com.azure.resourcemanager.signalr.models.SignalRFeature;
import com.azure.resourcemanager.signalr.models.SignalRNetworkACLs;
import com.azure.resourcemanager.signalr.models.SignalRTlsSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A class represent a resource. */
@JsonFlatten
@Fluent
public class SignalRResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignalRResourceInner.class);

    /*
     * The billing information of the resource.(e.g. Free, Standard)
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * The kind of the service - e.g. "SignalR" for
     * "Microsoft.SignalRService/SignalR"
     */
    @JsonProperty(value = "kind")
    private ServiceKind kind;

    /*
     * The managed identity response
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The publicly accessible IP of the resource.
     */
    @JsonProperty(value = "properties.externalIP", access = JsonProperty.Access.WRITE_ONLY)
    private String externalIp;

    /*
     * FQDN of the service instance.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The publicly accessible port of the resource which is designed for
     * browser/client side usage.
     */
    @JsonProperty(value = "properties.publicPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer publicPort;

    /*
     * The publicly accessible port of the resource which is designed for
     * customer server side usage.
     */
    @JsonProperty(value = "properties.serverPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverPort;

    /*
     * Version of the resource. Probably you need the same or higher version of
     * client SDKs.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Private endpoint connections to the resource.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /*
     * TLS settings.
     */
    @JsonProperty(value = "properties.tls")
    private SignalRTlsSettings tls;

    /*
     * List of the featureFlags.
     *
     * FeatureFlags that are not included in the parameters for the update
     * operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value
     * will be used
     * But keep in mind, the default value doesn't mean "false". It varies in
     * terms of different FeatureFlags.
     */
    @JsonProperty(value = "properties.features")
    private List<SignalRFeature> features;

    /*
     * Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "properties.cors")
    private SignalRCorsSettings cors;

    /*
     * Upstream settings when the service is in server-less mode.
     */
    @JsonProperty(value = "properties.upstream")
    private ServerlessUpstreamSettings upstream;

    /*
     * Network ACLs
     */
    @JsonProperty(value = "properties.networkACLs")
    private SignalRNetworkACLs networkACLs;

    /**
     * Get the sku property: The billing information of the resource.(e.g. Free, Standard).
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The billing information of the resource.(e.g. Free, Standard).
     *
     * @param sku the sku value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: The kind of the service - e.g. "SignalR" for "Microsoft.SignalRService/SignalR".
     *
     * @return the kind value.
     */
    public ServiceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the service - e.g. "SignalR" for "Microsoft.SignalRService/SignalR".
     *
     * @param kind the kind value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withKind(ServiceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: The managed identity response.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity response.
     *
     * @param identity the identity value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the externalIp property: The publicly accessible IP of the resource.
     *
     * @return the externalIp value.
     */
    public String externalIp() {
        return this.externalIp;
    }

    /**
     * Get the hostname property: FQDN of the service instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the publicPort property: The publicly accessible port of the resource which is designed for browser/client
     * side usage.
     *
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Get the serverPort property: The publicly accessible port of the resource which is designed for customer server
     * side usage.
     *
     * @return the serverPort value.
     */
    public Integer serverPort() {
        return this.serverPort;
    }

    /**
     * Get the version property: Version of the resource. Probably you need the same or higher version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections to the resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Get the tls property: TLS settings.
     *
     * @return the tls value.
     */
    public SignalRTlsSettings tls() {
        return this.tls;
    }

    /**
     * Set the tls property: TLS settings.
     *
     * @param tls the tls value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withTls(SignalRTlsSettings tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Get the features property: List of the featureFlags.
     *
     * <p>FeatureFlags that are not included in the parameters for the update operation will not be modified. And the
     * response will only include featureFlags that are explicitly set. When a featureFlag is not explicitly set, its
     * globally default value will be used But keep in mind, the default value doesn't mean "false". It varies in terms
     * of different FeatureFlags.
     *
     * @return the features value.
     */
    public List<SignalRFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: List of the featureFlags.
     *
     * <p>FeatureFlags that are not included in the parameters for the update operation will not be modified. And the
     * response will only include featureFlags that are explicitly set. When a featureFlag is not explicitly set, its
     * globally default value will be used But keep in mind, the default value doesn't mean "false". It varies in terms
     * of different FeatureFlags.
     *
     * @param features the features value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withFeatures(List<SignalRFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the cors property: Cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value.
     */
    public SignalRCorsSettings cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Cross-Origin Resource Sharing (CORS) settings.
     *
     * @param cors the cors value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withCors(SignalRCorsSettings cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the upstream property: Upstream settings when the service is in server-less mode.
     *
     * @return the upstream value.
     */
    public ServerlessUpstreamSettings upstream() {
        return this.upstream;
    }

    /**
     * Set the upstream property: Upstream settings when the service is in server-less mode.
     *
     * @param upstream the upstream value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withUpstream(ServerlessUpstreamSettings upstream) {
        this.upstream = upstream;
        return this;
    }

    /**
     * Get the networkACLs property: Network ACLs.
     *
     * @return the networkACLs value.
     */
    public SignalRNetworkACLs networkACLs() {
        return this.networkACLs;
    }

    /**
     * Set the networkACLs property: Network ACLs.
     *
     * @param networkACLs the networkACLs value to set.
     * @return the SignalRResourceInner object itself.
     */
    public SignalRResourceInner withNetworkACLs(SignalRNetworkACLs networkACLs) {
        this.networkACLs = networkACLs;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SignalRResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SignalRResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
        if (tls() != null) {
            tls().validate();
        }
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
        if (cors() != null) {
            cors().validate();
        }
        if (upstream() != null) {
            upstream().validate();
        }
        if (networkACLs() != null) {
            networkACLs().validate();
        }
    }
}