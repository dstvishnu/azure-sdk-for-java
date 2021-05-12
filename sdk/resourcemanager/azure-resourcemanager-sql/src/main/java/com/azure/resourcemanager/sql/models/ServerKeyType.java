// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerKeyType. */
public final class ServerKeyType extends ExpandableStringEnum<ServerKeyType> {
    /** Static value ServiceManaged for ServerKeyType. */
    public static final ServerKeyType SERVICE_MANAGED = fromString("ServiceManaged");

    /** Static value AzureKeyVault for ServerKeyType. */
    public static final ServerKeyType AZURE_KEY_VAULT = fromString("AzureKeyVault");

    /**
     * Creates or finds a ServerKeyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerKeyType.
     */
    @JsonCreator
    public static ServerKeyType fromString(String name) {
        return fromString(name, ServerKeyType.class);
    }

    /** @return known ServerKeyType values. */
    public static Collection<ServerKeyType> values() {
        return values(ServerKeyType.class);
    }
}
