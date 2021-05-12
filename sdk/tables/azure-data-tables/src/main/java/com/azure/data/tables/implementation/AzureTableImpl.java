// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureTable type. */
public final class AzureTableImpl {
    /** The URL of the service account or table that is the target of the desired operation. */
    private final String url;

    /**
     * Gets The URL of the service account or table that is the target of the desired operation.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /** Specifies the version of the operation to use for this request. */
    private final String version;

    /**
     * Gets Specifies the version of the operation to use for this request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The TablesImpl object to access its operations. */
    private final TablesImpl tables;

    /**
     * Gets the TablesImpl object to access its operations.
     *
     * @return the TablesImpl object.
     */
    public TablesImpl getTables() {
        return this.tables;
    }

    /** The ServicesImpl object to access its operations. */
    private final ServicesImpl services;

    /**
     * Gets the ServicesImpl object to access its operations.
     *
     * @return the ServicesImpl object.
     */
    public ServicesImpl getServices() {
        return this.services;
    }

    /**
     * Initializes an instance of AzureTable client.
     *
     * @param url The URL of the service account or table that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    AzureTableImpl(String url, String version) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                url,
                version);
    }

    /**
     * Initializes an instance of AzureTable client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param url The URL of the service account or table that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    AzureTableImpl(HttpPipeline httpPipeline, String url, String version) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), url, version);
    }

    /**
     * Initializes an instance of AzureTable client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param url The URL of the service account or table that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    AzureTableImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String url, String version) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.url = url;
        this.version = version;
        this.tables = new TablesImpl(this);
        this.services = new ServicesImpl(this);
    }
}
