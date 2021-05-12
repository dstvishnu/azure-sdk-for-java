/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the source of connection monitor.
 */
public class ConnectionMonitorSource {
    /**
     * The ID of the resource used as the source by connection monitor.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * The source port used by connection monitor.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the ID of the resource used as the source by connection monitor.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the ID of the resource used as the source by connection monitor.
     *
     * @param resourceId the resourceId value to set
     * @return the ConnectionMonitorSource object itself.
     */
    public ConnectionMonitorSource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the source port used by connection monitor.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the source port used by connection monitor.
     *
     * @param port the port value to set
     * @return the ConnectionMonitorSource object itself.
     */
    public ConnectionMonitorSource withPort(Integer port) {
        this.port = port;
        return this;
    }

}
