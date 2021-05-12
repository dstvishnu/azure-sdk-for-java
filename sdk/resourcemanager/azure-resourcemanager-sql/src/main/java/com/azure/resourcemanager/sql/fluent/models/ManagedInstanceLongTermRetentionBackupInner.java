// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A long term retention backup for a managed database. */
@JsonFlatten
@Immutable
public class ManagedInstanceLongTermRetentionBackupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceLongTermRetentionBackupInner.class);

    /*
     * The managed instance that the backup database belongs to.
     */
    @JsonProperty(value = "properties.managedInstanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String managedInstanceName;

    /*
     * The create time of the instance.
     */
    @JsonProperty(value = "properties.managedInstanceCreateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime managedInstanceCreateTime;

    /*
     * The name of the database the backup belong to
     */
    @JsonProperty(value = "properties.databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The delete time of the database
     */
    @JsonProperty(value = "properties.databaseDeletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime databaseDeletionTime;

    /*
     * The time the backup was taken
     */
    @JsonProperty(value = "properties.backupTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupTime;

    /*
     * The time the long term retention backup will expire.
     */
    @JsonProperty(value = "properties.backupExpirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupExpirationTime;

    /**
     * Get the managedInstanceName property: The managed instance that the backup database belongs to.
     *
     * @return the managedInstanceName value.
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * Get the managedInstanceCreateTime property: The create time of the instance.
     *
     * @return the managedInstanceCreateTime value.
     */
    public OffsetDateTime managedInstanceCreateTime() {
        return this.managedInstanceCreateTime;
    }

    /**
     * Get the databaseName property: The name of the database the backup belong to.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the databaseDeletionTime property: The delete time of the database.
     *
     * @return the databaseDeletionTime value.
     */
    public OffsetDateTime databaseDeletionTime() {
        return this.databaseDeletionTime;
    }

    /**
     * Get the backupTime property: The time the backup was taken.
     *
     * @return the backupTime value.
     */
    public OffsetDateTime backupTime() {
        return this.backupTime;
    }

    /**
     * Get the backupExpirationTime property: The time the long term retention backup will expire.
     *
     * @return the backupExpirationTime value.
     */
    public OffsetDateTime backupExpirationTime() {
        return this.backupExpirationTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
