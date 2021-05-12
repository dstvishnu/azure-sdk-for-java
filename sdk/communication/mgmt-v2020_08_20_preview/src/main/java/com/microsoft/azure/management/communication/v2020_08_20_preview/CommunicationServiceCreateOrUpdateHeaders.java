/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for CreateOrUpdate operation.
 */
public class CommunicationServiceCreateOrUpdateHeaders {
    /**
     * URL to query for status of the operation.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Get uRL to query for status of the operation.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set uRL to query for status of the operation.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the CommunicationServiceCreateOrUpdateHeaders object itself.
     */
    public CommunicationServiceCreateOrUpdateHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

}
