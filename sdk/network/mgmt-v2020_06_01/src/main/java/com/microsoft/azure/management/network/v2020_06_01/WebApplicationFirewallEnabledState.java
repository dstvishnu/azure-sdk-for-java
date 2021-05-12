/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebApplicationFirewallEnabledState.
 */
public final class WebApplicationFirewallEnabledState extends ExpandableStringEnum<WebApplicationFirewallEnabledState> {
    /** Static value Disabled for WebApplicationFirewallEnabledState. */
    public static final WebApplicationFirewallEnabledState DISABLED = fromString("Disabled");

    /** Static value Enabled for WebApplicationFirewallEnabledState. */
    public static final WebApplicationFirewallEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a WebApplicationFirewallEnabledState from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallEnabledState
     */
    @JsonCreator
    public static WebApplicationFirewallEnabledState fromString(String name) {
        return fromString(name, WebApplicationFirewallEnabledState.class);
    }

    /**
     * @return known WebApplicationFirewallEnabledState values
     */
    public static Collection<WebApplicationFirewallEnabledState> values() {
        return values(WebApplicationFirewallEnabledState.class);
    }
}
