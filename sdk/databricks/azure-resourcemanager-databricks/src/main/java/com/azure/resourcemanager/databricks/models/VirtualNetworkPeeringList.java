// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.fluent.models.VirtualNetworkPeeringInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Gets all virtual network peerings under a workspace. */
@Fluent
public final class VirtualNetworkPeeringList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkPeeringList.class);

    /*
     * List of virtual network peerings on workspace.
     */
    @JsonProperty(value = "value")
    private List<VirtualNetworkPeeringInner> value;

    /*
     * URL to get the next set of virtual network peering list results if there
     * are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of virtual network peerings on workspace.
     *
     * @return the value value.
     */
    public List<VirtualNetworkPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of virtual network peerings on workspace.
     *
     * @param value the value value to set.
     * @return the VirtualNetworkPeeringList object itself.
     */
    public VirtualNetworkPeeringList withValue(List<VirtualNetworkPeeringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of virtual network peering list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of virtual network peering list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualNetworkPeeringList object itself.
     */
    public VirtualNetworkPeeringList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
