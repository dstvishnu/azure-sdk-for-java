// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.NetworkStatusClient;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractByLocationInner;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkStatusClient. */
public final class NetworkStatusClientImpl implements NetworkStatusClient {
    private final ClientLogger logger = new ClientLogger(NetworkStatusClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final NetworkStatusService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of NetworkStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetworkStatusClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(NetworkStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientNetworkStatus to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientN")
    private interface NetworkStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/networkstatus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<NetworkStatusContractByLocationInner>>> listByService(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/locations/{locationName}/networkstatus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkStatusContractInner>> listByLocation(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("locationName") String locationName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<NetworkStatusContractByLocationInner>>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByService(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<NetworkStatusContractByLocationInner>>> listByServiceWithResponseAsync(
        String resourceGroupName, String serviceName, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByService(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<NetworkStatusContractByLocationInner>> listByServiceAsync(
        String resourceGroupName, String serviceName) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName)
            .flatMap(
                (Response<List<NetworkStatusContractByLocationInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<NetworkStatusContractByLocationInner> listByService(String resourceGroupName, String serviceName) {
        return listByServiceAsync(resourceGroupName, serviceName).block();
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<NetworkStatusContractByLocationInner>> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        return listByServiceWithResponseAsync(resourceGroupName, serviceName, context).block();
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkStatusContractInner>> listByLocationWithResponseAsync(
        String resourceGroupName, String serviceName, String locationName) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            locationName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkStatusContractInner>> listByLocationWithResponseAsync(
        String resourceGroupName, String serviceName, String locationName, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByLocation(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                locationName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NetworkStatusContractInner> listByLocationAsync(
        String resourceGroupName, String serviceName, String locationName) {
        return listByLocationWithResponseAsync(resourceGroupName, serviceName, locationName)
            .flatMap(
                (Response<NetworkStatusContractInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkStatusContractInner listByLocation(
        String resourceGroupName, String serviceName, String locationName) {
        return listByLocationAsync(resourceGroupName, serviceName, locationName).block();
    }

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside
     * the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions
     *     like West US, East US, South Central US.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Connectivity Status to the external resources on which the Api Management service depends from inside
     *     the Cloud Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkStatusContractInner> listByLocationWithResponse(
        String resourceGroupName, String serviceName, String locationName, Context context) {
        return listByLocationWithResponseAsync(resourceGroupName, serviceName, locationName, context).block();
    }
}
