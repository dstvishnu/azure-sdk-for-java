// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the IP tag associated with the public IP address. */
@Fluent
public final class VirtualMachineScaleSetIpTag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetIpTag.class);

    /*
     * IP tag type. Example: FirstPartyUsage.
     */
    @JsonProperty(value = "ipTagType")
    private String ipTagType;

    /*
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the ipTagType property: IP tag type. Example: FirstPartyUsage.
     *
     * @return the ipTagType value.
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the ipTagType property: IP tag type. Example: FirstPartyUsage.
     *
     * @param ipTagType the ipTagType value to set.
     * @return the VirtualMachineScaleSetIpTag object itself.
     */
    public VirtualMachineScaleSetIpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the tag property: IP tag associated with the public IP. Example: SQL, Storage etc.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: IP tag associated with the public IP. Example: SQL, Storage etc.
     *
     * @param tag the tag value to set.
     * @return the VirtualMachineScaleSetIpTag object itself.
     */
    public VirtualMachineScaleSetIpTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
