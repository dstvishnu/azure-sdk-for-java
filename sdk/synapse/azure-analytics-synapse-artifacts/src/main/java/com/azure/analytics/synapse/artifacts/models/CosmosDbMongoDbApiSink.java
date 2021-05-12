// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity sink for a CosmosDB (MongoDB API) database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApiSink")
@Fluent
public final class CosmosDbMongoDbApiSink extends CopySink {
    /*
     * Specifies whether the document with same key to be overwritten (upsert)
     * rather than throw exception (insert). The default value is "insert".
     * Type: string (or Expression with resultType string). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Get the writeBehavior property: Specifies whether the document with same key to be overwritten (upsert) rather
     * than throw exception (insert). The default value is "insert". Type: string (or Expression with resultType
     * string). Type: string (or Expression with resultType string).
     *
     * @return the writeBehavior value.
     */
    public Object getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Specifies whether the document with same key to be overwritten (upsert) rather
     * than throw exception (insert). The default value is "insert". Type: string (or Expression with resultType
     * string). Type: string (or Expression with resultType string).
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the CosmosDbMongoDbApiSink object itself.
     */
    public CosmosDbMongoDbApiSink setWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }
}
