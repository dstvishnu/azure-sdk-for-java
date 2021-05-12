// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A short term retention policy. */
@JsonFlatten
@Fluent
public class ManagedBackupShortTermRetentionPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedBackupShortTermRetentionPolicyInner.class);

    /*
     * The backup retention period in days. This is how many days Point-in-Time
     * Restore will be supported.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Get the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ManagedBackupShortTermRetentionPolicyInner object itself.
     */
    public ManagedBackupShortTermRetentionPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
