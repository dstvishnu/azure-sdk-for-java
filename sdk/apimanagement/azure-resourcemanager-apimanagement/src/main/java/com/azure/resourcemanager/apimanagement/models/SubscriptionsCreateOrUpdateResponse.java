// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionContractInner;

/** Contains all response data for the createOrUpdate operation. */
public final class SubscriptionsCreateOrUpdateResponse
    extends ResponseBase<SubscriptionsCreateOrUpdateHeaders, SubscriptionContractInner> {
    /**
     * Creates an instance of SubscriptionsCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this SubscriptionsCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SubscriptionsCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        SubscriptionContractInner value,
        SubscriptionsCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public SubscriptionContractInner getValue() {
        return super.getValue();
    }
}
