// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataFlowReferenceType. */
public final class DataFlowReferenceType extends ExpandableStringEnum<DataFlowReferenceType> {
    /** Static value DataFlowReference for DataFlowReferenceType. */
    public static final DataFlowReferenceType DATA_FLOW_REFERENCE = fromString("DataFlowReference");

    /**
     * Creates or finds a DataFlowReferenceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataFlowReferenceType.
     */
    @JsonCreator
    public static DataFlowReferenceType fromString(String name) {
        return fromString(name, DataFlowReferenceType.class);
    }

    /** @return known DataFlowReferenceType values. */
    public static Collection<DataFlowReferenceType> values() {
        return values(DataFlowReferenceType.class);
    }
}
