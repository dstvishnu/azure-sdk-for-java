/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates Front Door service is not able to process the
 * incoming request. The reason is provided in the error message.
 */
public class ErrorResponse {
    /**
     * Error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get error message indicating why the operation failed.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
