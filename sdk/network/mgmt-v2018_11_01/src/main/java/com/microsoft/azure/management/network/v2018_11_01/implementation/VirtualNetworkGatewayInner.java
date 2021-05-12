/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_11_01.VirtualNetworkGatewayIPConfiguration;
import com.microsoft.azure.management.network.v2018_11_01.VirtualNetworkGatewayType;
import com.microsoft.azure.management.network.v2018_11_01.VpnType;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_11_01.VirtualNetworkGatewaySku;
import com.microsoft.azure.management.network.v2018_11_01.VpnClientConfiguration;
import com.microsoft.azure.management.network.v2018_11_01.BgpSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A common class for general resource information.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkGatewayInner extends Resource {
    /**
     * IP configurations for virtual network gateway.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualNetworkGatewayIPConfiguration> ipConfigurations;

    /**
     * The type of this virtual network gateway. Possible values are: 'Vpn' and
     * 'ExpressRoute'. Possible values include: 'Vpn', 'ExpressRoute'.
     */
    @JsonProperty(value = "properties.gatewayType")
    private VirtualNetworkGatewayType gatewayType;

    /**
     * The type of this virtual network gateway. Possible values are:
     * 'PolicyBased' and 'RouteBased'. Possible values include: 'PolicyBased',
     * 'RouteBased'.
     */
    @JsonProperty(value = "properties.vpnType")
    private VpnType vpnType;

    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /**
     * ActiveActive flag.
     */
    @JsonProperty(value = "properties.activeActive")
    private Boolean activeActive;

    /**
     * The reference of the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of
     * removing existing default site setting.
     */
    @JsonProperty(value = "properties.gatewayDefaultSite")
    private SubResource gatewayDefaultSite;

    /**
     * The reference of the VirtualNetworkGatewaySku resource which represents
     * the SKU selected for Virtual network gateway.
     */
    @JsonProperty(value = "properties.sku")
    private VirtualNetworkGatewaySku sku;

    /**
     * The reference of the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     */
    @JsonProperty(value = "properties.vpnClientConfiguration")
    private VpnClientConfiguration vpnClientConfiguration;

    /**
     * Virtual network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /**
     * The resource GUID property of the VirtualNetworkGateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the VirtualNetworkGateway resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get iP configurations for virtual network gateway.
     *
     * @return the ipConfigurations value
     */
    public List<VirtualNetworkGatewayIPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set iP configurations for virtual network gateway.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withIpConfigurations(List<VirtualNetworkGatewayIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the type of this virtual network gateway. Possible values are: 'Vpn' and 'ExpressRoute'. Possible values include: 'Vpn', 'ExpressRoute'.
     *
     * @return the gatewayType value
     */
    public VirtualNetworkGatewayType gatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the type of this virtual network gateway. Possible values are: 'Vpn' and 'ExpressRoute'. Possible values include: 'Vpn', 'ExpressRoute'.
     *
     * @param gatewayType the gatewayType value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the type of this virtual network gateway. Possible values are: 'PolicyBased' and 'RouteBased'. Possible values include: 'PolicyBased', 'RouteBased'.
     *
     * @return the vpnType value
     */
    public VpnType vpnType() {
        return this.vpnType;
    }

    /**
     * Set the type of this virtual network gateway. Possible values are: 'PolicyBased' and 'RouteBased'. Possible values include: 'PolicyBased', 'RouteBased'.
     *
     * @param vpnType the vpnType value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnType(VpnType vpnType) {
        this.vpnType = vpnType;
        return this;
    }

    /**
     * Get whether BGP is enabled for this virtual network gateway or not.
     *
     * @return the enableBgp value
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set whether BGP is enabled for this virtual network gateway or not.
     *
     * @param enableBgp the enableBgp value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get activeActive flag.
     *
     * @return the activeActive value
     */
    public Boolean activeActive() {
        return this.activeActive;
    }

    /**
     * Set activeActive flag.
     *
     * @param activeActive the activeActive value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withActiveActive(Boolean activeActive) {
        this.activeActive = activeActive;
        return this;
    }

    /**
     * Get the reference of the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @return the gatewayDefaultSite value
     */
    public SubResource gatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the reference of the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @param gatewayDefaultSite the gatewayDefaultSite value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
        return this;
    }

    /**
     * Get the reference of the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     *
     * @return the sku value
     */
    public VirtualNetworkGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the reference of the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     *
     * @param sku the sku value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the reference of the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     *
     * @return the vpnClientConfiguration value
     */
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the reference of the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     *
     * @param vpnClientConfiguration the vpnClientConfiguration value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
        return this;
    }

    /**
     * Get virtual network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set virtual network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resource GUID property of the VirtualNetworkGateway resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the VirtualNetworkGateway resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the VirtualNetworkGateway resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
