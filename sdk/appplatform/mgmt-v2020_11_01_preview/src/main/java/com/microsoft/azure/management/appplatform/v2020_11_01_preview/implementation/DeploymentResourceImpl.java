/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2020_11_01_preview.DeploymentResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.DeploymentResourceProperties;

class DeploymentResourceImpl extends CreatableUpdatableImpl<DeploymentResource, DeploymentResourceInner, DeploymentResourceImpl> implements DeploymentResource, DeploymentResource.Definition, DeploymentResource.Update {
    private final AppPlatformManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String appName;
    private String deploymentName;

    DeploymentResourceImpl(String name, AppPlatformManager manager) {
        super(name, new DeploymentResourceInner());
        this.manager = manager;
        // Set resource name
        this.deploymentName = name;
        //
    }

    DeploymentResourceImpl(DeploymentResourceInner inner, AppPlatformManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.deploymentName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "Spring");
        this.appName = IdParsingUtils.getValueFromIdByName(inner.id(), "apps");
        this.deploymentName = IdParsingUtils.getValueFromIdByName(inner.id(), "deployments");
        //
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DeploymentResource> createResourceAsync() {
        DeploymentsInner client = this.manager().inner().deployments();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.appName, this.deploymentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DeploymentResource> updateResourceAsync() {
        DeploymentsInner client = this.manager().inner().deployments();
        return client.updateAsync(this.resourceGroupName, this.serviceName, this.appName, this.deploymentName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DeploymentResourceInner> getInnerAsync() {
        DeploymentsInner client = this.manager().inner().deployments();
        return client.getAsync(this.resourceGroupName, this.serviceName, this.appName, this.deploymentName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DeploymentResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DeploymentResourceImpl withExistingApp(String resourceGroupName, String serviceName, String appName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.appName = appName;
        return this;
    }

    @Override
    public DeploymentResourceImpl withProperties(DeploymentResourceProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public DeploymentResourceImpl withSku(SkuInner sku) {
        this.inner().withSku(sku);
        return this;
    }

}
