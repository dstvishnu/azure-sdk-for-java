/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.PushSettings;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class PushSettingsImpl extends WrapperImpl<PushSettingsInner> implements PushSettings {
    private final AppServiceManager manager;
    PushSettingsImpl(PushSettingsInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String dynamicTagsJson() {
        return this.inner().dynamicTagsJson();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public boolean isPushEnabled() {
        return this.inner().isPushEnabled();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String tagsRequiringAuth() {
        return this.inner().tagsRequiringAuth();
    }

    @Override
    public String tagWhitelistJson() {
        return this.inner().tagWhitelistJson();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
