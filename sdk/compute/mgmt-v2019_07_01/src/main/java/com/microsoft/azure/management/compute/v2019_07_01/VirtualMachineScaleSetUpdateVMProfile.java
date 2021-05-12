/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set virtual machine profile.
 */
public class VirtualMachineScaleSetUpdateVMProfile {
    /**
     * The virtual machine scale set OS profile.
     */
    @JsonProperty(value = "osProfile")
    private VirtualMachineScaleSetUpdateOSProfile osProfile;

    /**
     * The virtual machine scale set storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private VirtualMachineScaleSetUpdateStorageProfile storageProfile;

    /**
     * The virtual machine scale set network profile.
     */
    @JsonProperty(value = "networkProfile")
    private VirtualMachineScaleSetUpdateNetworkProfile networkProfile;

    /**
     * The virtual machine scale set diagnostics profile.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * The virtual machine scale set extension profile.
     */
    @JsonProperty(value = "extensionProfile")
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /**
     * The license type, which is for bring your own license scenario.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * Specifies the billing related details of a Azure Spot VMSS.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     */
    @JsonProperty(value = "billingProfile")
    private BillingProfile billingProfile;

    /**
     * Specifies Scheduled Event related configurations.
     */
    @JsonProperty(value = "scheduledEventsProfile")
    private ScheduledEventsProfile scheduledEventsProfile;

    /**
     * Get the virtual machine scale set OS profile.
     *
     * @return the osProfile value
     */
    public VirtualMachineScaleSetUpdateOSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the virtual machine scale set OS profile.
     *
     * @param osProfile the osProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withOsProfile(VirtualMachineScaleSetUpdateOSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the virtual machine scale set storage profile.
     *
     * @return the storageProfile value
     */
    public VirtualMachineScaleSetUpdateStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the virtual machine scale set storage profile.
     *
     * @param storageProfile the storageProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withStorageProfile(VirtualMachineScaleSetUpdateStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the virtual machine scale set network profile.
     *
     * @return the networkProfile value
     */
    public VirtualMachineScaleSetUpdateNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the virtual machine scale set network profile.
     *
     * @param networkProfile the networkProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withNetworkProfile(VirtualMachineScaleSetUpdateNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the virtual machine scale set diagnostics profile.
     *
     * @return the diagnosticsProfile value
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the virtual machine scale set diagnostics profile.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the virtual machine scale set extension profile.
     *
     * @return the extensionProfile value
     */
    public VirtualMachineScaleSetExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the virtual machine scale set extension profile.
     *
     * @param extensionProfile the extensionProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withExtensionProfile(VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
    }

    /**
     * Get the license type, which is for bring your own license scenario.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the license type, which is for bring your own license scenario.
     *
     * @param licenseType the licenseType value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value
     */
    public BillingProfile billingProfile() {
        return this.billingProfile;
    }

    /**
     * Set specifies the billing related details of a Azure Spot VMSS. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param billingProfile the billingProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
        return this;
    }

    /**
     * Get specifies Scheduled Event related configurations.
     *
     * @return the scheduledEventsProfile value
     */
    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }

    /**
     * Set specifies Scheduled Event related configurations.
     *
     * @param scheduledEventsProfile the scheduledEventsProfile value to set
     * @return the VirtualMachineScaleSetUpdateVMProfile object itself.
     */
    public VirtualMachineScaleSetUpdateVMProfile withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        this.scheduledEventsProfile = scheduledEventsProfile;
        return this;
    }

}
