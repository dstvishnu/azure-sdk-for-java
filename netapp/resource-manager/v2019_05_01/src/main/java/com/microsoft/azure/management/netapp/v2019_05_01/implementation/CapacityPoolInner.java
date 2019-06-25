/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_05_01.implementation;

import com.microsoft.azure.management.netapp.v2019_05_01.ServiceLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Capacity pool resource.
 */
@JsonFlatten
public class CapacityPoolInner extends Resource {
    /**
     * poolId.
     * UUID v4 used to identify the Pool.
     */
    @JsonProperty(value = "properties.poolId", access = JsonProperty.Access.WRITE_ONLY)
    private String poolId;

    /**
     * size.
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB
     * chunks (value must be multiply of 4398046511104).
     */
    @JsonProperty(value = "properties.size")
    private Long size;

    /**
     * serviceLevel.
     * The service level of the file system. Possible values include:
     * 'Standard', 'Premium', 'Ultra'.
     */
    @JsonProperty(value = "properties.serviceLevel")
    private ServiceLevel serviceLevel;

    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get uUID v4 used to identify the Pool.
     *
     * @return the poolId value
     */
    public String poolId() {
        return this.poolId;
    }

    /**
     * Get provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     *
     * @param size the size value to set
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @return the serviceLevel value
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'.
     *
     * @param serviceLevel the serviceLevel value to set
     * @return the CapacityPoolInner object itself.
     */
    public CapacityPoolInner withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
