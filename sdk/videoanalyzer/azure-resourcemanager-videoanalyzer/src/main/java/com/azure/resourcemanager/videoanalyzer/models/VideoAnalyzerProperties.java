// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The VideoAnalyzerProperties model. */
@Immutable
public final class VideoAnalyzerProperties extends VideoAnalyzerPropertiesUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoAnalyzerProperties.class);

    /** {@inheritDoc} */
    @Override
    public VideoAnalyzerProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        super.withStorageAccounts(storageAccounts);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoAnalyzerProperties withEncryption(AccountEncryption encryption) {
        super.withEncryption(encryption);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
