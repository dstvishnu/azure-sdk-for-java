/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters of move resources.
 */
public class ResourcesMoveInfo {
    /**
     * The IDs of the resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * The target resource group.
     */
    @JsonProperty(value = "targetResourceGroup")
    private String targetResourceGroup;

    /**
     * Get the IDs of the resources.
     *
     * @return the resources value
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the IDs of the resources.
     *
     * @param resources the resources value to set
     * @return the ResourcesMoveInfo object itself.
     */
    public ResourcesMoveInfo withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the target resource group.
     *
     * @return the targetResourceGroup value
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the target resource group.
     *
     * @param targetResourceGroup the targetResourceGroup value to set
     * @return the ResourcesMoveInfo object itself.
     */
    public ResourcesMoveInfo withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

}
