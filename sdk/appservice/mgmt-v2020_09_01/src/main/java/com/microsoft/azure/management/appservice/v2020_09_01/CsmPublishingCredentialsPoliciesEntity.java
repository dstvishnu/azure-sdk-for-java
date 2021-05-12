/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.CsmPublishingCredentialsPoliciesEntityInner;

/**
 * Type representing CsmPublishingCredentialsPoliciesEntity.
 */
public interface CsmPublishingCredentialsPoliciesEntity extends HasInner<CsmPublishingCredentialsPoliciesEntityInner>, HasManager<AppServiceManager> {
    /**
     * @return the allow value.
     */
    boolean allow();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

}
