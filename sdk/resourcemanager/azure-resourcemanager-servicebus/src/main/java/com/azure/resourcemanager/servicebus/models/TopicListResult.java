// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.fluent.inner.TopicResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TopicListResult model. */
@Fluent
public final class TopicListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopicListResult.class);

    /*
     * Result of the List Topics operation.
     */
    @JsonProperty(value = "value")
    private List<TopicResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of topics.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Topics operation.
     *
     * @return the value value.
     */
    public List<TopicResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Topics operation.
     *
     * @param value the value value to set.
     * @return the TopicListResult object itself.
     */
    public TopicListResult withValue(List<TopicResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * topics.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * topics.
     *
     * @param nextLink the nextLink value to set.
     * @return the TopicListResult object itself.
     */
    public TopicListResult withNextLink(String nextLink) {
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