/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResourceIdentityType.
 */
public enum ResourceIdentityType {
    /** Enum value SystemAssigned. */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /** Enum value UserAssigned. */
    USER_ASSIGNED("UserAssigned"),

    /** Enum value SystemAssigned, UserAssigned. */
    SYSTEM_ASSIGNED_USER_ASSIGNED("SystemAssigned, UserAssigned"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ResourceIdentityType instance. */
    private String value;

    ResourceIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceIdentityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceIdentityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String value) {
        ResourceIdentityType[] items = ResourceIdentityType.values();
        for (ResourceIdentityType item : items) {
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
