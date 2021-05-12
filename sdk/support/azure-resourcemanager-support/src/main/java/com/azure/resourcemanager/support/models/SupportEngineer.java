// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Support engineer information. */
@Immutable
public final class SupportEngineer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SupportEngineer.class);

    /*
     * Email address of the Azure Support engineer assigned to the support
     * ticket.
     */
    @JsonProperty(value = "emailAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String emailAddress;

    /**
     * Get the emailAddress property: Email address of the Azure Support engineer assigned to the support ticket.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
