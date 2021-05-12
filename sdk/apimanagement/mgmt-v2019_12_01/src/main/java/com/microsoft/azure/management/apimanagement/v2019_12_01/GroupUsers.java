/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.GroupUsersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GroupUsers.
 */
public interface GroupUsers extends SupportsCreating<GroupUserContract.DefinitionStages.Blank>, HasInner<GroupUsersInner> {
    /**
     * Checks that user entity specified by identifier is associated with the group entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkEntityExistsAsync(String resourceGroupName, String serviceName, String groupId, String userId);

    /**
     * Lists a collection of user entities associated with the group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GroupUserContract> listAsync(final String resourceGroupName, final String serviceName, final String groupId);

    /**
     * Remove existing user from existing group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param groupId Group identifier. Must be unique in the current API Management service instance.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String groupId, String userId);

}
