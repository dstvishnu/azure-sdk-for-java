// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Api request input for LogAnalytics getRequestRateByInterval Api. */
@Fluent
public final class RequestRateByIntervalInput extends LogAnalyticsInputBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequestRateByIntervalInput.class);

    /*
     * Interval value in minutes used to create LogAnalytics call rate logs.
     */
    @JsonProperty(value = "intervalLength", required = true)
    private IntervalInMins intervalLength;

    /**
     * Get the intervalLength property: Interval value in minutes used to create LogAnalytics call rate logs.
     *
     * @return the intervalLength value.
     */
    public IntervalInMins intervalLength() {
        return this.intervalLength;
    }

    /**
     * Set the intervalLength property: Interval value in minutes used to create LogAnalytics call rate logs.
     *
     * @param intervalLength the intervalLength value to set.
     * @return the RequestRateByIntervalInput object itself.
     */
    public RequestRateByIntervalInput withIntervalLength(IntervalInMins intervalLength) {
        this.intervalLength = intervalLength;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withBlobContainerSasUri(String blobContainerSasUri) {
        super.withBlobContainerSasUri(blobContainerSasUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withFromTime(OffsetDateTime fromTime) {
        super.withFromTime(fromTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withToTime(OffsetDateTime toTime) {
        super.withToTime(toTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        super.withGroupByThrottlePolicy(groupByThrottlePolicy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withGroupByOperationName(Boolean groupByOperationName) {
        super.withGroupByOperationName(groupByOperationName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withGroupByResourceName(Boolean groupByResourceName) {
        super.withGroupByResourceName(groupByResourceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withGroupByClientApplicationId(Boolean groupByClientApplicationId) {
        super.withGroupByClientApplicationId(groupByClientApplicationId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestRateByIntervalInput withGroupByUserAgent(Boolean groupByUserAgent) {
        super.withGroupByUserAgent(groupByUserAgent);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (intervalLength() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property intervalLength in model RequestRateByIntervalInput"));
        }
    }
}
