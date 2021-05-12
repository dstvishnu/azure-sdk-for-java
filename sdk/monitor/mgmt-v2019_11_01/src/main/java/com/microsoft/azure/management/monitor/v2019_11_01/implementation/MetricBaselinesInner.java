/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.monitor.v2019_11_01.ErrorResponseException;
import com.microsoft.azure.management.monitor.v2019_11_01.ResultType;
import com.microsoft.azure.management.monitor.v2019_11_01.TimeSeriesInformation;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.Period;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MetricBaselines.
 */
public class MetricBaselinesInner {
    /** The Retrofit service to perform REST calls. */
    private MetricBaselinesService service;
    /** The service client containing this operation class. */
    private MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricBaselinesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricBaselinesInner(Retrofit retrofit, MonitorManagementClientImpl client) {
        this.service = retrofit.create(MetricBaselinesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricBaselines to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricBaselinesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2019_11_01.MetricBaselines get" })
        @GET("{resourceUri}/providers/microsoft.insights/baseline/{metricName}")
        Observable<Response<ResponseBody>> get(@Path(value = "resourceUri", encoded = true) String resourceUri, @Path("metricName") String metricName, @Query("timespan") String timespan, @Query("interval") Period interval, @Query("aggregation") String aggregation, @Query("sensitivities") String sensitivities, @Query("resultType") ResultType resultType1, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.monitor.v2019_11_01.MetricBaselines calculateBaseline" })
        @POST("{resourceUri}/providers/microsoft.insights/calculatebaseline")
        Observable<Response<ResponseBody>> calculateBaseline(@Path(value = "resourceUri", encoded = true) String resourceUri, @Query("api-version") String apiVersion, @Body TimeSeriesInformation timeSeriesInformation, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BaselineResponseInner object if successful.
     */
    public BaselineResponseInner get(String resourceUri, String metricName) {
        return getWithServiceResponseAsync(resourceUri, metricName).toBlocking().single().body();
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BaselineResponseInner> getAsync(String resourceUri, String metricName, final ServiceCallback<BaselineResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceUri, metricName), serviceCallback);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BaselineResponseInner object
     */
    public Observable<BaselineResponseInner> getAsync(String resourceUri, String metricName) {
        return getWithServiceResponseAsync(resourceUri, metricName).map(new Func1<ServiceResponse<BaselineResponseInner>, BaselineResponseInner>() {
            @Override
            public BaselineResponseInner call(ServiceResponse<BaselineResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BaselineResponseInner object
     */
    public Observable<ServiceResponse<BaselineResponseInner>> getWithServiceResponseAsync(String resourceUri, String metricName) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (metricName == null) {
            throw new IllegalArgumentException("Parameter metricName is required and cannot be null.");
        }
        final String apiVersion = "2017-11-01-preview";
        final String timespan = null;
        final Period interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final ResultType resultType = null;
        return service.get(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BaselineResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<BaselineResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BaselineResponseInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved. Possible values include: 'Data', 'Metadata'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BaselineResponseInner object if successful.
     */
    public BaselineResponseInner get(String resourceUri, String metricName, String timespan, Period interval, String aggregation, String sensitivities, ResultType resultType) {
        return getWithServiceResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).toBlocking().single().body();
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved. Possible values include: 'Data', 'Metadata'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BaselineResponseInner> getAsync(String resourceUri, String metricName, String timespan, Period interval, String aggregation, String sensitivities, ResultType resultType, final ServiceCallback<BaselineResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType), serviceCallback);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved. Possible values include: 'Data', 'Metadata'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BaselineResponseInner object
     */
    public Observable<BaselineResponseInner> getAsync(String resourceUri, String metricName, String timespan, Period interval, String aggregation, String sensitivities, ResultType resultType) {
        return getWithServiceResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).map(new Func1<ServiceResponse<BaselineResponseInner>, BaselineResponseInner>() {
            @Override
            public BaselineResponseInner call(ServiceResponse<BaselineResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved. Possible values include: 'Data', 'Metadata'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BaselineResponseInner object
     */
    public Observable<ServiceResponse<BaselineResponseInner>> getWithServiceResponseAsync(String resourceUri, String metricName, String timespan, Period interval, String aggregation, String sensitivities, ResultType resultType) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (metricName == null) {
            throw new IllegalArgumentException("Parameter metricName is required and cannot be null.");
        }
        final String apiVersion = "2017-11-01-preview";
        return service.get(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BaselineResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<BaselineResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BaselineResponseInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BaselineResponseInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BaselineResponseInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BaselineResponseInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param timeSeriesInformation Information that need to be specified to calculate a baseline on a time series.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CalculateBaselineResponseInner object if successful.
     */
    public CalculateBaselineResponseInner calculateBaseline(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineWithServiceResponseAsync(resourceUri, timeSeriesInformation).toBlocking().single().body();
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param timeSeriesInformation Information that need to be specified to calculate a baseline on a time series.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CalculateBaselineResponseInner> calculateBaselineAsync(String resourceUri, TimeSeriesInformation timeSeriesInformation, final ServiceCallback<CalculateBaselineResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(calculateBaselineWithServiceResponseAsync(resourceUri, timeSeriesInformation), serviceCallback);
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param timeSeriesInformation Information that need to be specified to calculate a baseline on a time series.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CalculateBaselineResponseInner object
     */
    public Observable<CalculateBaselineResponseInner> calculateBaselineAsync(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineWithServiceResponseAsync(resourceUri, timeSeriesInformation).map(new Func1<ServiceResponse<CalculateBaselineResponseInner>, CalculateBaselineResponseInner>() {
            @Override
            public CalculateBaselineResponseInner call(ServiceResponse<CalculateBaselineResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure: subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}. For example: subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1
     * @param timeSeriesInformation Information that need to be specified to calculate a baseline on a time series.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CalculateBaselineResponseInner object
     */
    public Observable<ServiceResponse<CalculateBaselineResponseInner>> calculateBaselineWithServiceResponseAsync(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        if (resourceUri == null) {
            throw new IllegalArgumentException("Parameter resourceUri is required and cannot be null.");
        }
        if (timeSeriesInformation == null) {
            throw new IllegalArgumentException("Parameter timeSeriesInformation is required and cannot be null.");
        }
        Validator.validate(timeSeriesInformation);
        final String apiVersion = "2017-11-01-preview";
        return service.calculateBaseline(resourceUri, apiVersion, timeSeriesInformation, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CalculateBaselineResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<CalculateBaselineResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CalculateBaselineResponseInner> clientResponse = calculateBaselineDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CalculateBaselineResponseInner> calculateBaselineDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CalculateBaselineResponseInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CalculateBaselineResponseInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
