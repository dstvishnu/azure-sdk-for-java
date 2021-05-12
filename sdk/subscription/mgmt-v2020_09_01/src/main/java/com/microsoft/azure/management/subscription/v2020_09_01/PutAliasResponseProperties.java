/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Put subscription creation result properties.
 */
public class PutAliasResponseProperties {
    /**
     * Newly created subscription Id.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Accepted', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get newly created subscription Id.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Accepted', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Accepted', 'Succeeded', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PutAliasResponseProperties object itself.
     */
    public PutAliasResponseProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
