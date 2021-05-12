/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VirtualNetworksInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_03_01.VirtualNetworkUsage;

/**
 * Type representing VirtualNetworks.
 */
public interface VirtualNetworks extends SupportsCreating<VirtualNetwork.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<VirtualNetwork>, SupportsListingByResourceGroup<VirtualNetwork>, SupportsListing<VirtualNetwork>, HasInner<VirtualNetworksInner> {
    /**
     * Checks whether a private IP address is available for use.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param ipAddress The private IP address to be verified.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IPAddressAvailabilityResult> checkIPAddressAvailabilityAsync(String resourceGroupName, String virtualNetworkName, String ipAddress);

    /**
     * Lists usage stats.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkUsage> listUsageAsync(final String resourceGroupName, final String virtualNetworkName);

}
