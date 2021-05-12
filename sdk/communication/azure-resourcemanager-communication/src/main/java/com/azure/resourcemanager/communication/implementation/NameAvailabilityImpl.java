// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.resourcemanager.communication.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.communication.models.NameAvailability;

public final class NameAvailabilityImpl implements NameAvailability {
    private NameAvailabilityInner innerObject;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

    NameAvailabilityImpl(
        NameAvailabilityInner innerObject,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NameAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }
}
