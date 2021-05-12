/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Qos Traffic Profiler IP Range properties.
 */
public class QosIpRange {
    /**
     * Start IP Address.
     */
    @JsonProperty(value = "startIP")
    private String startIP;

    /**
     * End IP Address.
     */
    @JsonProperty(value = "endIP")
    private String endIP;

    /**
     * Get start IP Address.
     *
     * @return the startIP value
     */
    public String startIP() {
        return this.startIP;
    }

    /**
     * Set start IP Address.
     *
     * @param startIP the startIP value to set
     * @return the QosIpRange object itself.
     */
    public QosIpRange withStartIP(String startIP) {
        this.startIP = startIP;
        return this;
    }

    /**
     * Get end IP Address.
     *
     * @return the endIP value
     */
    public String endIP() {
        return this.endIP;
    }

    /**
     * Set end IP Address.
     *
     * @param endIP the endIP value to set
     * @return the QosIpRange object itself.
     */
    public QosIpRange withEndIP(String endIP) {
        this.endIP = endIP;
        return this;
    }

}
