/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VMScaleSetConvertToSinglePlacementGroupInput model.
 */
public class VMScaleSetConvertToSinglePlacementGroupInput {
    /**
     * Id of the placement group in which you want future virtual machine
     * instances to be placed. To query placement group Id, please use Virtual
     * Machine Scale Set VMs - Get API. If not provided, the platform will
     * choose one with maximum number of virtual machine instances.
     */
    @JsonProperty(value = "activePlacementGroupId")
    private String activePlacementGroupId;

    /**
     * Get id of the placement group in which you want future virtual machine instances to be placed. To query placement group Id, please use Virtual Machine Scale Set VMs - Get API. If not provided, the platform will choose one with maximum number of virtual machine instances.
     *
     * @return the activePlacementGroupId value
     */
    public String activePlacementGroupId() {
        return this.activePlacementGroupId;
    }

    /**
     * Set id of the placement group in which you want future virtual machine instances to be placed. To query placement group Id, please use Virtual Machine Scale Set VMs - Get API. If not provided, the platform will choose one with maximum number of virtual machine instances.
     *
     * @param activePlacementGroupId the activePlacementGroupId value to set
     * @return the VMScaleSetConvertToSinglePlacementGroupInput object itself.
     */
    public VMScaleSetConvertToSinglePlacementGroupInput withActivePlacementGroupId(String activePlacementGroupId) {
        this.activePlacementGroupId = activePlacementGroupId;
        return this;
    }

}
