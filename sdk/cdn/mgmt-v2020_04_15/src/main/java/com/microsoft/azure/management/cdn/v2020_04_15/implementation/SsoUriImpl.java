/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.management.cdn.v2020_04_15.SsoUri;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SsoUriImpl extends WrapperImpl<SsoUriInner> implements SsoUri {
    private final CdnManager manager;
    SsoUriImpl(SsoUriInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public String ssoUriValue() {
        return this.inner().ssoUriValue();
    }

}
