/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_05_01.SecurityProviderName;
import com.microsoft.azure.management.network.v2020_05_01.SecurityPartnerProviderConnectionStatus;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Security Partner Provider resource.
 */
@JsonFlatten
@SkipParentValidation
public class SecurityPartnerProviderInner extends Resource {
    /**
     * The provisioning state of the Security Partner Provider resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The security provider name. Possible values include: 'ZScaler', 'IBoss',
     * 'Checkpoint'.
     */
    @JsonProperty(value = "properties.securityProviderName")
    private SecurityProviderName securityProviderName;

    /**
     * The connection status with the Security Partner Provider. Possible
     * values include: 'Unknown', 'PartiallyConnected', 'Connected',
     * 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityPartnerProviderConnectionStatus connectionStatus;

    /**
     * The virtualHub to which the Security Partner Provider belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the provisioning state of the Security Partner Provider resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the security provider name. Possible values include: 'ZScaler', 'IBoss', 'Checkpoint'.
     *
     * @return the securityProviderName value
     */
    public SecurityProviderName securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * Set the security provider name. Possible values include: 'ZScaler', 'IBoss', 'Checkpoint'.
     *
     * @param securityProviderName the securityProviderName value to set
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withSecurityProviderName(SecurityProviderName securityProviderName) {
        this.securityProviderName = securityProviderName;
        return this;
    }

    /**
     * Get the connection status with the Security Partner Provider. Possible values include: 'Unknown', 'PartiallyConnected', 'Connected', 'NotConnected'.
     *
     * @return the connectionStatus value
     */
    public SecurityPartnerProviderConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the virtualHub to which the Security Partner Provider belongs.
     *
     * @return the virtualHub value
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub to which the Security Partner Provider belongs.
     *
     * @param virtualHub the virtualHub value to set
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
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
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withId(String id) {
        this.id = id;
        return this;
    }

}
