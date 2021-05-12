/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RestoreMode.
 */
public final class RestoreMode extends ExpandableStringEnum<RestoreMode> {
    /** Static value PointInTime for RestoreMode. */
    public static final RestoreMode POINT_IN_TIME = fromString("PointInTime");

    /**
     * Creates or finds a RestoreMode from its string representation.
     * @param name a name to look for
     * @return the corresponding RestoreMode
     */
    @JsonCreator
    public static RestoreMode fromString(String name) {
        return fromString(name, RestoreMode.class);
    }

    /**
     * @return known RestoreMode values
     */
    public static Collection<RestoreMode> values() {
        return values(RestoreMode.class);
    }
}
