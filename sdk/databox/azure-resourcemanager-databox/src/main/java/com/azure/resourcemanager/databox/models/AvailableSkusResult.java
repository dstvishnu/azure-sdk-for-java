// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.fluent.models.SkuInformationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The available skus operation response. */
@Fluent
public final class AvailableSkusResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableSkusResult.class);

    /*
     * List of available skus.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuInformationInner> value;

    /*
     * Link for the next set of skus.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of available skus.
     *
     * @return the value value.
     */
    public List<SkuInformationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link for the next set of skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for the next set of skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the AvailableSkusResult object itself.
     */
    public AvailableSkusResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
