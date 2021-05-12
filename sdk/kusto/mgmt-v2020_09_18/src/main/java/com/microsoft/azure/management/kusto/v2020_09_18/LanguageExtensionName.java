/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LanguageExtensionName.
 */
public final class LanguageExtensionName extends ExpandableStringEnum<LanguageExtensionName> {
    /** Static value PYTHON for LanguageExtensionName. */
    public static final LanguageExtensionName PYTHON = fromString("PYTHON");

    /** Static value R for LanguageExtensionName. */
    public static final LanguageExtensionName R = fromString("R");

    /**
     * Creates or finds a LanguageExtensionName from its string representation.
     * @param name a name to look for
     * @return the corresponding LanguageExtensionName
     */
    @JsonCreator
    public static LanguageExtensionName fromString(String name) {
        return fromString(name, LanguageExtensionName.class);
    }

    /**
     * @return known LanguageExtensionName values
     */
    public static Collection<LanguageExtensionName> values() {
        return values(LanguageExtensionName.class);
    }
}
