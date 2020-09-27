// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.CapabilitiesClient;
import com.azure.resourcemanager.sql.fluent.models.LocationCapabilitiesInner;
import com.azure.resourcemanager.sql.models.CapabilityGroup;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CapabilitiesClient. */
public final class CapabilitiesClientImpl implements CapabilitiesClient {
    private final ClientLogger logger = new ClientLogger(CapabilitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final CapabilitiesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of CapabilitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CapabilitiesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(CapabilitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientCapabilities to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientC")
    private interface CapabilitiesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/capabilities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LocationCapabilitiesInner>> listByLocation(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @QueryParam("include") CapabilityGroup include,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LocationCapabilitiesInner>> listByLocationWithResponseAsync(
        String locationName, CapabilityGroup include) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getEndpoint(),
                            locationName,
                            include,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LocationCapabilitiesInner>> listByLocationWithResponseAsync(
        String locationName, CapabilityGroup include, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01-preview";
        context = this.client.mergeContext(context);
        return service
            .listByLocation(
                this.client.getEndpoint(), locationName, include, this.client.getSubscriptionId(), apiVersion, context);
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocationCapabilitiesInner> listByLocationAsync(String locationName, CapabilityGroup include) {
        return listByLocationWithResponseAsync(locationName, include)
            .flatMap(
                (Response<LocationCapabilitiesInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LocationCapabilitiesInner> listByLocationAsync(String locationName) {
        final CapabilityGroup include = null;
        return listByLocationWithResponseAsync(locationName, include)
            .flatMap(
                (Response<LocationCapabilitiesInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocationCapabilitiesInner listByLocation(String locationName) {
        final CapabilityGroup include = null;
        return listByLocationAsync(locationName, include).block();
    }

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocationCapabilitiesInner> listByLocationWithResponse(
        String locationName, CapabilityGroup include, Context context) {
        return listByLocationWithResponseAsync(locationName, include, context).block();
    }
}