// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.ListNotebookKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ListWorkspaceKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.models.ListNotebookKeysResult;
import com.azure.resourcemanager.machinelearningservices.models.ListWorkspaceKeysResult;
import com.azure.resourcemanager.machinelearningservices.models.RegistryListCredentialsResult;

public final class ListWorkspaceKeysResultImpl implements ListWorkspaceKeysResult {
    private ListWorkspaceKeysResultInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    ListWorkspaceKeysResultImpl(
        ListWorkspaceKeysResultInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String userStorageKey() {
        return this.innerModel().userStorageKey();
    }

    public String userStorageResourceId() {
        return this.innerModel().userStorageResourceId();
    }

    public String appInsightsInstrumentationKey() {
        return this.innerModel().appInsightsInstrumentationKey();
    }

    public RegistryListCredentialsResult containerRegistryCredentials() {
        return this.innerModel().containerRegistryCredentials();
    }

    public ListNotebookKeysResult notebookAccessKeys() {
        ListNotebookKeysResultInner inner = this.innerModel().notebookAccessKeys();
        if (inner != null) {
            return new ListNotebookKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListWorkspaceKeysResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
