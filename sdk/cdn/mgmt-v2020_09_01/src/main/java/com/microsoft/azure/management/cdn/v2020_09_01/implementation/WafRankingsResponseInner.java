/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.WafRankingsResponseDataItem;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Waf Rankings Response.
 */
public class WafRankingsResponseInner {
    /**
     * The dateTimeBegin property.
     */
    @JsonProperty(value = "dateTimeBegin")
    private DateTime dateTimeBegin;

    /**
     * The dateTimeEnd property.
     */
    @JsonProperty(value = "dateTimeEnd")
    private DateTime dateTimeEnd;

    /**
     * The groups property.
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /**
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<WafRankingsResponseDataItem> data;

    /**
     * Get the dateTimeBegin value.
     *
     * @return the dateTimeBegin value
     */
    public DateTime dateTimeBegin() {
        return this.dateTimeBegin;
    }

    /**
     * Set the dateTimeBegin value.
     *
     * @param dateTimeBegin the dateTimeBegin value to set
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeBegin(DateTime dateTimeBegin) {
        this.dateTimeBegin = dateTimeBegin;
        return this;
    }

    /**
     * Get the dateTimeEnd value.
     *
     * @return the dateTimeEnd value
     */
    public DateTime dateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Set the dateTimeEnd value.
     *
     * @param dateTimeEnd the dateTimeEnd value to set
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeEnd(DateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
        return this;
    }

    /**
     * Get the groups value.
     *
     * @return the groups value
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups value.
     *
     * @param groups the groups value to set
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public List<WafRankingsResponseDataItem> data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withData(List<WafRankingsResponseDataItem> data) {
        this.data = data;
        return this;
    }

}
