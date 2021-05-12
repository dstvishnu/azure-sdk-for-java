// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.PortalDelegationSettingsInner;
import com.azure.resourcemanager.apimanagement.models.PortalDelegationSettings;
import com.azure.resourcemanager.apimanagement.models.RegistrationDelegationSettingsProperties;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsDelegationSettingsProperties;

public final class PortalDelegationSettingsImpl implements PortalDelegationSettings {
    private PortalDelegationSettingsInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    PortalDelegationSettingsImpl(
        PortalDelegationSettingsInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String url() {
        return this.innerModel().url();
    }

    public String validationKey() {
        return this.innerModel().validationKey();
    }

    public SubscriptionsDelegationSettingsProperties subscriptions() {
        return this.innerModel().subscriptions();
    }

    public RegistrationDelegationSettingsProperties userRegistration() {
        return this.innerModel().userRegistration();
    }

    public PortalDelegationSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
