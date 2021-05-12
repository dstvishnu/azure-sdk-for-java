// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntropyMode. */
public final class EntropyMode extends ExpandableStringEnum<EntropyMode> {
    /** Static value Cabac for EntropyMode. */
    public static final EntropyMode CABAC = fromString("Cabac");

    /** Static value Cavlc for EntropyMode. */
    public static final EntropyMode CAVLC = fromString("Cavlc");

    /**
     * Creates or finds a EntropyMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntropyMode.
     */
    @JsonCreator
    public static EntropyMode fromString(String name) {
        return fromString(name, EntropyMode.class);
    }

    /** @return known EntropyMode values. */
    public static Collection<EntropyMode> values() {
        return values(EntropyMode.class);
    }
}
