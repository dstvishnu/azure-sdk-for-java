// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The connection info for the given notebook workspace. */
@Immutable
public final class NotebookWorkspaceConnectionInfoResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotebookWorkspaceConnectionInfoResultInner.class);

    /*
     * Specifies auth token used for connecting to Notebook server (uses
     * token-based auth).
     */
    @JsonProperty(value = "authToken", access = JsonProperty.Access.WRITE_ONLY)
    private String authToken;

    /*
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /**
     * Get the authToken property: Specifies auth token used for connecting to Notebook server (uses token-based auth).
     *
     * @return the authToken value.
     */
    public String authToken() {
        return this.authToken;
    }

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
