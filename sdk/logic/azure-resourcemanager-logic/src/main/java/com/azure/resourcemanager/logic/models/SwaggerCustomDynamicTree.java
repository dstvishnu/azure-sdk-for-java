// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The swagger custom dynamic tree. */
@Fluent
public final class SwaggerCustomDynamicTree {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwaggerCustomDynamicTree.class);

    /*
     * The tree settings
     */
    @JsonProperty(value = "settings")
    private SwaggerCustomDynamicTreeSettings settings;

    /*
     * The tree on-open configuration
     */
    @JsonProperty(value = "open")
    private SwaggerCustomDynamicTreeCommand open;

    /*
     * The tree on-browse configuration
     */
    @JsonProperty(value = "browse")
    private SwaggerCustomDynamicTreeCommand browse;

    /**
     * Get the settings property: The tree settings.
     *
     * @return the settings value.
     */
    public SwaggerCustomDynamicTreeSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: The tree settings.
     *
     * @param settings the settings value to set.
     * @return the SwaggerCustomDynamicTree object itself.
     */
    public SwaggerCustomDynamicTree withSettings(SwaggerCustomDynamicTreeSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the open property: The tree on-open configuration.
     *
     * @return the open value.
     */
    public SwaggerCustomDynamicTreeCommand open() {
        return this.open;
    }

    /**
     * Set the open property: The tree on-open configuration.
     *
     * @param open the open value to set.
     * @return the SwaggerCustomDynamicTree object itself.
     */
    public SwaggerCustomDynamicTree withOpen(SwaggerCustomDynamicTreeCommand open) {
        this.open = open;
        return this;
    }

    /**
     * Get the browse property: The tree on-browse configuration.
     *
     * @return the browse value.
     */
    public SwaggerCustomDynamicTreeCommand browse() {
        return this.browse;
    }

    /**
     * Set the browse property: The tree on-browse configuration.
     *
     * @param browse the browse value to set.
     * @return the SwaggerCustomDynamicTree object itself.
     */
    public SwaggerCustomDynamicTree withBrowse(SwaggerCustomDynamicTreeCommand browse) {
        this.browse = browse;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (settings() != null) {
            settings().validate();
        }
        if (open() != null) {
            open().validate();
        }
        if (browse() != null) {
            browse().validate();
        }
    }
}
