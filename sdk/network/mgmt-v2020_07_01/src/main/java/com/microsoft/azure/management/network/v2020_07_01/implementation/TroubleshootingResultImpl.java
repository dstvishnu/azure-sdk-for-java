/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.TroubleshootingResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.TroubleshootingDetails;

class TroubleshootingResultImpl extends WrapperImpl<TroubleshootingResultInner> implements TroubleshootingResult {
    private final NetworkManager manager;
    TroubleshootingResultImpl(TroubleshootingResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public List<TroubleshootingDetails> results() {
        return this.inner().results();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

}
