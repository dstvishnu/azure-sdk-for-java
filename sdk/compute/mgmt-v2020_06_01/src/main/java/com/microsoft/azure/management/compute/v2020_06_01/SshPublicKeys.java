/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.SshPublicKeysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SshPublicKeys.
 */
public interface SshPublicKeys extends SupportsCreating<SshPublicKeyResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<SshPublicKeyResource>, SupportsListingByResourceGroup<SshPublicKeyResource>, SupportsListing<SshPublicKeyResource>, HasInner<SshPublicKeysInner> {
    /**
     * Generates and returns a public/private key pair and populates the SSH public key resource with the public key. The length of the key will be 3072 bits. This operation can only be performed once per SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SshPublicKeyGenerateKeyPairResult> generateKeyPairAsync(String resourceGroupName, String sshPublicKeyName);

}
