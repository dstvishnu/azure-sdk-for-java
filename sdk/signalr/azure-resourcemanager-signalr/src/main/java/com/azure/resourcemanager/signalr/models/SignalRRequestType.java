// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SignalRRequestType. */
public final class SignalRRequestType extends ExpandableStringEnum<SignalRRequestType> {
    /** Static value ClientConnection for SignalRRequestType. */
    public static final SignalRRequestType CLIENT_CONNECTION = fromString("ClientConnection");

    /** Static value ServerConnection for SignalRRequestType. */
    public static final SignalRRequestType SERVER_CONNECTION = fromString("ServerConnection");

    /** Static value RESTAPI for SignalRRequestType. */
    public static final SignalRRequestType RESTAPI = fromString("RESTAPI");

    /** Static value Trace for SignalRRequestType. */
    public static final SignalRRequestType TRACE = fromString("Trace");

    /**
     * Creates or finds a SignalRRequestType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SignalRRequestType.
     */
    @JsonCreator
    public static SignalRRequestType fromString(String name) {
        return fromString(name, SignalRRequestType.class);
    }

    /** @return known SignalRRequestType values. */
    public static Collection<SignalRRequestType> values() {
        return values(SignalRRequestType.class);
    }
}
