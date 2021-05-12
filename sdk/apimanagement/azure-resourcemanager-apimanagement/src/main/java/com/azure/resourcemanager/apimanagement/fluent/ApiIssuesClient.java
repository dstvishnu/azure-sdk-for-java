// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesGetResponse;
import com.azure.resourcemanager.apimanagement.models.ApiIssuesUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.IssueUpdateContract;

/** An instance of this class provides access to all the operations defined in ApiIssuesClient. */
public interface ApiIssuesClient {
    /**
     * Lists all issues associated with the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Issue list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IssueContractInner> listByService(String resourceGroupName, String serviceName, String apiId);

    /**
     * Lists all issues associated with the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| userId | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;.
     * @param expandCommentsAttachments Expand the comment attachments.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Issue list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IssueContractInner> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Boolean expandCommentsAttachments,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Gets the entity state (Etag) version of the Issue for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String apiId, String issueId);

    /**
     * Gets the entity state (Etag) version of the Issue for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the Issue for an API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiIssuesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, Context context);

    /**
     * Gets the details of the Issue for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Issue for an API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IssueContractInner get(String resourceGroupName, String serviceName, String apiId, String issueId);

    /**
     * Gets the details of the Issue for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param expandCommentsAttachments Expand the comment attachments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the Issue for an API specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiIssuesGetResponse getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        Boolean expandCommentsAttachments,
        Context context);

    /**
     * Creates a new Issue for an API or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return issue Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IssueContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String apiId, String issueId, IssueContractInner parameters);

    /**
     * Creates a new Issue for an API or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return issue Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiIssuesCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        IssueContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates an existing issue for an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return issue Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IssueContractInner update(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String ifMatch,
        IssueUpdateContract parameters);

    /**
     * Updates an existing issue for an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return issue Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiIssuesUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String issueId,
        String ifMatch,
        IssueUpdateContract parameters,
        Context context);

    /**
     * Deletes the specified Issue from an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String apiId, String issueId, String ifMatch);

    /**
     * Deletes the specified Issue from an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param issueId Issue identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String apiId, String issueId, String ifMatch, Context context);
}
