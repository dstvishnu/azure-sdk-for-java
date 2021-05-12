/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.implementation.InboundNatRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InboundNatRules.
 */
public interface InboundNatRules extends SupportsCreating<InboundNatRule.DefinitionStages.Blank>, HasInner<InboundNatRulesInner> {
    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InboundNatRule> getAsync(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InboundNatRule> listAsync(final String resourceGroupName, final String loadBalancerName);

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String loadBalancerName, String inboundNatRuleName);

}
