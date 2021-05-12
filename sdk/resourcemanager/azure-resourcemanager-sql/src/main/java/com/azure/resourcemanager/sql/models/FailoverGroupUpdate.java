// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A failover group update request. */
@JsonFlatten
@Fluent
public class FailoverGroupUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FailoverGroupUpdate.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Read-write endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readWriteEndpoint")
    private FailoverGroupReadWriteEndpoint readWriteEndpoint;

    /*
     * Read-only endpoint of the failover group instance.
     */
    @JsonProperty(value = "properties.readOnlyEndpoint")
    private FailoverGroupReadOnlyEndpoint readOnlyEndpoint;

    /*
     * List of databases in the failover group.
     */
    @JsonProperty(value = "properties.databases")
    private List<String> databases;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the FailoverGroupUpdate object itself.
     */
    public FailoverGroupUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @return the readWriteEndpoint value.
     */
    public FailoverGroupReadWriteEndpoint readWriteEndpoint() {
        return this.readWriteEndpoint;
    }

    /**
     * Set the readWriteEndpoint property: Read-write endpoint of the failover group instance.
     *
     * @param readWriteEndpoint the readWriteEndpoint value to set.
     * @return the FailoverGroupUpdate object itself.
     */
    public FailoverGroupUpdate withReadWriteEndpoint(FailoverGroupReadWriteEndpoint readWriteEndpoint) {
        this.readWriteEndpoint = readWriteEndpoint;
        return this;
    }

    /**
     * Get the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @return the readOnlyEndpoint value.
     */
    public FailoverGroupReadOnlyEndpoint readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }

    /**
     * Set the readOnlyEndpoint property: Read-only endpoint of the failover group instance.
     *
     * @param readOnlyEndpoint the readOnlyEndpoint value to set.
     * @return the FailoverGroupUpdate object itself.
     */
    public FailoverGroupUpdate withReadOnlyEndpoint(FailoverGroupReadOnlyEndpoint readOnlyEndpoint) {
        this.readOnlyEndpoint = readOnlyEndpoint;
        return this;
    }

    /**
     * Get the databases property: List of databases in the failover group.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: List of databases in the failover group.
     *
     * @param databases the databases value to set.
     * @return the FailoverGroupUpdate object itself.
     */
    public FailoverGroupUpdate withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (readWriteEndpoint() != null) {
            readWriteEndpoint().validate();
        }
        if (readOnlyEndpoint() != null) {
            readOnlyEndpoint().validate();
        }
    }
}
