/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientConfiguration for P2S client.
 */
public class VpnClientConfiguration {
    /**
     * The reference to the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * VpnClientRootCertificate for virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRootCertificates")
    private List<VpnClientRootCertificate> vpnClientRootCertificates;

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRevokedCertificates")
    private List<VpnClientRevokedCertificate> vpnClientRevokedCertificates;

    /**
     * VpnClientProtocols for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientProtocols")
    private List<VpnClientProtocol> vpnClientProtocols;

    /**
     * VpnClientIpsecPolicies for virtual network gateway P2S client.
     */
    @JsonProperty(value = "vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /**
     * The radius server address property of the VirtualNetworkGateway resource
     * for vpn client connection.
     */
    @JsonProperty(value = "radiusServerAddress")
    private String radiusServerAddress;

    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn
     * client connection.
     */
    @JsonProperty(value = "radiusServerSecret")
    private String radiusServerSecret;

    /**
     * The radiusServers property for multiple radius server configuration.
     */
    @JsonProperty(value = "radiusServers")
    private List<RadiusServer> radiusServers;

    /**
     * The AADTenant property of the VirtualNetworkGateway resource for vpn
     * client connection used for AAD authentication.
     */
    @JsonProperty(value = "aadTenant")
    private String aadTenant;

    /**
     * The AADAudience property of the VirtualNetworkGateway resource for vpn
     * client connection used for AAD authentication.
     */
    @JsonProperty(value = "aadAudience")
    private String aadAudience;

    /**
     * The AADIssuer property of the VirtualNetworkGateway resource for vpn
     * client connection used for AAD authentication.
     */
    @JsonProperty(value = "aadIssuer")
    private String aadIssuer;

    /**
     * Get the reference to the address space resource which represents Address space for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the reference to the address space resource which represents Address space for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get vpnClientRootCertificate for virtual network gateway.
     *
     * @return the vpnClientRootCertificates value
     */
    public List<VpnClientRootCertificate> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set vpnClientRootCertificate for virtual network gateway.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRootCertificates(List<VpnClientRootCertificate> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get vpnClientRevokedCertificate for Virtual network gateway.
     *
     * @return the vpnClientRevokedCertificates value
     */
    public List<VpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set vpnClientRevokedCertificate for Virtual network gateway.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRevokedCertificates(List<VpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get vpnClientProtocols for Virtual network gateway.
     *
     * @return the vpnClientProtocols value
     */
    public List<VpnClientProtocol> vpnClientProtocols() {
        return this.vpnClientProtocols;
    }

    /**
     * Set vpnClientProtocols for Virtual network gateway.
     *
     * @param vpnClientProtocols the vpnClientProtocols value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientProtocols(List<VpnClientProtocol> vpnClientProtocols) {
        this.vpnClientProtocols = vpnClientProtocols;
        return this;
    }

    /**
     * Get vpnClientIpsecPolicies for virtual network gateway P2S client.
     *
     * @return the vpnClientIpsecPolicies value
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set vpnClientIpsecPolicies for virtual network gateway P2S client.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @return the radiusServerAddress value
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @return the radiusServerSecret value
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the radiusServers property for multiple radius server configuration.
     *
     * @return the radiusServers value
     */
    public List<RadiusServer> radiusServers() {
        return this.radiusServers;
    }

    /**
     * Set the radiusServers property for multiple radius server configuration.
     *
     * @param radiusServers the radiusServers value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServers(List<RadiusServer> radiusServers) {
        this.radiusServers = radiusServers;
        return this;
    }

    /**
     * Get the AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @return the aadTenant value
     */
    public String aadTenant() {
        return this.aadTenant;
    }

    /**
     * Set the AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @param aadTenant the aadTenant value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withAadTenant(String aadTenant) {
        this.aadTenant = aadTenant;
        return this;
    }

    /**
     * Get the AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @return the aadAudience value
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Set the AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @param aadAudience the aadAudience value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withAadAudience(String aadAudience) {
        this.aadAudience = aadAudience;
        return this;
    }

    /**
     * Get the AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @return the aadIssuer value
     */
    public String aadIssuer() {
        return this.aadIssuer;
    }

    /**
     * Set the AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     *
     * @param aadIssuer the aadIssuer value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withAadIssuer(String aadIssuer) {
        this.aadIssuer = aadIssuer;
        return this;
    }

}
