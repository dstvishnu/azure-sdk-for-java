// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static site zip deployment ARM resource. */
@JsonFlatten
@Fluent
public class StaticSiteZipDeploymentArmResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSiteZipDeploymentArmResource.class);

    /*
     * URL for the zipped app content
     */
    @JsonProperty(value = "properties.appZipUrl")
    private String appZipUrl;

    /*
     * URL for the zipped api content
     */
    @JsonProperty(value = "properties.apiZipUrl")
    private String apiZipUrl;

    /*
     * A title to label the deployment
     */
    @JsonProperty(value = "properties.deploymentTitle")
    private String deploymentTitle;

    /*
     * The provider submitting this deployment
     */
    @JsonProperty(value = "properties.provider")
    private String provider;

    /*
     * The language of the api content, if it exists
     */
    @JsonProperty(value = "properties.functionLanguage")
    private String functionLanguage;

    /**
     * Get the appZipUrl property: URL for the zipped app content.
     *
     * @return the appZipUrl value.
     */
    public String appZipUrl() {
        return this.appZipUrl;
    }

    /**
     * Set the appZipUrl property: URL for the zipped app content.
     *
     * @param appZipUrl the appZipUrl value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withAppZipUrl(String appZipUrl) {
        this.appZipUrl = appZipUrl;
        return this;
    }

    /**
     * Get the apiZipUrl property: URL for the zipped api content.
     *
     * @return the apiZipUrl value.
     */
    public String apiZipUrl() {
        return this.apiZipUrl;
    }

    /**
     * Set the apiZipUrl property: URL for the zipped api content.
     *
     * @param apiZipUrl the apiZipUrl value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withApiZipUrl(String apiZipUrl) {
        this.apiZipUrl = apiZipUrl;
        return this;
    }

    /**
     * Get the deploymentTitle property: A title to label the deployment.
     *
     * @return the deploymentTitle value.
     */
    public String deploymentTitle() {
        return this.deploymentTitle;
    }

    /**
     * Set the deploymentTitle property: A title to label the deployment.
     *
     * @param deploymentTitle the deploymentTitle value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withDeploymentTitle(String deploymentTitle) {
        this.deploymentTitle = deploymentTitle;
        return this;
    }

    /**
     * Get the provider property: The provider submitting this deployment.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The provider submitting this deployment.
     *
     * @param provider the provider value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the functionLanguage property: The language of the api content, if it exists.
     *
     * @return the functionLanguage value.
     */
    public String functionLanguage() {
        return this.functionLanguage;
    }

    /**
     * Set the functionLanguage property: The language of the api content, if it exists.
     *
     * @param functionLanguage the functionLanguage value to set.
     * @return the StaticSiteZipDeploymentArmResource object itself.
     */
    public StaticSiteZipDeploymentArmResource withFunctionLanguage(String functionLanguage) {
        this.functionLanguage = functionLanguage;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteZipDeploymentArmResource withKind(String kind) {
        super.withKind(kind);
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
