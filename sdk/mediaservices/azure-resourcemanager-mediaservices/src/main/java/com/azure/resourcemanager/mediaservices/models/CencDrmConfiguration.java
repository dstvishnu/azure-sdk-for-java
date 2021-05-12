// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify DRM configurations of CommonEncryptionCenc scheme in Streaming Policy. */
@Fluent
public final class CencDrmConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CencDrmConfiguration.class);

    /*
     * PlayReady configurations
     */
    @JsonProperty(value = "playReady")
    private StreamingPolicyPlayReadyConfiguration playReady;

    /*
     * Widevine configurations
     */
    @JsonProperty(value = "widevine")
    private StreamingPolicyWidevineConfiguration widevine;

    /**
     * Get the playReady property: PlayReady configurations.
     *
     * @return the playReady value.
     */
    public StreamingPolicyPlayReadyConfiguration playReady() {
        return this.playReady;
    }

    /**
     * Set the playReady property: PlayReady configurations.
     *
     * @param playReady the playReady value to set.
     * @return the CencDrmConfiguration object itself.
     */
    public CencDrmConfiguration withPlayReady(StreamingPolicyPlayReadyConfiguration playReady) {
        this.playReady = playReady;
        return this;
    }

    /**
     * Get the widevine property: Widevine configurations.
     *
     * @return the widevine value.
     */
    public StreamingPolicyWidevineConfiguration widevine() {
        return this.widevine;
    }

    /**
     * Set the widevine property: Widevine configurations.
     *
     * @param widevine the widevine value to set.
     * @return the CencDrmConfiguration object itself.
     */
    public CencDrmConfiguration withWidevine(StreamingPolicyWidevineConfiguration widevine) {
        this.widevine = widevine;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (playReady() != null) {
            playReady().validate();
        }
        if (widevine() != null) {
            widevine().validate();
        }
    }
}
