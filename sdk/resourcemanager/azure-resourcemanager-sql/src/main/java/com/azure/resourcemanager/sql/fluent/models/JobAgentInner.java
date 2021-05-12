// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.JobAgentState;
import com.azure.resourcemanager.sql.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Azure SQL job agent. */
@JsonFlatten
@Fluent
public class JobAgentInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobAgentInner.class);

    /*
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource ID of the database to store job metadata in.
     */
    @JsonProperty(value = "properties.databaseId")
    private String databaseId;

    /*
     * The state of the job agent.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private JobAgentState state;

    /**
     * Get the sku property: The name and tier of the SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name and tier of the SKU.
     *
     * @param sku the sku value to set.
     * @return the JobAgentInner object itself.
     */
    public JobAgentInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the databaseId property: Resource ID of the database to store job metadata in.
     *
     * @return the databaseId value.
     */
    public String databaseId() {
        return this.databaseId;
    }

    /**
     * Set the databaseId property: Resource ID of the database to store job metadata in.
     *
     * @param databaseId the databaseId value to set.
     * @return the JobAgentInner object itself.
     */
    public JobAgentInner withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * Get the state property: The state of the job agent.
     *
     * @return the state value.
     */
    public JobAgentState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
