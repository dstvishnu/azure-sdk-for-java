// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AsyncOperationState. */
public enum AsyncOperationState {
    /** Enum value InProgress. */
    IN_PROGRESS("InProgress"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a AsyncOperationState instance. */
    private final String value;

    AsyncOperationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AsyncOperationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AsyncOperationState object, or null if unable to parse.
     */
    @JsonCreator
    public static AsyncOperationState fromString(String value) {
        AsyncOperationState[] items = AsyncOperationState.values();
        for (AsyncOperationState item : items) {
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
