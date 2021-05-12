// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the create Advanced Schedule. */
@Fluent
public final class AdvancedSchedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdvancedSchedule.class);

    /*
     * Days of the week that the job should execute on.
     */
    @JsonProperty(value = "weekDays")
    private List<String> weekDays;

    /*
     * Days of the month that the job should execute on. Must be between 1 and
     * 31.
     */
    @JsonProperty(value = "monthDays")
    private List<Integer> monthDays;

    /*
     * Occurrences of days within a month.
     */
    @JsonProperty(value = "monthlyOccurrences")
    private List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences;

    /**
     * Get the weekDays property: Days of the week that the job should execute on.
     *
     * @return the weekDays value.
     */
    public List<String> weekDays() {
        return this.weekDays;
    }

    /**
     * Set the weekDays property: Days of the week that the job should execute on.
     *
     * @param weekDays the weekDays value to set.
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withWeekDays(List<String> weekDays) {
        this.weekDays = weekDays;
        return this;
    }

    /**
     * Get the monthDays property: Days of the month that the job should execute on. Must be between 1 and 31.
     *
     * @return the monthDays value.
     */
    public List<Integer> monthDays() {
        return this.monthDays;
    }

    /**
     * Set the monthDays property: Days of the month that the job should execute on. Must be between 1 and 31.
     *
     * @param monthDays the monthDays value to set.
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withMonthDays(List<Integer> monthDays) {
        this.monthDays = monthDays;
        return this;
    }

    /**
     * Get the monthlyOccurrences property: Occurrences of days within a month.
     *
     * @return the monthlyOccurrences value.
     */
    public List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences() {
        return this.monthlyOccurrences;
    }

    /**
     * Set the monthlyOccurrences property: Occurrences of days within a month.
     *
     * @param monthlyOccurrences the monthlyOccurrences value to set.
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withMonthlyOccurrences(List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences) {
        this.monthlyOccurrences = monthlyOccurrences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monthlyOccurrences() != null) {
            monthlyOccurrences().forEach(e -> e.validate());
        }
    }
}
