/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.signalr.v2020_05_01.implementation.SignalRPrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SignalRPrivateEndpointConnections.
 */
public interface SignalRPrivateEndpointConnections extends HasInner<SignalRPrivateEndpointConnectionsInner> {
    /**
     * Get the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> getAsync(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Delete the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

}
