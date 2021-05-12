// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.EventsOperationsClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.EventInner;
import com.azure.resourcemanager.resourcehealth.models.Events;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EventsOperationsClient. */
public final class EventsOperationsClientImpl implements EventsOperationsClient {
    private final ClientLogger logger = new ClientLogger(EventsOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final EventsOperationsService service;

    /** The service client containing this operation class. */
    private final MicrosoftResourceHealthImpl client;

    /**
     * Initializes an instance of EventsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EventsOperationsClientImpl(MicrosoftResourceHealthImpl client) {
        this.service =
            RestProxy.create(EventsOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftResourceHealthEventsOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftResourceHea")
    private interface EventsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("view") String view,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.ResourceHealth/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> listBySingleResource(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            @QueryParam("view") String view,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> listBySubscriptionIdNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Events>> listBySingleResourceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listSinglePageAsync(String filter, String view) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            filter,
                            this.client.getSubscriptionId(),
                            view,
                            accept,
                            context))
            .<PagedResponse<EventInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listSinglePageAsync(String filter, String view, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                filter,
                this.client.getSubscriptionId(),
                view,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync(String filter, String view) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, view), nextLink -> listBySubscriptionIdNextSinglePageAsync(nextLink));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync() {
        final String filter = null;
        final String view = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, view), nextLink -> listBySubscriptionIdNextSinglePageAsync(nextLink));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listAsync(String filter, String view, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, view, context),
            nextLink -> listBySubscriptionIdNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> list() {
        final String filter = null;
        final String view = null;
        return new PagedIterable<>(listAsync(filter, view));
    }

    /**
     * Lists current service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> list(String filter, String view, Context context) {
        return new PagedIterable<>(listAsync(filter, view, context));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySingleResourceSinglePageAsync(
        String resourceUri, String filter, String view) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listBySingleResource(
                            this.client.getEndpoint(),
                            resourceUri,
                            this.client.getApiVersion(),
                            filter,
                            view,
                            accept,
                            context))
            .<PagedResponse<EventInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySingleResourceSinglePageAsync(
        String resourceUri, String filter, String view, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySingleResource(
                this.client.getEndpoint(), resourceUri, this.client.getApiVersion(), filter, view, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listBySingleResourceAsync(String resourceUri, String filter, String view) {
        return new PagedFlux<>(
            () -> listBySingleResourceSinglePageAsync(resourceUri, filter, view),
            nextLink -> listBySingleResourceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listBySingleResourceAsync(String resourceUri) {
        final String filter = null;
        final String view = null;
        return new PagedFlux<>(
            () -> listBySingleResourceSinglePageAsync(resourceUri, filter, view),
            nextLink -> listBySingleResourceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventInner> listBySingleResourceAsync(
        String resourceUri, String filter, String view, Context context) {
        return new PagedFlux<>(
            () -> listBySingleResourceSinglePageAsync(resourceUri, filter, view, context),
            nextLink -> listBySingleResourceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> listBySingleResource(String resourceUri) {
        final String filter = null;
        final String view = null;
        return new PagedIterable<>(listBySingleResourceAsync(resourceUri, filter, view));
    }

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param view setting view=full expands the article parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventInner> listBySingleResource(
        String resourceUri, String filter, String view, Context context) {
        return new PagedIterable<>(listBySingleResourceAsync(resourceUri, filter, view, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySubscriptionIdNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listBySubscriptionIdNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySubscriptionIdNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySubscriptionIdNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySingleResourceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listBySingleResourceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventInner>> listBySingleResourceNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySingleResourceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
