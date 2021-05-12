// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.resourcemanager.netapp.fluent.models.ReplicationStatusInner;

/** An immutable client-side representation of ReplicationStatus. */
public interface ReplicationStatus {
    /**
     * Gets the healthy property: Replication health check.
     *
     * @return the healthy value.
     */
    Boolean healthy();

    /**
     * Gets the relationshipStatus property: Status of the mirror relationship.
     *
     * @return the relationshipStatus value.
     */
    RelationshipStatus relationshipStatus();

    /**
     * Gets the mirrorState property: The status of the replication.
     *
     * @return the mirrorState value.
     */
    MirrorState mirrorState();

    /**
     * Gets the totalProgress property: The progress of the replication.
     *
     * @return the totalProgress value.
     */
    String totalProgress();

    /**
     * Gets the errorMessage property: Displays error message if the replication is in an error state.
     *
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.ReplicationStatusInner object.
     *
     * @return the inner object.
     */
    ReplicationStatusInner innerModel();
}
