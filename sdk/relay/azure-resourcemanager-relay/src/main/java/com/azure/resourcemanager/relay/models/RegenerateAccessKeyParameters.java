// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the regenerate authorization rule operation, specifies which key neeeds to be reset. */
@Fluent
public final class RegenerateAccessKeyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegenerateAccessKeyParameters.class);

    /*
     * The access key to regenerate.
     */
    @JsonProperty(value = "keyType", required = true)
    private KeyType keyType;

    /*
     * Optional. If the key value is provided, this is set to key type, or
     * autogenerated key value set for key type.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the keyType property: The access key to regenerate.
     *
     * @return the keyType value.
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: The access key to regenerate.
     *
     * @param keyType the keyType value to set.
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Get the key property: Optional. If the key value is provided, this is set to key type, or autogenerated key value
     * set for key type.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Optional. If the key value is provided, this is set to key type, or autogenerated key value
     * set for key type.
     *
     * @param key the key value to set.
     * @return the RegenerateAccessKeyParameters object itself.
     */
    public RegenerateAccessKeyParameters withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyType in model RegenerateAccessKeyParameters"));
        }
    }
}
