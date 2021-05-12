// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainProvisioningState. */
public final class DomainProvisioningState extends ExpandableStringEnum<DomainProvisioningState> {
    /** Static value Creating for DomainProvisioningState. */
    public static final DomainProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for DomainProvisioningState. */
    public static final DomainProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for DomainProvisioningState. */
    public static final DomainProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for DomainProvisioningState. */
    public static final DomainProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for DomainProvisioningState. */
    public static final DomainProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for DomainProvisioningState. */
    public static final DomainProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a DomainProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainProvisioningState.
     */
    @JsonCreator
    public static DomainProvisioningState fromString(String name) {
        return fromString(name, DomainProvisioningState.class);
    }

    /** @return known DomainProvisioningState values. */
    public static Collection<DomainProvisioningState> values() {
        return values(DomainProvisioningState.class);
    }
}
