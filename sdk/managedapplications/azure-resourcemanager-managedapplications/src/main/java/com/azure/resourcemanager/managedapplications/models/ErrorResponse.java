// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates managed application is not able to process the incoming request. The reason is provided in
 * the error message.
 */
@Fluent
public final class ErrorResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorResponse.class);

    /*
     * Http status code.
     */
    @JsonProperty(value = "httpStatus")
    private String httpStatus;

    /*
     * Error code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the httpStatus property: Http status code.
     *
     * @return the httpStatus value.
     */
    public String httpStatus() {
        return this.httpStatus;
    }

    /**
     * Set the httpStatus property: Http status code.
     *
     * @param httpStatus the httpStatus value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    /**
     * Get the errorCode property: Error code.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code.
     *
     * @param errorCode the errorCode value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: Error message indicating why the operation failed.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message indicating why the operation failed.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
