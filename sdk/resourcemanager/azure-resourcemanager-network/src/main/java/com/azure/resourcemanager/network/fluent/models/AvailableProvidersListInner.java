// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AvailableProvidersListCountry;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available countries with details. */
@Fluent
public final class AvailableProvidersListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableProvidersListInner.class);

    /*
     * List of available countries.
     */
    @JsonProperty(value = "countries", required = true)
    private List<AvailableProvidersListCountry> countries;

    /**
     * Get the countries property: List of available countries.
     *
     * @return the countries value.
     */
    public List<AvailableProvidersListCountry> countries() {
        return this.countries;
    }

    /**
     * Set the countries property: List of available countries.
     *
     * @param countries the countries value to set.
     * @return the AvailableProvidersListInner object itself.
     */
    public AvailableProvidersListInner withCountries(List<AvailableProvidersListCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (countries() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property countries in model AvailableProvidersListInner"));
        } else {
            countries().forEach(e -> e.validate());
        }
    }
}
