/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WindowsVMGuestPatchMode.
 */
public final class WindowsVMGuestPatchMode extends ExpandableStringEnum<WindowsVMGuestPatchMode> {
    /** Static value Manual for WindowsVMGuestPatchMode. */
    public static final WindowsVMGuestPatchMode MANUAL = fromString("Manual");

    /** Static value AutomaticByOS for WindowsVMGuestPatchMode. */
    public static final WindowsVMGuestPatchMode AUTOMATIC_BY_OS = fromString("AutomaticByOS");

    /** Static value AutomaticByPlatform for WindowsVMGuestPatchMode. */
    public static final WindowsVMGuestPatchMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates or finds a WindowsVMGuestPatchMode from its string representation.
     * @param name a name to look for
     * @return the corresponding WindowsVMGuestPatchMode
     */
    @JsonCreator
    public static WindowsVMGuestPatchMode fromString(String name) {
        return fromString(name, WindowsVMGuestPatchMode.class);
    }

    /**
     * @return known WindowsVMGuestPatchMode values
     */
    public static Collection<WindowsVMGuestPatchMode> values() {
        return values(WindowsVMGuestPatchMode.class);
    }
}
