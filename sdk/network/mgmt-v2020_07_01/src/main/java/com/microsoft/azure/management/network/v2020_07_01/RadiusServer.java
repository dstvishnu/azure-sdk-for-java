/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Radius Server Settings.
 */
public class RadiusServer {
    /**
     * The address of this radius server.
     */
    @JsonProperty(value = "radiusServerAddress", required = true)
    private String radiusServerAddress;

    /**
     * The initial score assigned to this radius server.
     */
    @JsonProperty(value = "radiusServerScore")
    private Long radiusServerScore;

    /**
     * The secret used for this radius server.
     */
    @JsonProperty(value = "radiusServerSecret")
    private String radiusServerSecret;

    /**
     * Get the address of this radius server.
     *
     * @return the radiusServerAddress value
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the address of this radius server.
     *
     * @param radiusServerAddress the radiusServerAddress value to set
     * @return the RadiusServer object itself.
     */
    public RadiusServer withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the initial score assigned to this radius server.
     *
     * @return the radiusServerScore value
     */
    public Long radiusServerScore() {
        return this.radiusServerScore;
    }

    /**
     * Set the initial score assigned to this radius server.
     *
     * @param radiusServerScore the radiusServerScore value to set
     * @return the RadiusServer object itself.
     */
    public RadiusServer withRadiusServerScore(Long radiusServerScore) {
        this.radiusServerScore = radiusServerScore;
        return this;
    }

    /**
     * Get the secret used for this radius server.
     *
     * @return the radiusServerSecret value
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the secret used for this radius server.
     *
     * @param radiusServerSecret the radiusServerSecret value to set
     * @return the RadiusServer object itself.
     */
    public RadiusServer withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

}
