// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworkRule model. */
@Fluent
public final class VirtualNetworkRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkRule.class);

    /*
     * The action of virtual network rule.
     */
    @JsonProperty(value = "action")
    private Action action;

    /*
     * Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     */
    @JsonProperty(value = "id", required = true)
    private String virtualNetworkResourceId;

    /**
     * Get the action property: The action of virtual network rule.
     *
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: The action of virtual network rule.
     *
     * @param action the action value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get the virtualNetworkResourceId property: Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @return the virtualNetworkResourceId value.
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set the virtualNetworkResourceId property: Resource ID of a subnet, for example:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     *
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkResourceId in model VirtualNetworkRule"));
        }
    }
}