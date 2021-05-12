/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.ValidateSecretOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.Status;

class ValidateSecretOutputImpl extends WrapperImpl<ValidateSecretOutputInner> implements ValidateSecretOutput {
    private final CdnManager manager;
    ValidateSecretOutputImpl(ValidateSecretOutputInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Status status() {
        return this.inner().status();
    }

}
