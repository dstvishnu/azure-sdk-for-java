// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SyncType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the source control sync job. */
@JsonFlatten
@Fluent
public class SourceControlSyncJobByIdInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlSyncJobByIdInner.class);

    /*
     * The id of the job.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The source control sync job id.
     */
    @JsonProperty(value = "properties.sourceControlSyncJobId")
    private String sourceControlSyncJobId;

    /*
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The provisioning state of the job.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The start time of the job.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time of the job.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The sync type.
     */
    @JsonProperty(value = "properties.syncType")
    private SyncType syncType;

    /*
     * The exceptions that occurred while running the sync job.
     */
    @JsonProperty(value = "properties.exception")
    private String exception;

    /**
     * Get the id property: The id of the job.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the job.
     *
     * @param id the id value to set.
     * @return the SourceControlSyncJobByIdInner object itself.
     */
    public SourceControlSyncJobByIdInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sourceControlSyncJobId property: The source control sync job id.
     *
     * @return the sourceControlSyncJobId value.
     */
    public String sourceControlSyncJobId() {
        return this.sourceControlSyncJobId;
    }

    /**
     * Set the sourceControlSyncJobId property: The source control sync job id.
     *
     * @param sourceControlSyncJobId the sourceControlSyncJobId value to set.
     * @return the SourceControlSyncJobByIdInner object itself.
     */
    public SourceControlSyncJobByIdInner withSourceControlSyncJobId(String sourceControlSyncJobId) {
        this.sourceControlSyncJobId = sourceControlSyncJobId;
        return this;
    }

    /**
     * Get the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState property: The provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the job.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SourceControlSyncJobByIdInner object itself.
     */
    public SourceControlSyncJobByIdInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the startTime property: The start time of the job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the job.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the syncType property: The sync type.
     *
     * @return the syncType value.
     */
    public SyncType syncType() {
        return this.syncType;
    }

    /**
     * Set the syncType property: The sync type.
     *
     * @param syncType the syncType value to set.
     * @return the SourceControlSyncJobByIdInner object itself.
     */
    public SourceControlSyncJobByIdInner withSyncType(SyncType syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * Get the exception property: The exceptions that occurred while running the sync job.
     *
     * @return the exception value.
     */
    public String exception() {
        return this.exception;
    }

    /**
     * Set the exception property: The exceptions that occurred while running the sync job.
     *
     * @param exception the exception value to set.
     * @return the SourceControlSyncJobByIdInner object itself.
     */
    public SourceControlSyncJobByIdInner withException(String exception) {
        this.exception = exception;
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
