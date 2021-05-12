// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.WorkspaceSqlAadAdminsClient;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceAadAdminInfoInner;
import com.azure.resourcemanager.synapse.models.WorkspaceAadAdminInfo;
import com.azure.resourcemanager.synapse.models.WorkspaceSqlAadAdmins;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceSqlAadAdminsImpl implements WorkspaceSqlAadAdmins {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceSqlAadAdminsImpl.class);

    private final WorkspaceSqlAadAdminsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public WorkspaceSqlAadAdminsImpl(
        WorkspaceSqlAadAdminsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public WorkspaceAadAdminInfo get(String resourceGroupName, String workspaceName) {
        WorkspaceAadAdminInfoInner inner = this.serviceClient().get(resourceGroupName, workspaceName);
        if (inner != null) {
            return new WorkspaceAadAdminInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkspaceAadAdminInfo> getWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<WorkspaceAadAdminInfoInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkspaceAadAdminInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkspaceAadAdminInfo createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo) {
        WorkspaceAadAdminInfoInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, workspaceName, aadAdminInfo);
        if (inner != null) {
            return new WorkspaceAadAdminInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WorkspaceAadAdminInfo createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo, Context context) {
        WorkspaceAadAdminInfoInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, workspaceName, aadAdminInfo, context);
        if (inner != null) {
            return new WorkspaceAadAdminInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String workspaceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName);
    }

    public void delete(String resourceGroupName, String workspaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, context);
    }

    private WorkspaceSqlAadAdminsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
