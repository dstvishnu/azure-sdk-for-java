// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeNodeIpAddressInner;

/** An immutable client-side representation of IntegrationRuntimeNodeIpAddress. */
public interface IntegrationRuntimeNodeIpAddress {
    /**
     * Gets the ipAddress property: The IP address of self-hosted integration runtime node.
     *
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeNodeIpAddressInner object.
     *
     * @return the inner object.
     */
    IntegrationRuntimeNodeIpAddressInner innerModel();
}
