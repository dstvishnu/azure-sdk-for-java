// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.fluent.models.PrivateLinkResourcesInner;
import com.azure.resourcemanager.iothub.models.GroupIdInformation;
import com.azure.resourcemanager.iothub.models.PrivateLinkResources;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private PrivateLinkResourcesInner innerObject;

    private final IotHubManager serviceManager;

    PrivateLinkResourcesImpl(PrivateLinkResourcesInner innerObject, IotHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GroupIdInformation> value() {
        List<GroupIdInformationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GroupIdInformationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourcesInner innerModel() {
        return this.innerObject;
    }

    private IotHubManager manager() {
        return this.serviceManager;
    }
}
