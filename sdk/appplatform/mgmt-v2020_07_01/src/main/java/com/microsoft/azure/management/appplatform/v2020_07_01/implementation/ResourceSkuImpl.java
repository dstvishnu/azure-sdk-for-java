/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.microsoft.azure.management.appplatform.v2020_07_01.ResourceSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_07_01.SkuCapacity;
import java.util.List;
import com.microsoft.azure.management.appplatform.v2020_07_01.ResourceSkuLocationInfo;
import com.microsoft.azure.management.appplatform.v2020_07_01.ResourceSkuRestrictions;

class ResourceSkuImpl extends WrapperImpl<ResourceSkuInner> implements ResourceSku {
    private final AppPlatformManager manager;

    ResourceSkuImpl(ResourceSkuInner inner,  AppPlatformManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }



    @Override
    public SkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.inner().locationInfo();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<ResourceSkuRestrictions> restrictions() {
        return this.inner().restrictions();
    }

    @Override
    public String tier() {
        return this.inner().tier();
    }

}