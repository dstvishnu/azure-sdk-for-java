/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.AzureReachabilityReportInner;
import java.util.List;

/**
 * Type representing AzureReachabilityReport.
 */
public interface AzureReachabilityReport extends HasInner<AzureReachabilityReportInner>, HasManager<NetworkManager> {
    /**
     * @return the aggregationLevel value.
     */
    String aggregationLevel();

    /**
     * @return the providerLocation value.
     */
    AzureReachabilityReportLocation providerLocation();

    /**
     * @return the reachabilityReport value.
     */
    List<AzureReachabilityReportItem> reachabilityReport();

}
