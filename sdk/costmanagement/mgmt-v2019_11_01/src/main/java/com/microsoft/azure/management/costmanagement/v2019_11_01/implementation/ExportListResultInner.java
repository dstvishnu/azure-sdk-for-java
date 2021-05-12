/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of listing exports. It contains a list of available exports in the
 * scope provided.
 */
public class ExportListResultInner {
    /**
     * The list of exports.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExportInner> value;

    /**
     * Get the list of exports.
     *
     * @return the value value
     */
    public List<ExportInner> value() {
        return this.value;
    }

}
