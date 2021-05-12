// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.CertificateContractInner;

/** Contains all response data for the get operation. */
public final class CertificatesGetResponse extends ResponseBase<CertificatesGetHeaders, CertificateContractInner> {
    /**
     * Creates an instance of CertificatesGetResponse.
     *
     * @param request the request which resulted in this CertificatesGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public CertificatesGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        CertificateContractInner value,
        CertificatesGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public CertificateContractInner getValue() {
        return super.getValue();
    }
}
