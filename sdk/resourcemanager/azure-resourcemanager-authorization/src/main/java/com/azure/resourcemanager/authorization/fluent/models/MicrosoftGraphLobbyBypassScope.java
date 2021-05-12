// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphLobbyBypassScope. */
public final class MicrosoftGraphLobbyBypassScope extends ExpandableStringEnum<MicrosoftGraphLobbyBypassScope> {
    /** Static value organizer for MicrosoftGraphLobbyBypassScope. */
    public static final MicrosoftGraphLobbyBypassScope ORGANIZER = fromString("organizer");

    /** Static value organization for MicrosoftGraphLobbyBypassScope. */
    public static final MicrosoftGraphLobbyBypassScope ORGANIZATION = fromString("organization");

    /** Static value organizationAndFederated for MicrosoftGraphLobbyBypassScope. */
    public static final MicrosoftGraphLobbyBypassScope ORGANIZATION_AND_FEDERATED =
        fromString("organizationAndFederated");

    /** Static value everyone for MicrosoftGraphLobbyBypassScope. */
    public static final MicrosoftGraphLobbyBypassScope EVERYONE = fromString("everyone");

    /** Static value unknownFutureValue for MicrosoftGraphLobbyBypassScope. */
    public static final MicrosoftGraphLobbyBypassScope UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphLobbyBypassScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphLobbyBypassScope.
     */
    @JsonCreator
    public static MicrosoftGraphLobbyBypassScope fromString(String name) {
        return fromString(name, MicrosoftGraphLobbyBypassScope.class);
    }

    /** @return known MicrosoftGraphLobbyBypassScope values. */
    public static Collection<MicrosoftGraphLobbyBypassScope> values() {
        return values(MicrosoftGraphLobbyBypassScope.class);
    }
}
