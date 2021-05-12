/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AutoscaleSettings model.
 */
public class AutoscaleSettings {
    /**
     * Represents maximum throughput, the resource can scale up to.
     */
    @JsonProperty(value = "maxThroughput")
    private Integer maxThroughput;

    /**
     * Get represents maximum throughput, the resource can scale up to.
     *
     * @return the maxThroughput value
     */
    public Integer maxThroughput() {
        return this.maxThroughput;
    }

    /**
     * Set represents maximum throughput, the resource can scale up to.
     *
     * @param maxThroughput the maxThroughput value to set
     * @return the AutoscaleSettings object itself.
     */
    public AutoscaleSettings withMaxThroughput(Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
        return this;
    }

}
