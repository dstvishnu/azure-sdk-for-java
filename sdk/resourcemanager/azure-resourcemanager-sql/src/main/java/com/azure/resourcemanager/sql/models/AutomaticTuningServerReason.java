// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AutomaticTuningServerReason. */
public enum AutomaticTuningServerReason {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value AutoConfigured. */
    AUTO_CONFIGURED("AutoConfigured");

    /** The actual serialized value for a AutomaticTuningServerReason instance. */
    private final String value;

    AutomaticTuningServerReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutomaticTuningServerReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutomaticTuningServerReason object, or null if unable to parse.
     */
    @JsonCreator
    public static AutomaticTuningServerReason fromString(String value) {
        AutomaticTuningServerReason[] items = AutomaticTuningServerReason.values();
        for (AutomaticTuningServerReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
