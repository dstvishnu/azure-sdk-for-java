/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Appservice Github token request content.
 */
public class AppserviceGithubTokenRequest {
    /**
     * Code string to exchange for Github Access token.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * State string used for verification.
     */
    @JsonProperty(value = "state", required = true)
    private String state;

    /**
     * Get code string to exchange for Github Access token.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set code string to exchange for Github Access token.
     *
     * @param code the code value to set
     * @return the AppserviceGithubTokenRequest object itself.
     */
    public AppserviceGithubTokenRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get state string used for verification.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set state string used for verification.
     *
     * @param state the state value to set
     * @return the AppserviceGithubTokenRequest object itself.
     */
    public AppserviceGithubTokenRequest withState(String state) {
        this.state = state;
        return this;
    }

}
