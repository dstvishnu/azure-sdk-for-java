/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12.implementation;

import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachineExtensionPropertiesInstanceView;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a Machine Extension.
 */
@JsonFlatten
public class MachineExtensionInner extends Resource {
    /**
     * How the extension handler should be forced to update even if the
     * extension configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /**
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.publisher")
    private String publisher;

    /**
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "properties.type")
    private String machineExtensionType;

    /**
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "properties.typeHandlerVersion")
    private String typeHandlerVersion;

    /**
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "properties.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /**
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.settings")
    private Object settings;

    /**
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    @JsonProperty(value = "properties.protectedSettings")
    private Object protectedSettings;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The machine extension instance view.
     */
    @JsonProperty(value = "properties.instanceView")
    private MachineExtensionPropertiesInstanceView instanceView;

    /**
     * Get how the extension handler should be forced to update even if the extension configuration has not changed.
     *
     * @return the forceUpdateTag value
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set how the extension handler should be forced to update even if the extension configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the name of the extension handler publisher.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the name of the extension handler publisher.
     *
     * @param publisher the publisher value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the machineExtensionType value
     */
    public String machineExtensionType() {
        return this.machineExtensionType;
    }

    /**
     * Set specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param machineExtensionType the machineExtensionType value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withMachineExtensionType(String machineExtensionType) {
        this.machineExtensionType = machineExtensionType;
        return this;
    }

    /**
     * Get specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get json formatted public settings for the extension.
     *
     * @return the settings value
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set json formatted public settings for the extension.
     *
     * @param settings the settings value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the machine extension instance view.
     *
     * @return the instanceView value
     */
    public MachineExtensionPropertiesInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Set the machine extension instance view.
     *
     * @param instanceView the instanceView value to set
     * @return the MachineExtensionInner object itself.
     */
    public MachineExtensionInner withInstanceView(MachineExtensionPropertiesInstanceView instanceView) {
        this.instanceView = instanceView;
        return this;
    }

}
