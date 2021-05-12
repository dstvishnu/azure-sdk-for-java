/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SamplingType.
 */
public final class SamplingType extends ExpandableStringEnum<SamplingType> {
    /** Static value fixed for SamplingType. */
    public static final SamplingType FIXED = fromString("fixed");

    /**
     * Creates or finds a SamplingType from its string representation.
     * @param name a name to look for
     * @return the corresponding SamplingType
     */
    @JsonCreator
    public static SamplingType fromString(String name) {
        return fromString(name, SamplingType.class);
    }

    /**
     * @return known SamplingType values
     */
    public static Collection<SamplingType> values() {
        return values(SamplingType.class);
    }
}
